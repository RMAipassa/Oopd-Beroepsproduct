package nl.desertgame.desert_game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import nl.desertgame.desert_game.screens.GameScreen;
import nl.desertgame.desert_game.screens.TitleScene;
import nl.desertgame.desert_game.screens.GameOverScreen;
import nl.desertgame.desert_game.screens.VictoryScreen;


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
        addScene(1, new GameScreen(this));
        addScene(2, new GameOverScreen(this));
        addScene(3, new VictoryScreen(this));
    }

}
