package nl.desertgame.desert_game.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.impl.DynamicTextEntity;
import com.github.hanyaeger.api.entities.impl.TextEntity;

public class Text extends DynamicTextEntity {
    public Text(Coordinate2D initialLocation, String text) {
        super(initialLocation, text);
    }

}
