package nl.desertgame.desert_game.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import nl.desertgame.desert_game.screens.GameScreen;

import java.util.List;
import java.util.Set;

public class Player extends DynamicSpriteEntity implements KeyListener {
    public int health;
    private int potions;
    private GameScreen gamescreen;

    public Player(Coordinate2D initialLocation, GameScreen gamescreen) {
        super("sprites/player.png", initialLocation,new Size(32, 32), 2, 2);
        this.gamescreen = gamescreen;
    }


    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.isEmpty()) {
            setSpeed(0);
            return;
        }
        KeyCode keyPressed = pressedKeys.iterator().next();
        switch (keyPressed) {
            case LEFT:
                setMotion(1, 270d);
                setCurrentFrameIndex(3);
                break;
            case RIGHT:
                setMotion(1, 90d);
                setCurrentFrameIndex(4);
                break;
            case UP:
                setMotion(1, 180d);
                setCurrentFrameIndex(2);
                break;
            case DOWN:
                setMotion(1, 0d);
                setCurrentFrameIndex(1);
                break;
            default:
                setSpeed(0);
                break;
        }
    }

    public int getPotions() {
        return potions;
    }
<<<<<<< Updated upstream
    public int getHealth(){
        return health;
=======
    public int getHealth(){return health;}

    public void setHealth(int health){
        this.health = health;
>>>>>>> Stashed changes
    }

    @Override
    public void setCurrentFrameIndex(int index) {
        super.setCurrentFrameIndex(index);
    }
}
//    @Override
//    public void onCollision(Collider collider) {
//        if (collider instanceof SolidTile) {
//            setMotion(0, 0);
//    }
//}
