package nl.desertgame.desert_game.entities.Objects;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Barrel extends SpriteEntity implements Object {
    public Barrel(Coordinate2D initialLocation) {
        super("sprites/Objects/barrel.png", initialLocation);
    }
}
