package gameSystem;

import javafx.scene.image.Image;
import sample.Main;

import java.io.File;

public class Turtle extends Entity {

    private double speed;
    Image turtle1;
    Image turtle2;
    Image turtle3;

    private final static String turtle1ImageURL = new File(Main.IMAGE_PATH + "TurtleAnimation1.png").toURI().toString();
    private final static String turtle2ImageURL = new File(Main.IMAGE_PATH + "TurtleAnimation2.png").toURI().toString();
    private final static String turtle3ImageURL = new File(Main.IMAGE_PATH + "TurtleAnimation3.png").toURI().toString();

    public Turtle(int xPos, int yPos, double speed, int size){
        turtle1 = new Image(turtle1ImageURL, size, size, true, true);
        turtle2 = new Image(turtle2ImageURL, size, size, true, true);
        turtle3 = new Image(turtle3ImageURL, size, size, true, true);
        setX(xPos);
        setY(yPos);
        this.speed= speed;
        setImage(turtle2);
    }




}
