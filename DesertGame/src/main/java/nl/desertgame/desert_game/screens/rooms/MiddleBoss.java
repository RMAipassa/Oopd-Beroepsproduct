package nl.desertgame.desert_game.screens.rooms;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Heart;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.map.MidMap;
import nl.desertgame.desert_game.screens.GameScreen;

import java.util.ArrayList;

public class MiddleBoss extends GameScreen implements TileMapContainer {
    private DesertGame desertGame;
    private ArrayList<Heart> Hearts;

    public MiddleBoss(DesertGame desertGame) {
        super(desertGame);
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
        Player player;
        player = new Player(desertGame ,this,new Coordinate2D(620, 585));
        addEntity(player);
    }
    public void setupHearts() {
        Hearts = new ArrayList<Heart>();
        for(int i = 0; i< GameScreen.getTotalHealth(); i++){
            Heart heart = new Heart("sprites/heart.png",new Coordinate2D(50+(i*20),30),new Size(20,20),1,2);
            Hearts.add(heart);
            addEntity(heart);
        }
    }
}
