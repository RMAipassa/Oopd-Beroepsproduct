package nl.desertgame.desert_game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class DesertGame extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Desert Game");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScene());
    }
}
