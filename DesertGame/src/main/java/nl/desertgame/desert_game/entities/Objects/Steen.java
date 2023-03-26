package nl.desertgame.desert_game.entities.Objects;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Steen extends SpriteEntity implements Object {
    protected Steen(Coordinate2D initialLocation, String resource) {
        super(resource, initialLocation);
    }
    public String[] textures = {
            "sprites/Objects/Boulder.png",
            "sprites/Objects/Steen.png",
    };

    public  String[] getTextures(){
        return textures;
    }
}
