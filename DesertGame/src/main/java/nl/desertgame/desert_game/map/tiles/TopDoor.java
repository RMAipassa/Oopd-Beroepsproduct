package nl.desertgame.desert_game.map.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class TopDoor extends SpriteEntity implements Collider {
    public TopDoor(Coordinate2D coordinate2D, Size size, String resource) {
        super(resource, coordinate2D, size);
    }
}
