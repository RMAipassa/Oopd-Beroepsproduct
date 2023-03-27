package nl.desertgame.desert_game.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class DoorKey extends SpriteEntity implements Collider {
    public DoorKey(Coordinate2D initialLocation) {
        super("sprites/Treasure/key.png", initialLocation, new Size(32,16));
    }

    @Override
    public void notifyRemove() {
        super.notifyRemove();
    }
}
