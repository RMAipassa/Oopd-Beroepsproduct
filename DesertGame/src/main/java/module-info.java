module nl.desertgame.desert_game {
    requires hanyaeger;

    exports nl.desertgame.desert_game;

    opens audio;
    opens backgrounds;
//    opens audio;
    exports nl.desertgame.desert_game.screens;
    opens sprites;
}
