package nl.desertgame.desert_game.screens.rooms;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Inventory;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.map.FakeChestMap;
import nl.desertgame.desert_game.screens.GameScreen;

public class FakeChestRoom extends GameScreen implements TileMapContainer, Inventory {

    private DesertGame desertGame;

    public FakeChestRoom(DesertGame desertGame) {
        super(desertGame);
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
        player = new Player(desertGame ,this,new Coordinate2D(640, 60));
        addEntity(player);
    }

    @Override
    public void updatePotions() {

    }

    @Override
    public void updateHearts() {

    }
}
