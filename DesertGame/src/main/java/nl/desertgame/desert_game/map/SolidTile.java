package nl.desertgame.desert_game.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class SolidTile extends SpriteEntity implements Collider {


    private  static final String[] textures ={
            "sprites/TopDoor.png",
            "sprites/RightDoor.png",
            "sprites/BottomDoor.png",
            "sprites/LeftDoor.png",
            "sprites/TopWall.png",
            "sprites/TopBricks.png",
            "sprites/RightWall.png",
            "sprites/RightBricks.png",
            "sprites/BottomWall.png",
            "sprites/BottomBricks.png",
            "sprites/LeftWall.png",
            "sprites/LeftBricks.png",
            "sprites/Top Left Corner.png",
            "sprites/Top Right Corner.png",
            "sprites/Bottom Right Corner.png",
            "sprites/Bottom Left Corner.png",
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
