module nl.desertgame.desert_game {
    requires hanyaeger;

    exports nl.desertgame.desert_game;
    exports nl.desertgame.desert_game.map;
    opens backgrounds;
    opens sprites.Floortiles;
    opens sprites.SolidTiles;
    opens sprites.Objects;
    opens sprites.Treasure;
    exports nl.desertgame.desert_game.screens;
    opens sprites;
}
