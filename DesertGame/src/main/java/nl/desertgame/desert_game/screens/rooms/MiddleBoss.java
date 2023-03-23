package nl.desertgame.desert_game.screens.rooms;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Inventory;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.map.MidMap;
import nl.desertgame.desert_game.screens.GameScreen;

public class MiddleBoss extends GameScreen implements TileMapContainer, Inventory {
    private DesertGame desertGame;

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

    @Override
    public void updatePotions() {

    }

    @Override
    public void updateHearts() {

    }
}
