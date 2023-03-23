package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.map.FakeChestMap;

public class Level4 extends DynamicScene implements TileMapContainer {

    private DesertGame desertGame;

    public Level4(DesertGame desertGame) {
        this.desertGame = desertGame;
    }
    @Override
    public void setupTileMaps() {
        addTileMap(new FakeChestMap());
    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.BLACK);
    }

    @Override
    public void setupEntities() {
        Player player;
        player = new Player(desertGame ,new Coordinate2D(50, 320));
        addEntity(player);
    }
}
