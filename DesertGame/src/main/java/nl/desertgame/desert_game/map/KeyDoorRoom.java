package nl.desertgame.desert_game.map;

import com.github.hanyaeger.api.scenes.TileMap;
import nl.desertgame.desert_game.map.tiles.FloorTile;
import nl.desertgame.desert_game.map.tiles.Keydoor;
import nl.desertgame.desert_game.map.tiles.SolidTile;

public class KeyDoorRoom extends TileMap {

    private static final int[][] FakeChestMap = {
            {17,9,9,10,9,10,9,9,9,9,9,9,9,9,10,10,9,9,10,5,9,9,10,10,9,9,9,9,10,10,10,10,9,9,10,10,9,10,10,18},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {15,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {16,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {15,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {16,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {27,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {25,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {26,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {15,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {16,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {16,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {15,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {20,13,14,14,13,14,14,13,13,14,13,14,13,13,14,14,14,14,13,14,13,13,14,14,13,14,13,13,14,14,13,13,13,14,14,14,13,14,19},
    };


    @Override
    public void setupEntities() {
        addEntity(1, FloorTile.class, FloorTile.getTextures()[0]); // Top left floor tile
        addEntity(2, FloorTile.class, FloorTile.getTextures()[1]); // top right floor tile
        addEntity(3, FloorTile.class, FloorTile.getTextures()[2]);// bottom left floor tile
        addEntity(4, FloorTile.class, FloorTile.getTextures()[3]);//bottom right floor tile
        addEntity(5, SolidTile.class, SolidTile.getTextures()[0]); // Top door tile
        addEntity(6, SolidTile.class, SolidTile.getTextures()[1]); // Right door tile
        addEntity(7, SolidTile.class, SolidTile.getTextures()[2]);// Bottom door tile
        addEntity(8, SolidTile.class, SolidTile.getTextures()[3]);//Left door tile
        addEntity(9, SolidTile.class, SolidTile.getTextures()[4]); // Top wall  tile
        addEntity(10, SolidTile.class, SolidTile.getTextures()[5]); // top brick wall tile
        addEntity(11, SolidTile.class, SolidTile.getTextures()[6]);// right wall tile
        addEntity(12, SolidTile.class, SolidTile.getTextures()[7]);// right brick wall tile
        addEntity(13, SolidTile.class, SolidTile.getTextures()[8]); // bottom wall tile
        addEntity(14, SolidTile.class, SolidTile.getTextures()[9]); // bottom brick wall tile
        addEntity(15, SolidTile.class, SolidTile.getTextures()[10]);// left wall tile
        addEntity(16, SolidTile.class, SolidTile.getTextures()[11]); //left brick wall tile
        addEntity(17, SolidTile.class, SolidTile.getTextures()[12]); // Top left corner tile
        addEntity(18, SolidTile.class, SolidTile.getTextures()[13]); // top right corner tile
        addEntity(19, SolidTile.class, SolidTile.getTextures()[14]);// bottom right corner tile
        addEntity(20, SolidTile.class, SolidTile.getTextures()[15]);//bottom left corner tile
        addEntity(21, FloorTile.class, FloorTile.getTextures()[4]);//bottom left corner tile
        addEntity(22, SolidTile.class, SolidTile.getTextures()[16]); //bossdoor
        addEntity(23, SolidTile.class, SolidTile.getTextures()[17]); //left boss colum
        addEntity(24, SolidTile.class, SolidTile.getTextures()[18]); // right boss colum
        addEntity(25, Keydoor.class, Keydoor.getTextures()[0]); // Key door
        addEntity(26, Keydoor.class, Keydoor.getTextures()[1]); //left key door
        addEntity(27, Keydoor.class, Keydoor.getTextures()[2]); // right key door
    }

    // x: 40 y:20
    @Override
    public int[][] defineMap() {
        return FakeChestMap;
    }
}
