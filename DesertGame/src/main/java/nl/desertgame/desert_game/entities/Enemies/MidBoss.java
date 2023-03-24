package nl.desertgame.desert_game.entities.Enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;


public class MidBoss extends DynamicSpriteEntity implements Enemy{
    protected MidBoss(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }
}
