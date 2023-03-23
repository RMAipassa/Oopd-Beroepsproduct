package nl.desertgame.desert_game.screens;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.YaegerScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.Heart;
import nl.desertgame.desert_game.entities.Image;
import nl.desertgame.desert_game.entities.Player;
import nl.desertgame.desert_game.entities.Text;

import java.util.ArrayList;


public class GameScreen extends DynamicScene {
    private DesertGame desertGame;
private  Text amountPotion;
private Player player;
    private ArrayList<Heart> Hearts;
    public int amountHearts;

    public GameScreen(DesertGame desertGame) {
        this.desertGame = desertGame;
    }

    @Override
    public void setupScene() {setBackgroundColor(Color.BLACK);
    }

    @Override
    public void setupEntities() {
        player = new Player(new Coordinate2D(50, 50),this);
        addEntity(player);
        setupPotions();
        setupHearts();
    }

    public void setupPotions() {
        Image potions = new Image("sprites/potion.png", new Coordinate2D(50, 50), new Size(32, 32));
        addEntity(potions);
        this.amountPotion = new Text(new Coordinate2D(80, 52), player.getPotions() + "x");
        amountPotion.setFill(Color.WHITE);
        amountPotion.setFont(Font.font("Roboto", FontWeight.BOLD, 20));
        addEntity(amountPotion);
    }
    public void updatePotions(){
        this.amountPotion.setText(this.player.getPotions()+"x");
    }
    public void updateHearts(){
        int index;
        if(Hearts.size() > player.getHealth()){
            index = player.getHealth() ;
            Hearts.get(index).setCurrentFrameIndex(1);
        } else if (Hearts.size() < player.getHealth()){
            index = player.getHealth() ;
            Hearts.get(index).setCurrentFrameIndex(2);
        }
    }
    public void setupHearts() {
        if (desertGame.difficulty == 0) {
            player.health = 5;
        } else if (desertGame.difficulty == 1) {
            player.health = 4;
        } else {
            player.health = 3;
        }
      Hearts = new ArrayList<Heart>();
        for(int i = 0; i< player.health; i++){
            Heart heart = new Heart("sprites/heart.png",new Coordinate2D(50+(i*20),30),new Size(20,20),1,2);
            Hearts.add(heart);
            System.out.println("HELP");
            addEntity(heart);
        }
    }
}


