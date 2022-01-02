package com.example.ap_final_project_72;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Will Hero");
        stage.setScene(scene);
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
}