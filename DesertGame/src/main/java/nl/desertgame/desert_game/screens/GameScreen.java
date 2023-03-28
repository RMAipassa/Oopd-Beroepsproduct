package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;

public abstract class GameScreen extends DynamicScene implements TileMapContainer, UpdateExposer, MouseButtonPressedListener {
}
