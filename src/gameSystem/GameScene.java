package gameSystem;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.io.File;


public class GameScene {

    final static String AUDIO_PATH = "Resources\\Audio\\";
    final static String IMAGES_PATH = "Resources\\Images\\";

    Media media;
    Button pauseButton;
    Label timeLabel;
    Label scoreLabel;
    Label difficultyLabel;
    AnchorPane backgroundScene;
    ImageView backgroundImage;
    String level = "";
    int score = 0;

    public  void startGame(Stage primaryStage, int difficulty){

        //MUSICA di SOTTOFONDO
        media = new Media(new File(AUDIO_PATH + "theme.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();

        //Label level
        if (difficulty == 0)
            level += "EASY";
        else if(difficulty ==1)
            level += "MEDIUM";
        else
            level += "HARD";

        //SCRITTA IN ALTO
        pauseButton = new Button("||");
        timeLabel = new Label("Time:");
        timeLabel.setFont(new Font("Calibri", 20));
        difficultyLabel= new Label("Difficulty:" + level);
        difficultyLabel.setFont(new Font("Calibri", 20));
        scoreLabel = new Label("Score: " + score);
        scoreLabel.setFont(new Font("Calibri", 20));

        backgroundScene = new AnchorPane();
        backgroundScene.maxHeight(400);
        backgroundScene.maxWidth(800);
        backgroundScene.setPrefSize(400,800);

        //pos Bottone Pausa
        AnchorPane.setTopAnchor(pauseButton,10.0);
        AnchorPane.setLeftAnchor(pauseButton,10.0);

        //pos Etichetta Time
        AnchorPane.setTopAnchor(timeLabel,10.0);
        AnchorPane.setLeftAnchor(timeLabel,145.0);

        //pos Etichetta Difficoltà
        AnchorPane.setTopAnchor(difficultyLabel,10.0);
        AnchorPane.setLeftAnchor(difficultyLabel,230.0);

        //pos Etichetta Score
        AnchorPane.setTopAnchor(scoreLabel, 10.0);
        AnchorPane.setLeftAnchor(scoreLabel, 50.0);


        Image backgroundImageURL= new Image(new File(IMAGES_PATH + "background.png").toURI().toString());
        backgroundImage = new ImageView(backgroundImageURL);

        //pos Image
        AnchorPane.setTopAnchor(backgroundImage, 40.0);

        backgroundScene.getChildren().addAll(pauseButton,timeLabel,difficultyLabel, scoreLabel, backgroundImage);

        String logImageURL= new File(IMAGES_PATH + "log3.png").toURI().toString();
        String car1leftURL= new File(IMAGES_PATH+ "car1Left.png").toURI().toString();
        String truck1LeftURL= new File(IMAGES_PATH+ "truck1Left.png").toURI().toString();
        String bigtruckRightURL = new File(IMAGES_PATH + "truck2Right.png").toURI().toString();


        //NON CANCELLARE PLS
        Log firstLog = new Log(logImageURL, 90, 230, 280, 1.5);
        Log firstLog2 = new Log(logImageURL, 90, 230, 243, 1.5);
        Log firstLog3= new Log(logImageURL, 70, 300, 208, 1.5);
        Log firstLog4 = new Log(logImageURL, 70, 300, 177, 1.5);
        Log firstLog5 = new Log(logImageURL, 70, 300, 146, 1.5);
//NON CANCELLARE PLS
        Turtle turtle1 = new Turtle(130, 275, 0.75, 90);
        Turtle turtle2 = new Turtle(130, 243, 0.75, 90);
        Turtle turtle3 = new Turtle(130, 211, 0.75, 90);
        Turtle turtle4 = new Turtle(130, 179, 0.75, 90);
        Turtle turtle5 = new Turtle(130, 147, 0.75, 90);
        //Turtle turtle6 = new Turtle(130, 115, 0.75, 90);


        backgroundScene.getChildren().addAll(turtle3,turtle4,turtle5, firstLog2,firstLog3,firstLog4,firstLog5);


//NON CANCELLARE PLS
        Veihcle car1 = new Veihcle(car1leftURL, 30, 300, 492, 1.5);
        Veihcle car2 = new Veihcle(car1leftURL, 30, 300, 468, 1.5);
        Veihcle car3 = new Veihcle(car1leftURL, 30, 300, 444, 1.5);
        Veihcle car4 = new Veihcle(car1leftURL, 30, 300, 396, 1.5);
        Veihcle car5= new Veihcle(car1leftURL, 30, 300, 372, 1.5);
        Veihcle car6= new Veihcle(car1leftURL, 30, 300, 348, 1.5);
        Veihcle car7= new Veihcle(car1leftURL, 30, 300, 420, 1.5);
//NON CANCELLARE PLS
        Veihcle truck1 = new Veihcle(truck1LeftURL, 80, 210,488, 1.3);
        Veihcle truck2 = new Veihcle(truck1LeftURL, 80, 210,464, 1.3);
        Veihcle truck3 = new Veihcle(truck1LeftURL, 80, 210,440, 1.3);
        Veihcle truck4 = new Veihcle(truck1LeftURL, 80, 210,416, 1.3);
        Veihcle truck5 = new Veihcle(truck1LeftURL, 80, 210,392, 1.3);
        Veihcle truck7= new Veihcle(truck1LeftURL, 80, 210,368, 1.3);
        Veihcle truck6 = new Veihcle(truck1LeftURL, 80, 210,344, 1.3);
//NON CANCELLARE PLS
        Veihcle bigtruck1 = new Veihcle(bigtruckRightURL, 130, 75,488, 1.3);
        Veihcle bigtruck2 = new Veihcle(bigtruckRightURL, 130, 75,464, 1.3);
        Veihcle bigtruck3 = new Veihcle(bigtruckRightURL, 130, 75,440, 1.3);
        Veihcle bigtruck4 = new Veihcle(bigtruckRightURL, 130, 75,416, 1.3);
        Veihcle bigtruck5 = new Veihcle(bigtruckRightURL, 130, 75,392, 1.3);
        Veihcle bigtruck6 = new Veihcle(bigtruckRightURL, 130, 75,368, 1.3);
        Veihcle bigtruck7 = new Veihcle(bigtruckRightURL, 130, 75,344, 1.3);


        backgroundScene.getChildren().addAll(firstLog, turtle1, car1, car2, car3, car4,car5,car6 ,truck1, truck2,truck3,truck4,truck5,truck6, truck7, car7, bigtruck1,bigtruck2,bigtruck3,bigtruck4,bigtruck5,bigtruck6,bigtruck7, turtle2);


        primaryStage.setScene(new Scene(backgroundScene, 380,570));


        pauseButton.setOnAction(e->{
            PauseClass.pause(mediaPlayer);
        });

    }
}
