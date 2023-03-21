package nl.desertgame.desert_game.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Image extends DynamicSpriteEntity {


    public Image(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }
}
