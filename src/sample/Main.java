package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;



public class Main extends Application {

    public final static String AUDIO_PATH = "Resources\\Audio\\";
    public final static String IMAGES_PATH = "Resources\\Images\\";

    public final static int SCREEN_WIDTH = 490;
    public final static int SCREEN_HEIGHT = 300;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("FROGGER GAME");
        menuActions.play();

        primaryStage.setScene(new Scene(root,SCREEN_WIDTH, SCREEN_HEIGHT));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
