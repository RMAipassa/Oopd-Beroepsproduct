package nl.desertgame.desert_game.entities.Objects;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Box extends SpriteEntity implements Object {
    public Box(Coordinate2D initialLocation) {
        super("sprites/Objects/box.png", initialLocation);
    }
}
