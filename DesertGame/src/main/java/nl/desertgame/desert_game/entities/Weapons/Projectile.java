package nl.desertgame.desert_game.entities.Weapons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import nl.desertgame.desert_game.entities.Player;

public class Projectile extends DynamicSpriteEntity implements Collider, Collided {
    protected Projectile(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }

    public void move(Double direction){
        setMotion(5, direction);
    }

    @Override
    public void notifyRemove() {
        super.notifyRemove();
    }

    @Override
    public void onCollision(Collider collider) {
    }
}
