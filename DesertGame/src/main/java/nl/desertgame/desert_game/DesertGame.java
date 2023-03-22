package nl.desertgame.desert_game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import nl.desertgame.desert_game.screens.*;
import nl.desertgame.desert_game.entities.Player;


public class DesertGame extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }
    public int difficulty;

    @Override
    public void setupGame() {
        setGameTitle("Desert Game");
        setSize(new Size(1280, 640));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScene(this));
        addScene(1, new Level1(this));
        addScene(2, new Level2(this));
        addScene(3, new Level3(this));
        addScene(4, new Level4(this));
        addScene(5, new Level5(this));
        addScene(6, new GameOverScreen(this));
        addScene(7, new VictoryScreen(this));
    }

}
