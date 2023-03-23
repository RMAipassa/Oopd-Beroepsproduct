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
        addScene(1, new StartRoom(this));
        addScene(2, new EnemyChoiceRoom(this));
        addScene(3, new FakeChestRoom(this));
        addScene(4, new BossRoom(this));
        addScene(5, new MiddleBoss(this));
        addScene(6, new GameOverScreen(this));
        addScene(7, new VictoryScreen(this));
    }

}
