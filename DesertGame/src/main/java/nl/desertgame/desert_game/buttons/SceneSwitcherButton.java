package nl.desertgame.desert_game.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import javafx.scene.input.MouseButton;
import nl.desertgame.desert_game.DesertGame;

public class SceneSwitcherButton extends Button {
    private final DesertGame desertGame;
    private int scene;

    public SceneSwitcherButton(Coordinate2D initialLocation, String text, int scene, DesertGame desertGame) {
        super(initialLocation, text);
        this.scene = scene;
        this.desertGame = desertGame;
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
        desertGame.setActiveScene(scene);
    }
}
