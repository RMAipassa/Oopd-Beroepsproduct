package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.buttons.SceneSwitcherButton;

public class GameOverScreen extends StaticScene {
    private DesertGame desertGame;
    public GameOverScreen(DesertGame desertGame){
        this.desertGame = desertGame;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/gameover.jpg");
    }

    @Override
    public void setupEntities() {
        var againButton = new SceneSwitcherButton(new Coordinate2D(getWidth()/2,500),"Play Again",0,this.desertGame);
        againButton.setFill(Color.RED);
        againButton.setFont(Font.font("Roboto", FontWeight.BOLD, 50));
        againButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(againButton);
    }
}
