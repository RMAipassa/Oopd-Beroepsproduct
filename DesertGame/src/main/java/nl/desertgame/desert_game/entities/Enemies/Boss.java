package nl.desertgame.desert_game.entities.Enemies;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import nl.desertgame.desert_game.entities.Objects.Object;
import nl.desertgame.desert_game.entities.Player;


public class Boss extends DynamicSpriteEntity implements Enemy, Collided, UpdateExposer {
    private static boolean isColliding = false;
    private static boolean withObject = true;
    private static Coordinate2D init;
    public Boss(Coordinate2D initialLocation) {
        super("sprites/Enemies/mummy boss.png", initialLocation, new Size(28,52),2,2);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        init = initialLocation;
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
            System.out.println("hit player");
            isColliding = true;
        } else if(collidingObjects instanceof Object){
            System.out.println("hit box");
            withObject = true;
            setMotion(0,0);
        }
    }
    @Override
    public void explicitUpdate(long l) {
        if (isColliding) {
        }
        isColliding = false;
        withObject = false;
    }





    public void moveboss(double direction) {
        if (isColliding){
            if(withObject){
                setMotion(0,direction);
            }
            setMotion(-150, -direction);
        } else{
            setMotion(2, direction);
        }
    }
}
