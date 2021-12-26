package com.example.ap_final_project_72;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.nio.file.Paths;

public class HelloApplication extends Application {

    static Media media = new Media(Paths.get("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\music\\backgroundMusic.mp3").toUri().toString());
    static MediaPlayer mediaPlayer = new MediaPlayer(media);

    @Override
    public void start(Stage stage) throws IOException, NullPointerException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Will Hero");
        stage.setScene(scene);
        Image icon = new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\icon.png");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume();
            exitGame(stage);
        });
    }

    public static void main(String[] args) {
        launch();
    }

    private void exitGame(Stage stage){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Close Game");
        alert.setHeaderText("You are about to Close the Game");
        alert.setContentText("Do you want to Close ?");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage.close();
        }
    }

    public static void musicPlay(){
        mediaPlayer.setCycleCount(Timeline.INDEFINITE);
        mediaPlayer.play();
    }
    public static void musicPause(){
        mediaPlayer.pause();
    }
    public static void musicReset(){
        mediaPlayer.seek(Duration.seconds(0.0));
    }
}
