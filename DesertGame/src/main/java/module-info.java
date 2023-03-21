module nl.desertgame.desert_game {
    requires hanyaeger;

    exports nl.desertgame.desert_game;

//    opens audio;
    opens backgrounds;
    exports nl.desertgame.desert_game.screens;
    opens sprites;
}
