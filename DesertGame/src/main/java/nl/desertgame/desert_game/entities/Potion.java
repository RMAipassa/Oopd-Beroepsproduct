package nl.desertgame.desert_game.entities;

import com.github.hanyaeger.api.Coordinate2D;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Potion extends Text {
    private int amount;
    private Player player;
    public Potion(Player player){
        super(new Coordinate2D(80,52), player.getPotions()+"x");
        this.player = player;
        amount = player.getPotions();
        setFill(Color.WHITE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 20));
    }
    public void increaseAmount(){
        amount++;
        setText(amount+"x");
    }
    public void decreaseAmount(){
        amount--;
        setText(amount+"x");
    }
}
