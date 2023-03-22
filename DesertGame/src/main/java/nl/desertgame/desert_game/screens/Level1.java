package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Image;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.entities.Text;
import nl.desertgame.desert_game.map.FakeChestMap;
import nl.desertgame.desert_game.map.StartMap;


public class Level1 extends DynamicScene implements TileMapContainer {
    private DesertGame desertGame;

    public Level1(DesertGame desertGame) {
        this.desertGame = desertGame;
    }

    @Override
    public void setupScene() {
        setBackgroundColor(Color.BLACK);
    }

    @Override
    public void setupEntities() {
        Player player;
        player = new Player(new Coordinate2D(50, 320));
        addEntity(player);
        setupPotions(player);
//        setupHearts(player);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new StartMap());
    }

    public void setupPotions(Player player) {
        Image potions = new Image("sprites/potion.png", new Coordinate2D(50, 50), new Size(32, 32));
        addEntity(potions);
        var amountPotion = new Text(new Coordinate2D(80, 52), player.getPotions() + "x");
        amountPotion.setFill(Color.WHITE);
        amountPotion.setFont(Font.font("Roboto", FontWeight.BOLD, 20));
        addEntity(amountPotion);
    }
}
//    public void setupHearts(Player player) {
//        int amountHearts;
//        if (desertGame.difficulty == 0) {
//            amountHearts = 5;
//        } else if (desertGame.difficulty == 1) {
//            amountHearts = 4;
//        } else {
//            amountHearts = 3;
//        }
//        Hearts = new array[amountHearts];
//        for(int i = 0; i<amountHearts; i++){
//
//        }
//    }
//}
