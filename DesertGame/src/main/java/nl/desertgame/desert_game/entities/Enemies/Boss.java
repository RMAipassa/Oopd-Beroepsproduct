package nl.desertgame.desert_game.entities.Enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Boss extends DynamicSpriteEntity implements Enemy{
    public Boss(Coordinate2D initialLocation) {
        super("sprites/Enemies/mummy boss.png", initialLocation, new Size(28,52),2,2);
    }



}
