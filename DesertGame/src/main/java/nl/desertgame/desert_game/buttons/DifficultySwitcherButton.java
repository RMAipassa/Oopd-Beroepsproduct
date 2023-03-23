package nl.desertgame.desert_game.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import javafx.scene.input.MouseButton;
import nl.desertgame.desert_game.DesertGame;

public class DifficultySwitcherButton extends Button {
    private final DesertGame desertGame;
    private int difficulty = 0;
    private String text = "Easy";

    public DifficultySwitcherButton(Coordinate2D initialLocation, DesertGame desertGame) {
        super(initialLocation, "Easy");
        this.difficulty = difficulty;
        this.desertGame = desertGame;
        this.text = text;
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
        if(difficulty == 0){
            difficulty = 1;
            desertGame.difficulty = this.difficulty;
            text = "Medium";
        } else if (difficulty == 1){
            difficulty = 2;
            desertGame.difficulty = this.difficulty;
            text = "Hard";
        } else if (difficulty == 2){
            difficulty = 0;
            desertGame.difficulty = difficulty;
            text = "Easy";
        }
        setText(text);
    }
}
