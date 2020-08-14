package gameSystem;


import javafx.scene.image.Image;
import sample.Main;

import java.io.File;

public class UnderWaterTurtle extends Entity {

    private double speed;
    Image turtle1;
    Image turtle2;
    Image turtle3;
    Image turtle4;

    private static final String turtle1URL = new File(Main.IMAGE_PATH +"TurtleAnimation1.png").toURI().toString();
    private static final String turtle2URL = new File(Main.IMAGE_PATH +"TurtleAnimation2Wet.png").toURI().toString();
    private static final String turtle3URL = new File(Main.IMAGE_PATH +"TurtleAnimation3Wet.png").toURI().toString();
    private static final String turtle4URL = new File(Main.IMAGE_PATH +"TurtleAnimation4Wet.png").toURI().toString();



    boolean underWater = true;

    public UnderWaterTurtle(double xPos, double yPos, double speed, int w, int h) {
        turtle1 = new Image(turtle1URL, w, h, true, true);
        turtle2 = new Image(turtle2URL, w, h, true, true);
        turtle3 = new Image(turtle3URL, w, h, true, true);
        turtle4 = new Image(turtle4URL, w, h, true, true);
        setX(xPos);
        setY(yPos);
        this.speed = speed;
        setImage(turtle2);
    }
}
