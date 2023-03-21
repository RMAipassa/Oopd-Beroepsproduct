package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.buttons.SceneSwitcherButton;
import nl.desertgame.desert_game.entities.Image;

public class TitleScene extends StaticScene {
    private DesertGame desertGame;

    public TitleScene(DesertGame desertGame){
        this.desertGame = desertGame;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/titlescreen_background.png");
    }

    @Override
    public void setupEntities() {
        Image titleImage = new Image("sprites/title.png", new Coordinate2D(getWidth() / 2, 50));
        addEntity(titleImage);
        var startButton = new SceneSwitcherButton(new Coordinate2D(380,250),"Start Game",1,this.desertGame);
        startButton.setFill(Color.WHITE);
        startButton.setFont(Font.font("Roboto", FontWeight.BOLD, 45));
        startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(startButton);
    }

}