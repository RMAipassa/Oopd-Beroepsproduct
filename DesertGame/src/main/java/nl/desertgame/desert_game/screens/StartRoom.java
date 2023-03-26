package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.*;
import nl.desertgame.desert_game.entities.Enemies.Boss;
import nl.desertgame.desert_game.entities.Objects.Box;
import nl.desertgame.desert_game.map.StartMap;
import nl.desertgame.desert_game.entities.Weapons.Bullet;
import java.util.ArrayList;


public class StartRoom extends DynamicScene implements TileMapContainer, UpdateExposer, MouseButtonPressedListener {
    private DesertGame desertGame;
    private static Text amountPotion;
    private static Player player;
    private static Heart[] hearts;

    public static Boss EndBoss = new Boss(new Coordinate2D(640, 320));
    public int amountHearts;

    public StartRoom(DesertGame desertGame) {
        this.desertGame = desertGame;
    }

    @Override
    public void setupScene() {
//        setBackgroundColor(Color.BLACK);
    }

    @Override
    public void setupEntities() {
        addEntity(EndBoss);
        addEntity(new Box(new Coordinate2D(340,550)));
        player = new Player(desertGame ,new Coordinate2D(50, 320));
        addEntity(player);
        setupPotions();
        setupHearts();
    }

    public void setupPotions() {
        Image potions = new Image("sprites/potion.png", new Coordinate2D(50, 50), new Size(32, 32));
        addEntity(potions);
        amountPotion = new Text(new Coordinate2D(80, 52), Player.getPotions() + "x");
        amountPotion.setFill(Color.WHITE);
        amountPotion.setFont(Font.font("Roboto", FontWeight.BOLD, 20));
        addEntity(amountPotion);
    }
    public static void updatePotions(){
        amountPotion.setText(Player.getPotions()+"x");
    }
    public static void updateHearts() {
        int currentHealth = Player.getHealth();
        for (int i = 0; i < hearts.length; i++) {
            if (i < currentHealth) {
                hearts[i].setCurrentFrameIndex(0); // heart is full
            } else {
                hearts[i].setCurrentFrameIndex(1); // heart is empty
            }
        }
    }

    public void setupHearts() {
        if (desertGame.difficulty == 0) {
            Player.setTotalHealth(5);
            Player.setHealth(5);
        } else if (desertGame.difficulty == 1) {
            Player.setTotalHealth(4);
            Player.setHealth(4);
        } else {
            Player.setTotalHealth(3);
            Player.setHealth(3);
        }
        hearts = new Heart[Player.getTotalHealth()];
        for(int i = 0; i < Player.getTotalHealth(); i++) {
            Heart heart = new Heart("sprites/heart.png", new Coordinate2D(50+(i*20),30), new Size(20,20), 1, 2);
            hearts[i] = heart;
            addEntity(heart);
        }
    }



    public static Coordinate2D getPlayerLocation(){
        return player.getAnchorLocation();
    }
    public  Coordinate2D getBossLocation(){
        return EndBoss.getAnchorLocation();
    }

    @Override
    public void explicitUpdate(long l) {
//        EndBoss.moveboss(EndBoss.angleTo(player));
    }
    @Override
    public void setupTileMaps() {
        addTileMap(new StartMap());
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        Bullet bullet = new Bullet(getPlayerLocation());
       addEntity(bullet);
       bullet.moveBullet(player.angleTo(coordinate2D));
    }
}



