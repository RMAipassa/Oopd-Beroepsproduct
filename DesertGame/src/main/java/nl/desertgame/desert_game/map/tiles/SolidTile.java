package nl.desertgame.desert_game.map.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class SolidTile extends SpriteEntity implements Collider {


    private  static final String[] textures ={
            "sprites/SolidTiles/TopDoor.png",
            "sprites/SolidTiles/RightDoor.png",
            "sprites/SolidTiles/BottomDoor.png",
            "sprites/SolidTiles/LeftDoor.png",
            "sprites/SolidTiles/TopWall.png",
            "sprites/SolidTiles/TopBricks.png",
            "sprites/SolidTiles/RightWall.png",
            "sprites/SolidTiles/RightBricks.png",
            "sprites/SolidTiles/BottomWall.png",
            "sprites/SolidTiles/BottomBricks.png",
            "sprites/SolidTiles/LeftWall.png",
            "sprites/SolidTiles/LeftBricks.png",
            "sprites/SolidTiles/Top Left Corner.png",
            "sprites/SolidTiles/Top Right Corner.png",
            "sprites/SolidTiles/Bottom Right Corner.png",
            "sprites/SolidTiles/Bottom Left Corner.png",
            "sprites/SolidTiles/Boss door.png",
            "sprites/SolidTiles/leftBoss.png",
            "sprites/SolidTiles/rightBoss.png",
            "sprites/SolidTiles/KeyDoor.png",
            "sprites/SolidTiles/LeftKey.png",
            "sprites/SolidTiles/RightKey.png",
            "sprites/SolidTiles/closedDoor.png"
    };

    /**
    * @param coordinate2D
     * @param size
     * @param resource
     *
     * Author:
     * using yeager parameters
     * creates a floor tile
     */
    public SolidTile(Coordinate2D coordinate2D, Size size, String resource) {
        super(resource, coordinate2D, size);
    }

    public static String[] getTextures() {
        return textures;
    }
}
