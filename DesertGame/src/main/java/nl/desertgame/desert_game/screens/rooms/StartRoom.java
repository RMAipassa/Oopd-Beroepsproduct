package nl.desertgame.desert_game.screens.rooms;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.desertgame.desert_game.DesertGame;
import nl.desertgame.desert_game.entities.*;
import nl.desertgame.desert_game.map.StartMap;
import nl.desertgame.desert_game.screens.GameScreen;

import java.util.ArrayList;


public class StartRoom extends GameScreen implements TileMapContainer {
    private DesertGame desertGame;
    private StartRoom startroom;
    private  Text amountPotion;
    private Player player;
    private ArrayList<Heart> Hearts;


    public StartRoom(DesertGame desertGame) {
        super(desertGame);
        this.desertGame = desertGame;
    }


    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities() {
        player = new Player(desertGame,this,new Coordinate2D(50, 320));
        addEntity(player);
        Image potions = new Image("sprites/potion.png", new Coordinate2D(50, 50), new Size(32, 32));
        addEntity(potions);
        amountPotion = new Potion(player);
        addEntity(amountPotion);
        setupHearts();
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
        Hearts = new ArrayList<Heart>();
        for(int i = 0; i< GameScreen.getTotalHealth(); i++){
            Heart heart = new Heart("sprites/heart.png",new Coordinate2D(50+(i*20),30),new Size(20,20),1,2);
            Hearts.add(heart);
            addEntity(heart);
        }
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new StartMap());
    }
}


