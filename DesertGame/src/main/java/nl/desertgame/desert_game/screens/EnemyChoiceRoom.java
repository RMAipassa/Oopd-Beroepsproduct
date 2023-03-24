package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Heart;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.map.RoomMap;

import static nl.desertgame.desert_game.entities.Player.getTotalHealth;


public class EnemyChoiceRoom extends DynamicScene implements TileMapContainer {

    private DesertGame desertGame;
    private static Player player;
    private static Heart[] hearts;

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
        player = new Player(desertGame ,new Coordinate2D(50, 320));
        addEntity(player);
        setupHearts();
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
        if(hearts.length != currentHealth){
            for (int i = 0; i < hearts.length; i++) {
                if (i < currentHealth) {
                    hearts[i].setCurrentFrameIndex(0); // heart is full
                } else {
                    hearts[i].setCurrentFrameIndex(1); // heart is empty
                }
            }
        }
    }
}
