package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import nl.desertgame.desert_game.DesertGame;
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
    }
}
