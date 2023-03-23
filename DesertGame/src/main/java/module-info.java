module nl.desertgame.desert_game {
    requires hanyaeger;

    exports nl.desertgame.desert_game;

//    opens audio;
    opens backgrounds;
    exports nl.desertgame.desert_game.map.tiles;
    exports nl.desertgame.desert_game.screens;
    opens sprites;
    opens sprites.Floortiles;
    opens  sprites.SolidTiles;
    opens sprites.Objects;
    opens sprites.Treasure;
}