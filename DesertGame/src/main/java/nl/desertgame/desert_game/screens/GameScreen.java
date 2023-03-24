package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.scenes.DynamicScene;
import nl.desertgame.desert_game.DesertGame;

public abstract class GameScreen extends DynamicScene {
public static int health;
public static int potions;
private static int totalHealth;

 public GameScreen(DesertGame desertGame){
     if (desertGame.difficulty == 0) {
        totalHealth = 5;
     } else if (desertGame.difficulty == 1) {
         totalHealth = 4;
     } else {
         totalHealth = 3;
     }
 }
 public static int getTotalHealth(){
     return totalHealth;
 }


}
