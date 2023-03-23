package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.buttons.DifficultySwitcherButton;
import nl.desertgame.desert_game.buttons.SceneSwitcherButton;
import nl.desertgame.desert_game.entities.Image;

public class TitleScene extends StaticScene {
    private DesertGame desertGame;
    public int difficulty;

    public TitleScene(DesertGame desertGame){
        this.desertGame = desertGame;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/titlescreen.png");
    }

    @Override
    public void setupEntities() {
        Image titleImage = new Image("sprites/title.png", new Coordinate2D(getWidth() / 2, 50));
        titleImage.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(titleImage);
        var startButton = new SceneSwitcherButton(new Coordinate2D(380,250),"Start Game",1,this.desertGame);
        startButton.setFill(Color.WHITE);
        startButton.setFont(Font.font("Roboto", FontWeight.BOLD, 45));
        startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(startButton);
        var difButton = new DifficultySwitcherButton(new Coordinate2D(370,350),this.desertGame);
        difButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        difButton.setFill(Color.WHITE);
        difButton.setFont(Font.font("Roboto", FontWeight.BOLD, 40));
        addEntity(difButton);
    }

}