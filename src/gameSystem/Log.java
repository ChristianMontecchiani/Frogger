package gameSystem;

import javafx.scene.image.Image;

public class Log extends Entity {

    private double speed;

    public Log(String logImage, int size, int xPos, int yPos, double speed ){

        setImage(new Image(logImage,size, size, true, true));
        setX(xPos);
        setY(yPos);
        this.speed= speed;

    }



}
