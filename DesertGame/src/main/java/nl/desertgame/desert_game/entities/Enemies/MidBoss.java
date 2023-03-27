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
import nl.desertgame.desert_game.entities.Weapons.Projectile;


public class MidBoss extends DynamicSpriteEntity implements Collider, Collided, UpdateExposer {
    private static boolean isColliding = false;
    private static boolean withObject = false;
    private static boolean withMonster = false;
    private int health;
    public MidBoss(Coordinate2D initialLocation) {
        super("sprites/Enemies/Skeleton_Mage_dangerous.png", initialLocation, new Size(56, 104), 2, 2);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        this.health = 50;
    }

    public Coordinate2D getBossLocation() {
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
        } else if (collidingObjects instanceof Object) {
            System.out.println("hit box");
            isColliding = true;

        } else if (collidingObjects instanceof Projectile) {
            doDamage(1);
            System.out.println(getHealth());
        } else if (collidingObjects instanceof Mummy) {
            isColliding = true;
            withMonster = true;
        }
    }

    private void doDamage(int i) {
        this.health = health - i;
    }

    @Override
    public void explicitUpdate(long l) {
        if (isColliding) {
        }
        isColliding = false;
        withObject = false;
        withMonster = false;
    }

    public int getHealth() {
        return this.health;
    }

    @Override
    public void notifyRemove() {
        super.notifyRemove();
    }

    public void move(double direction) {
        if (isColliding) {
            if (withObject) {
                setMotion(0, direction);
            }
            if (withMonster) {
                setMotion(20, -direction);
            } else {
                setMotion(-200, -direction);
            }
        } else {
            setMotion(2, direction);
        }
    }
}
