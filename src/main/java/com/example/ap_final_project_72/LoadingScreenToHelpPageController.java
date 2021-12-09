package com.example.ap_final_project_72;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class LoadingScreenToHelpPageController implements Initializable {

    @FXML
    private ImageView HeroImage, OrcImage1, OrcImage2, OrcImage3;

    @FXML
    private ProgressBar progress;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TranslateTransition translateHero = new TranslateTransition();
        translateHero.setNode(HeroImage);
        translateHero.setDuration(Duration.millis(500));
        translateHero.setCycleCount(TranslateTransition.INDEFINITE);
        translateHero.setByY(105);
        translateHero.setAutoReverse(true);
        translateHero.play();

        TranslateTransition translateOrc1 = new TranslateTransition();
        translateOrc1.setNode(OrcImage1);
        translateOrc1.setDelay(Duration.millis(200));
        translateOrc1.setDuration(Duration.millis(500));
        translateOrc1.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc1.setByY(100);
        translateOrc1.setAutoReverse(true);
        translateOrc1.play();

        TranslateTransition translateOrc2 = new TranslateTransition();
        translateOrc2.setNode(OrcImage2);
        translateOrc2.setDelay(Duration.millis(400));
        translateOrc2.setDuration(Duration.millis(500));
        translateOrc2.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc2.setByY(100);
        translateOrc2.setAutoReverse(true);
        translateOrc2.play();

        TranslateTransition translateOrc3 = new TranslateTransition();
        translateOrc3.setNode(OrcImage3);
        translateOrc3.setDelay(Duration.millis(600));
        translateOrc3.setDuration(Duration.millis(500));
        translateOrc3.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc3.setByY(100);
        translateOrc3.setAutoReverse(true);
        translateOrc3.play();

        progress.setStyle("-fx-accent: #ffcc00;");

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(progress.progressProperty(), 0)),
                new KeyFrame(Duration.seconds(10), e-> {
                    // Next Screen Function --- Help Page
                }, new KeyValue(progress.progressProperty(), 1))
        );
        timeline.setCycleCount(1);
        timeline.play();
    }
}
