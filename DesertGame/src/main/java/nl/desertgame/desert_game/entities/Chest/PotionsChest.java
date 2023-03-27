package nl.desertgame.desert_game.entities.Chest;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class PotionsChest extends SpriteEntity implements Collider {
    protected PotionsChest(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }
}
