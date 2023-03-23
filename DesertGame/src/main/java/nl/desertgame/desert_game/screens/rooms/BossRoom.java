package nl.desertgame.desert_game.screens.rooms;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.map.BossMap;
import nl.desertgame.desert_game.screens.GameScreen;

public class BossRoom extends GameScreen implements TileMapContainer {

    private DesertGame desertGame;

    public BossRoom(DesertGame desertGame) {
        super(desertGame);
        this.desertGame = desertGame;
    }
    @Override
    public void setupTileMaps() {
        addTileMap(new BossMap());
    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.BLACK);
    }

    @Override
    public void setupEntities() {
        Player player;
        player = new Player(desertGame ,this,new Coordinate2D(1230, 320));
        addEntity(player);
    }
}
