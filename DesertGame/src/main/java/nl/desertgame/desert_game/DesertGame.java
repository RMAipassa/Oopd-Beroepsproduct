package nl.desertgame.desert_game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
<<<<<<< Updated upstream
=======
import nl.desertgame.desert_game.screens.GameScreen;
import nl.desertgame.desert_game.screens.TitleScene;
import nl.desertgame.desert_game.screens.GameOverScreen;
import nl.desertgame.desert_game.screens.VictoryScreen;
>>>>>>> Stashed changes

public class DesertGame extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Desert Game");
<<<<<<< Updated upstream
        setSize(new Size(800, 600));
=======
        setSize(new Size(1280, 720));
>>>>>>> Stashed changes
    }

    @Override
    public void setupScenes() {
<<<<<<< Updated upstream
        addScene(0, new TitleScene());
=======
        addScene(0, new TitleScene(this));
        addScene(1, new GameScreen());
        addScene(2, new GameOverScreen());
        addScene(3, new VictoryScreen());
>>>>>>> Stashed changes
    }
}
