package com.example.ap_final_project_72;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ModeSelection implements Initializable {

    private Parent root;
    private Stage stage;
    private Scene scene;


    @FXML
    private ImageView HeroImage, OrcImage2, OrcImage3;

    @FXML
    private Button easy, medium, hard ;

    @FXML
    public void easy_mode(ActionEvent event) throws IOException {
        NewGameController.mode=1;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NewGame.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(951.0);
        stage.setHeight(540.0);
        stage.show();
    }

    @FXML
    public void medium_mode(ActionEvent event) throws IOException {
        NewGameController.mode=2;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NewGame.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(951.0);
        stage.setHeight(540.0);
        stage.show();
    }

    @FXML
    public void hard_mode(ActionEvent event) throws IOException {
        NewGameController.mode=3;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NewGame.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(951.0);
        stage.setHeight(540.0);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Timeline timeline1 = new Timeline();
        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline1.setAutoReverse(true);
        KeyValue kv1 = new KeyValue(HeroImage.yProperty(), 100, Interpolator.EASE_BOTH);
        KeyFrame kf1 = new KeyFrame(Duration.millis(500), kv1);
        timeline1.getKeyFrames().add(kf1);
        timeline1.play();

        Timeline timeline3 = new Timeline();
        timeline3.setCycleCount(Timeline.INDEFINITE);
        timeline3.setAutoReverse(true);
        KeyValue kv3 = new KeyValue(OrcImage2.yProperty(), 100, Interpolator.EASE_BOTH);
        KeyFrame kf3 = new KeyFrame(Duration.millis(400), kv3);
        timeline3.getKeyFrames().add(kf3);
        timeline3.play();

        Timeline timeline4 = new Timeline();
        timeline4.setCycleCount(Timeline.INDEFINITE);
        timeline4.setAutoReverse(true);
        KeyValue kv4 = new KeyValue(OrcImage3.yProperty(), 100, Interpolator.EASE_BOTH);
        KeyFrame kf4 = new KeyFrame(Duration.millis(500), kv4);
        timeline4.getKeyFrames().add(kf4);
        timeline4.play();
    }
}