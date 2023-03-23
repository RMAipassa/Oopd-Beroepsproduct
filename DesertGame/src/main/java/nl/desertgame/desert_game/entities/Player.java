package nl.desertgame.desert_game.entities;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.map.tiles.EntryTile;
import nl.desertgame.desert_game.map.tiles.ExitTile;
import nl.desertgame.desert_game.map.tiles.Keydoor;
import nl.desertgame.desert_game.map.tiles.SolidTile;

import java.util.List;
import java.util.Set;

public class Player extends DynamicSpriteEntity implements KeyListener, Collided, Collider {

    private DesertGame desertGame;

    public static int nextScene;

    public static int currentscene;

    public static int previousScene;
    private final int BossScene = 5;
    private int health;
    private int potions;

    public static boolean hasKey = false;




    boolean colliding = false;

    public Player(DesertGame desertgame,Coordinate2D initialLocation) {
        super("sprites/player.png", initialLocation, new Size(32, 32), 2, 2);
        this.desertGame = desertgame;
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }

    public static void SetSceneNumbers() {
        currentscene = 1;
        nextScene = 2;
        previousScene= 0;
    }


    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.isEmpty()) {
            setSpeed(0);
            return;
        }
        KeyCode keyPressed = pressedKeys.iterator().next();
        switch (keyPressed) {
            case LEFT:
                setMotion(3, 270d);
                setCurrentFrameIndex(3);
                break;
            case RIGHT:
                setMotion(3, 90d);
                setCurrentFrameIndex(4);
                break;
            case UP:
                setMotion(3, 180d);
                setCurrentFrameIndex(2);
                break;
            case DOWN:
                setMotion(3, 0d);
                setCurrentFrameIndex(1);
                break;
            case A: //was used for testing
                System.out.println(nextScene);
                desertGame.setActiveScene(nextScene);
                setScenes(+1);
                break;
            default:
                setSpeed(0);
                break;
        }
    }

    public int getPotions() {
        return potions;
    }

    @Override
    public void setCurrentFrameIndex(int index) {
        super.setCurrentFrameIndex(index);
    }

    private void setScenes(int change) {
       previousScene += change;
       currentscene += change;
       nextScene += change;
        System.out.println(currentscene);
       System.out.println(previousScene);
       System.out.println(nextScene);
    }


    @Override
    public void onCollision(List<Collider> collidingObjects) {
        if (collidingObjects instanceof SolidTile) {
            System.out.println("Colliding");
            colliding = true;
            setMotion(0, 0);
        } else if (collidingObjects instanceof ExitTile) {
            System.out.println("Colliding");
            desertGame.setActiveScene(nextScene);
            setScenes(+1);
        } else if (collidingObjects instanceof EntryTile) {
            System.out.println("Colliding");
            desertGame.setActiveScene(previousScene);
            setScenes(-1);
        } else if (collidingObjects instanceof Keydoor) {
            System.out.println("Colliding");
            if(Player.hasKey) {
                desertGame.setActiveScene(BossScene);
            }
        }
    }
}
