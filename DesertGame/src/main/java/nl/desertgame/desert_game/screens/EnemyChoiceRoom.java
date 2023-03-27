package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Enemies.Bat;
import nl.desertgame.desert_game.entities.Enemies.Crab;
import nl.desertgame.desert_game.entities.Enemies.Enemy;
import nl.desertgame.desert_game.entities.Enemies.Mummy;
import nl.desertgame.desert_game.entities.Heart;
import nl.desertgame.desert_game.entities.Image;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.entities.Text;
import nl.desertgame.desert_game.entities.Weapons.Bullet;
import nl.desertgame.desert_game.entities.Weapons.Projectile;
import nl.desertgame.desert_game.map.RoomMap;

import static nl.desertgame.desert_game.entities.Player.getTotalHealth;


public class EnemyChoiceRoom extends DynamicScene implements TileMapContainer, UpdateExposer, MouseButtonPressedListener {

    private DesertGame desertGame;
    private static Player player;
    private static Heart[] hearts;
    private  static Text amountPotion;
    private int monstersdefeated = 0;
    private Enemy[] enemies = {
            new Crab(new Coordinate2D(960,400)),
            new Bat(new Coordinate2D(480,200)),
            new Bat(new Coordinate2D(780,300))
    };

    public EnemyChoiceRoom(DesertGame desertGame) {
        this.desertGame = desertGame;
    }
    @Override
    public void setupTileMaps(){
        addTileMap(new RoomMap());
    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.BLACK);
    }

    @Override
    public void setupEntities() {
        addEntity(enemies[0]);
        addEntity(enemies[1]);
        addEntity(enemies[2]);
        player = new Player(desertGame ,new Coordinate2D(50, 320));
        addEntity(player);
        setupHearts();
        setupPotions();
    }
    public void setupPotions() {
        Image potions = new Image("sprites/potion.png", new Coordinate2D(50, 50), new Size(32, 32));
        addEntity(potions);
        this.amountPotion = new Text(new Coordinate2D(80, 52), Player.getPotions() + "x");
        amountPotion.setFill(Color.WHITE);
        amountPotion.setFont(Font.font("Roboto", FontWeight.BOLD, 20));
        addEntity(amountPotion);
    }
    public static void updatePotions(){
       amountPotion.setText(Player.getPotions()+"x");
    }
    public void setupHearts() {
        hearts = new Heart[getTotalHealth()];
        for(int i = 0; i < getTotalHealth(); i++) {
            Heart heart = new Heart("sprites/heart.png", new Coordinate2D(50+(i*20),30), new Size(20,20), 1, 2);
            hearts[i] = heart;
            addEntity(heart);
        }
        updateHearts();
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
    public static Coordinate2D getPlayerLocation(){
        return player.getAnchorLocation();
    }
    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        Projectile bullet = new Bullet(getPlayerLocation());
        addEntity(bullet);
        bullet.move(player.angleTo(coordinate2D));
    }

    public void explicitUpdate(long l) {
        for(int i = 0; i<enemies.length; i++) {
//            enemies[i].move(enemies[i].angleTo(player));
            if(enemies[i].getHealth() <= 0){
                monstersdefeated++;
                enemies[i].notifyRemove();
            }
        }
        if(monstersdefeated == enemies.length){
            player.setCanOpenDoor();
        }
    }
}
