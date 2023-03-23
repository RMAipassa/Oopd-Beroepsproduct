package nl.desertgame.desert_game.map;

import com.github.hanyaeger.api.scenes.TileMap;
import nl.desertgame.desert_game.map.tiles.ExitTile;
import nl.desertgame.desert_game.map.tiles.FloorTile;
import nl.desertgame.desert_game.map.tiles.Keydoor;
import nl.desertgame.desert_game.map.tiles.SolidTile;

public class StartMap extends TileMap {
    private static final int[][] StartMap = {
//                    {17,9,9,10,9,10,9,9,9,9,9,9,9,9,10,10,9,9,10,9,9,9,10,10,9,9,9,9,10,10,10,10,9,9,10,10,9,10,10,18},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12},
//                    {16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12},
//                    {16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12},
//                    {16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11},
//                    {16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},
//                    {16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12},
//                    {16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11},
//                    {16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12},
//                    {15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11},
//                    {20,13,14,14,13,14,14,13,13,14,13,14,13,13,14,14,14,14,13,14,13,13,14,14,13,14,13,13,14,14,13,13,13,14,14,14,13,14,19},
//            };
            {17,9,9,10,9,10,9,9,9,9,9,9,9,9,10,10,9,9,10,9,9,9,10,10,9,9,9,9,10,10,10,10,9,9,10,10,9,10,10,18},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {16,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {16,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {16,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {15,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {16,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,6},
            {16,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,12},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {16,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {15,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {15,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {16,4,3,4,1,2,3,4,1,2,1,2,3,4,3,4,1,2,1,2,1,2,3,4,3,4,1,2,1,2,3,4,1,2,3,4,1,2,3,12},
            {15,2,1,2,3,4,1,2,3,4,3,4,1,2,1,2,3,4,3,4,3,4,1,2,1,2,3,4,3,4,1,2,3,4,1,2,3,4,1,11},
            {20,13,14,14,13,14,14,13,13,14,13,14,13,13,14,14,14,14,13,14,13,13,14,14,13,14,13,13,14,14,13,13,13,14,14,14,13,14,19},
    };

    @Override
    public void setupEntities() {
        addEntity(1, FloorTile.class, FloorTile.getTextures()[0]); // Top left floor tile
        addEntity(2, FloorTile.class, FloorTile.getTextures()[1]); // top right floor tile
        addEntity(3, FloorTile.class, FloorTile.getTextures()[2]);// bottom left floor tile
        addEntity(4, FloorTile.class, FloorTile.getTextures()[3]);//bottom right floor tile
        addEntity(6, ExitTile.class, ExitTile.getTextures()[1]); // Right door tile
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
        addEntity(25, Keydoor.class, Keydoor.getTextures()[0]); // Key door
        addEntity(26, Keydoor.class, Keydoor.getTextures()[1]); //left key door
        addEntity(27, Keydoor.class, Keydoor.getTextures()[2]); // right key door
    }

    @Override
    public int[][] defineMap() {
        return StartMap;
    }
}
