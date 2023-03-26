package nl.desertgame.desert_game.entities.Weapons;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import com.github.hanyaeger.core.entities.Removable;
import nl.desertgame.desert_game.entities.Player;

public class Bullet extends DynamicSpriteEntity implements Projectile, Collider, Collided ,MouseButtonPressedListener {
    public Bullet(Coordinate2D initialLocation) {
        super("sprites/Weapons/bullet.png", initialLocation);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }


    public void moveBullet(Double direction){
        setMotion(5, direction);

    }
    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }

    @Override
    public void notifyRemove() {
        super.notifyRemove();
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof Player){

        } else {
            remove();
        }
    }
}
