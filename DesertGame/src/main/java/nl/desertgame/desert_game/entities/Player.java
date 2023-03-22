package nl.desertgame.desert_game.entities;

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

public class Player extends DynamicSpriteEntity implements KeyListener, Collider {

    private DesertGame desertGame;

    public int nextScene = 2;
    public int previousScene= 0;
    private final int BossScene = 5;
    private int health;
    private int potions;

    public static boolean hasKey = false;




    boolean colliding = false;

    public Player(Coordinate2D initialLocation) {
        super("sprites/player.png", initialLocation, new Size(32, 32), 2, 2);
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

//    @Override
//    public void onCollision(Collider collider) {
//        if (collider instanceof SolidTile) {
//            colliding = true;
//            setMotion(0, 0);
//        } else if (collider instanceof ExitTile) {
//            desertGame.setActiveScene(nextScene);
//            setScenes(+1);
//        } else if (collider instanceof EntryTile) {
//            desertGame.setActiveScene(previousScene);
//            setScenes(-1);
//        } else if (collider instanceof Keydoor) {
//            if(hasKey = True) {
//            desertGame.setActiveScene(BossScene);
//              }
//                else{
//                    show that player needs key
//             }
//        }
//    }

    private void setScenes(int change) {
       this.previousScene =+ change;
       this.nextScene =+ change;
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof SolidTile) {
            System.out.println("Coliding");
            colliding = true;
            setMotion(0, 0);
        } else if (collider instanceof ExitTile) {
            System.out.println("Coliding");
            desertGame.setActiveScene(nextScene);
            setScenes(+1);
        } else if (collider instanceof EntryTile) {
            System.out.println("Coliding");
            desertGame.setActiveScene(previousScene);
            setScenes(-1);
        } else if (collider instanceof Keydoor) {
            System.out.println("Coliding");
            if(Player.hasKey) {
            desertGame.setActiveScene(BossScene);
              }
        }
    }
}
