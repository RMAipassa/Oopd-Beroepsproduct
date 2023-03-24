package nl.desertgame.desert_game.entities.Objects;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Box extends SpriteEntity implements Object {
    protected Box(Coordinate2D initialLocation, String resource ) {
        super(resource, initialLocation);
    }
    public String[] textures = {
            "sprites/Objects/box.png",
            "sprites/Objects/boxes.png",
    };

    public  String[] getTextures(){
        return textures;
    }
}
