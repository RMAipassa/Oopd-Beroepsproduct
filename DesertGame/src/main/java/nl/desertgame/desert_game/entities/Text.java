package nl.desertgame.desert_game.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;

public class Text extends TextEntity {
    public Text(Coordinate2D initialLocation, String text) {
        super(initialLocation, text);
    }
}
