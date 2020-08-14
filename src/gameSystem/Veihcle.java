package gameSystem;

import gameSystem.Entity;
import javafx.scene.image.Image;

public class Veihcle extends Entity {


    double speed;

    public Veihcle(String carImage, int  size, double xPos, double yPos, double speed){

        setImage(new Image(carImage, size, size, true, true));
        setX(xPos);
        setY(yPos);
        this.speed= speed;
    }


}
