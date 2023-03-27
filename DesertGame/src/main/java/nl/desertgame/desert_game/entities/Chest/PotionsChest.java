package nl.desertgame.desert_game.entities.Chest;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import nl.desertgame.desert_game.entities.Player;

public class PotionsChest extends SpriteEntity implements Collider, Collided {
    public PotionsChest(Coordinate2D initialLocation) {
        super("sprites/Treasure/WoodTreasure.png", initialLocation);
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof Player) {
            notifyRemove();
        }
    }
}
