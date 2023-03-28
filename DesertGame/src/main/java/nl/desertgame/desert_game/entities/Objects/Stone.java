package nl.desertgame.desert_game.entities.Objects;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Stone extends SpriteEntity implements Object {
    public Stone(Coordinate2D initialLocation) {
        super("sprites/Objects/Boulder.png", initialLocation);
    }
}
