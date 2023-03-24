package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Heart;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.map.MidMap;

import java.util.ArrayList;

public class MiddleBoss extends DynamicScene implements TileMapContainer {
    private DesertGame desertGame;
    private static Player player;
    private static ArrayList<Heart> Hearts;

    public MiddleBoss(DesertGame desertGame) {
        this.desertGame = desertGame;
    }
    @Override
    public void setupTileMaps() {
        addTileMap(new MidMap());
    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.BLACK);
    }

    @Override
    public void setupEntities() {
        player = new Player(desertGame ,new Coordinate2D(620, 585));
        addEntity(player);
        setupHearts();
    }
    public void setupHearts() {
        Hearts = new ArrayList<Heart>();
        for(int i = 0; i< player.getHealth(); i++){
            Heart heart = new Heart("sprites/heart.png",new Coordinate2D(50+(i*20),30),new Size(20,20),1,2);
            Hearts.add(heart);
            System.out.println("HELP");
            addEntity(heart);
        }
    }

    public static void updateHearts(){
        int index;
        if(Hearts.size() > player.getHealth()){
            index = player.getHealth() ;
            Hearts.get(index).setCurrentFrameIndex(1);
        } else if (Hearts.size() < player.getHealth()){
            index = player.getHealth() ;
            Hearts.get(index).setCurrentFrameIndex(2);
        }
    }
}
