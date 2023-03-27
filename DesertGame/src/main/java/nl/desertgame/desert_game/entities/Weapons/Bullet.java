package nl.desertgame.desert_game.entities.Weapons;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import nl.desertgame.desert_game.entities.Enemies.Enemy;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.screens.EnemyChoiceRoom;

public class Bullet extends Projectile {
    public Bullet(Coordinate2D initialLocation) {
        super("sprites/Weapons/bullet.png", initialLocation);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }


    public void move(Double direction){
        setMotion(6, direction);

    }

    @Override
    public void notifyRemove() {
        super.notifyRemove();
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof Player){

        } else if(collider instanceof Enemy) {
            System.out.println("hit enemy");
            remove();
        }else{

            remove();
        }
    }

}
