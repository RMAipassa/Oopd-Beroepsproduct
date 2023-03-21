package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Image;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.entities.Text;


public class GameScreen extends DynamicScene {
    private DesertGame desertGame;

    public GameScreen(DesertGame desertGame) {
        this.desertGame = desertGame;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/titlescreen.png");
    }

    @Override
    public void setupEntities() {
        Player player;
        player = new Player(new Coordinate2D(50, 50));
        addEntity(player);
        setupPotions(player);
//        setupHearts(player);
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
