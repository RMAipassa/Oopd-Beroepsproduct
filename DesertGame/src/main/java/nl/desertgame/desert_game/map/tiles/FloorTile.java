package nl.desertgame.desert_game.map.tiles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class FloorTile extends SpriteEntity {

    private  static final String[] textures ={
            "sprites/Floortiles/Top Left Tile.png",
            "sprites/Floortiles/Top Right Tile.png",
            "sprites/Floortiles/Bottom Right Tile.png",
            "sprites/Floortiles/Bottom Left Tile.png",
            "sprites/Floortiles/Floor.png",
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
    public FloorTile(Coordinate2D coordinate2D, Size size, String resource) {
        super(resource, coordinate2D, size);
    }

    public static String[] getTextures() {
        return textures;
    }
}
