package nl.desertgame.desert_game.entities.Enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import nl.desertgame.desert_game.entities.Objects.Object;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.entities.Weapons.Bullet;
import nl.desertgame.desert_game.entities.Weapons.Projectile;

public class Enemy extends DynamicSpriteEntity implements Collider, Collided, UpdateExposer{
    private int health;
    public Enemy(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation, new Size(28,52),2,2);
    }

    public  Coordinate2D getMonsterLocation(){
            return getAnchorLocation();
        }

        @Override
        public double angleTo(Coordinate2D otherLocation) {
            return super.angleTo(otherLocation);
        }

        public void onCollision(Collider collidingObjects) {
        }

        private void doDamage(int i) {
        }

        @Override
        public void explicitUpdate(long l) {
        }

        public int getHealth(){
            return health;
        }

        @Override
        public void notifyRemove() {
            super.notifyRemove();
        }

        public void move(double direction) {
        }
}
