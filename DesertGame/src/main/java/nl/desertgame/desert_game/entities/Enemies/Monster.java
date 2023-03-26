package nl.desertgame.desert_game.entities.Enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Monster extends DynamicSpriteEntity implements Enemy {

    protected Monster(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }
}
