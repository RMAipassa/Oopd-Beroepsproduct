package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.map.*;

public class GameScreen extends DynamicScene implements TileMapContainer {


    @Override
    public void setupScene() {
        setBackgroundColor(Color.BLACK);
    }

    @Override
    public void setupEntities() {

    }

    @Override
    public void setupTileMaps() {
        addTileMap(new FloorTileMap());
    }
}
