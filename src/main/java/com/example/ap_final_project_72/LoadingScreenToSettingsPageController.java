package com.example.ap_final_project_72;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class LoadingScreenToSettingsPageController implements Initializable {

    private Parent root;
    private Stage stage;
    private Scene scene;
    private final ActionEvent event = new ActionEvent();

    @FXML
    private ImageView HeroImage, OrcImage1, OrcImage2, OrcImage3;

    @FXML
    private ProgressBar progress;

    @FXML
    private Label myLabel;

    @FXML
    private Button myButton;

    BigDecimal progressDouble = new BigDecimal(String.format("%2f", 0.0));

    public void settingsPage(ActionEvent event) throws IOException {
        System.out.println("You arrived at Settings Page");
//        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SettingsPage.fxml")));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
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

        Timeline timeline2 = new Timeline();
        timeline2.setCycleCount(Timeline.INDEFINITE);
        timeline2.setAutoReverse(true);
        KeyValue kv2 = new KeyValue(OrcImage1.yProperty(), 100, Interpolator.EASE_BOTH);
        KeyFrame kf2 = new KeyFrame(Duration.millis(300), kv2);
        timeline2.getKeyFrames().add(kf2);
        timeline2.play();

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

        progress.setStyle("-fx-accent: #ffcc00;");
        myLabel.setText("Please Wait...");

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(progress.progressProperty(), 0)),
                new KeyFrame(Duration.seconds(10), e-> {
                    progressDouble = new BigDecimal(String.format("%2f", progressDouble.doubleValue() + 1.0));
                    if(progressDouble.doubleValue() == 1.0){
                        myLabel.setText("Click Anywhere To Continue!!");
                    }
                }, new KeyValue(progress.progressProperty(), 1))
        );
        timeline.setCycleCount(1);
        timeline.play();


    }
}