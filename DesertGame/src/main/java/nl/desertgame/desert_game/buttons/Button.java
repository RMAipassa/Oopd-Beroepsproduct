package nl.desertgame.desert_game.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.paint.Color;

public abstract class Button extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    public Button(Coordinate2D initialLocation, String text) {
        super(initialLocation, text);
    }
    @Override
    public void onMouseEntered(){
        setFill(Color.LIGHTGRAY);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited(){
        setFill(Color.WHITE);
        setCursor(Cursor.DEFAULT);
    }
}
