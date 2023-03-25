package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.buttons.SceneSwitcherButton;
import nl.desertgame.desert_game.entities.Image;

public class VictoryScreen extends StaticScene {
    private DesertGame desertGame;
    public VictoryScreen(DesertGame desertGame){
        this.desertGame = desertGame;
    }
    @Override
    public void setupScene() {
       setBackgroundImage("backgrounds/lootroom.jpg");
    }

    @Override
    public void setupEntities() {
        Image victoryImage = new Image("sprites/victory.png", new Coordinate2D(getWidth() / 2, 50));
        victoryImage.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(victoryImage);
        var againButton = new SceneSwitcherButton(new Coordinate2D(getWidth()/2,getHeight()/2),"Play Again",0,this.desertGame);
        againButton.setFill(Color.WHITE);
        againButton.setFont(Font.font("Roboto", FontWeight.BOLD, 50));
        againButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(againButton);
    }
}
