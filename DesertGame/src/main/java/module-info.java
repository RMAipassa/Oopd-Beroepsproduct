module nl.desertgame.desert_game {
    requires hanyaeger;

    exports nl.desertgame.desert_game;

<<<<<<< Updated upstream
    opens audio;
    opens backgrounds;
=======
//    opens audio;
    opens backgrounds;
    exports nl.desertgame.desert_game.screens;
>>>>>>> Stashed changes
    opens sprites;
}
