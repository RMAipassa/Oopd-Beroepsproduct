package nl.desertgame.desert_game.entities.Enemies;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.map.tiles.SolidTile;

public class Boss extends DynamicSpriteEntity implements Enemy, Collided, UpdateExposer {
    private static boolean isColliding = false;
    public Boss(Coordinate2D initialLocation) {
        super("sprites/Enemies/mummy boss.png", initialLocation, new Size(28,52),2,2);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }

    public  Coordinate2D getBossLocation(){
        return getAnchorLocation();
    }

    @Override
    public double angleTo(Coordinate2D otherLocation) {
        return super.angleTo(otherLocation);
    }


    public void onCollision(Collider collidingObjects) {
        if (collidingObjects instanceof Player) {
            isColliding = true;


        }
    }
    @Override
    public void explicitUpdate(long l) {
        if (isColliding) {
        }
        isColliding = false;
    }

    public void moveboss(double direction) {
        if (isColliding){
            System.out.println("colliding");
            for(int i = 0; i<10000; i++) {
                setMotion(10, -direction);
            }
            setMotion(0,0);
        } else{
            setMotion(2, direction);
        }
    }
}
