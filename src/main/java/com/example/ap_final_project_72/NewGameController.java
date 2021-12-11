package com.example.ap_final_project_72;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class NewGameController implements Initializable {

    @FXML
    private ImageView orcImage, heroImage, scoreCoin, gameCoin1, gameCoin2, gameCoin3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translateHero = new TranslateTransition();
        translateHero.setNode(heroImage);
        translateHero.setDuration(Duration.millis(500));
        translateHero.setCycleCount(TranslateTransition.INDEFINITE);
        translateHero.setByY(-100);
        translateHero.setAutoReverse(true);
        translateHero.play();

        TranslateTransition translateOrc = new TranslateTransition();
        translateOrc.setNode(orcImage);
        translateOrc.setDuration(Duration.millis(500));
        translateOrc.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc.setByY(-100);
        translateOrc.setAutoReverse(true);
        translateOrc.play();

        RotateTransition rotateScoreCoin = new RotateTransition();
        rotateScoreCoin.setNode(scoreCoin);
        rotateScoreCoin.setDuration(Duration.millis(500));
        rotateScoreCoin.setCycleCount(RotateTransition.INDEFINITE);
        rotateScoreCoin.setToAngle(360);
        rotateScoreCoin.setAxis(Rotate.Y_AXIS);
        rotateScoreCoin.setAutoReverse(false);
        rotateScoreCoin.play();

        RotateTransition rotateGameCoin1 = new RotateTransition();
        rotateGameCoin1.setNode(gameCoin1);
        rotateGameCoin1.setDuration(Duration.millis(500));
        rotateGameCoin1.setCycleCount(RotateTransition.INDEFINITE);
        rotateGameCoin1.setToAngle(360);
        rotateGameCoin1.setAxis(Rotate.Y_AXIS);
        rotateGameCoin1.setAutoReverse(false);
        rotateGameCoin1.play();

        RotateTransition rotateGameCoin2 = new RotateTransition();
        rotateGameCoin2.setNode(gameCoin2);
        rotateGameCoin2.setDuration(Duration.millis(500));
        rotateGameCoin2.setCycleCount(RotateTransition.INDEFINITE);
        rotateGameCoin2.setToAngle(360);
        rotateGameCoin2.setAxis(Rotate.Y_AXIS);
        rotateGameCoin2.setAutoReverse(false);
        rotateGameCoin2.play();

        RotateTransition rotateGameCoin3 = new RotateTransition();
        rotateGameCoin3.setNode(gameCoin3);
        rotateGameCoin3.setDuration(Duration.millis(500));
        rotateGameCoin3.setCycleCount(RotateTransition.INDEFINITE);
        rotateGameCoin3.setToAngle(360);
        rotateGameCoin3.setAxis(Rotate.Y_AXIS);
        rotateGameCoin3.setAutoReverse(false);
        rotateGameCoin3.play();




    }
}
