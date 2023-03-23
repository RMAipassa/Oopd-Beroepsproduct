package nl.desertgame.desert_game.map.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class ExitTile extends SpriteEntity implements Collider {

    private static String[] textures = {
            "sprites/SolidTiles/TopDoor.png",
            "sprites/SolidTiles/RightDoor.png",
            "sprites/SolidTiles/BottomDoor.png",
            "sprites/LeftDoor.png",
    };
    public ExitTile(Coordinate2D coordinate2D, Size size, String resource) {
        super(resource, coordinate2D, size);
    }
    public static String[] getTextures() {
        return textures;
    }
}
