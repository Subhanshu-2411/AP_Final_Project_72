package com.example.ap_final_project_72;

import javafx.animation.AnimationTimer;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class NewGameController implements Initializable {

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private ImageView orcImage, heroImage, scoreCoin, gameCoin1, gameCoin2, gameCoin3, staticIsland1, staticIsland2, movingIsland1, chestImage;

    @FXML
    private Button myButton, pauseButton;

    CoinChest coinChest1 = new CoinChest(5, false);

    @FXML
    private void heroMoveForward(ActionEvent event) {
        TranslateTransition translateHero = new TranslateTransition();
        translateHero.setNode(heroImage);
        translateHero.setDuration(Duration.millis(100));
        translateHero.setByX(+ 50.0);
        translateHero.play();

    }

    public void pauseGame(ActionEvent event) throws IOException{
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PauseGame.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void orcMoveForward() {

        TranslateTransition translateOrc = new TranslateTransition();
        translateOrc.setNode(orcImage);
        translateOrc.setDuration(Duration.millis(100));
        translateOrc.setByX(+ 50.0);
        TranslateTransition translateHero = new TranslateTransition();
        translateHero.setNode(heroImage);
        translateHero.setDuration(Duration.millis(100));
        translateHero.setByX(- 50.0);

        ParallelTransition parallelTransition = new ParallelTransition(translateHero, translateOrc);
        parallelTransition.play();

    }


    private void heroTranslate(){
        TranslateTransition translateHero = new TranslateTransition();
        translateHero.setNode(heroImage);
        translateHero.setDuration(Duration.millis(500));
        translateHero.setCycleCount(TranslateTransition.INDEFINITE);
        translateHero.setByY(-100);
        translateHero.setAutoReverse(true);
        translateHero.play();

    }

    private void orcTranslate(){
        TranslateTransition translateOrc = new TranslateTransition();
        translateOrc.setNode(orcImage);
        translateOrc.setDuration(Duration.millis(500));
        translateOrc.setCycleCount(TranslateTransition.INDEFINITE);
        translateOrc.setByY(-100);
        translateOrc.setAutoReverse(true);
        translateOrc.play();
    }

    private void scoreCoinRotate(){
        RotateTransition rotateScoreCoin = new RotateTransition();
        rotateScoreCoin.setNode(scoreCoin);
        rotateScoreCoin.setDuration(Duration.millis(500));
        rotateScoreCoin.setCycleCount(RotateTransition.INDEFINITE);
        rotateScoreCoin.setToAngle(360);
        rotateScoreCoin.setAxis(Rotate.Y_AXIS);
        rotateScoreCoin.setAutoReverse(false);
        rotateScoreCoin.play();
    }

    private void gameCoin1Rotate(){
        RotateTransition rotateGameCoin1 = new RotateTransition();
        rotateGameCoin1.setNode(gameCoin1);
        rotateGameCoin1.setDuration(Duration.millis(750));
        rotateGameCoin1.setCycleCount(RotateTransition.INDEFINITE);
        rotateGameCoin1.setToAngle(360);
        rotateGameCoin1.setAxis(Rotate.Y_AXIS);
        rotateGameCoin1.setAutoReverse(false);
        rotateGameCoin1.play();
    }

    private void gameCoin2Rotate(){
        RotateTransition rotateGameCoin2 = new RotateTransition();
        rotateGameCoin2.setNode(gameCoin2);
        rotateGameCoin2.setDuration(Duration.millis(750));
        rotateGameCoin2.setCycleCount(RotateTransition.INDEFINITE);
        rotateGameCoin2.setToAngle(360);
        rotateGameCoin2.setAxis(Rotate.Y_AXIS);
        rotateGameCoin2.setAutoReverse(false);
        rotateGameCoin2.play();
    }

    private void gameCoin3Rotate(){
        RotateTransition rotateGameCoin3 = new RotateTransition();
        rotateGameCoin3.setNode(gameCoin3);
        rotateGameCoin3.setDuration(Duration.millis(750));
        rotateGameCoin3.setCycleCount(RotateTransition.INDEFINITE);
        rotateGameCoin3.setToAngle(360);
        rotateGameCoin3.setAxis(Rotate.Y_AXIS);
        rotateGameCoin3.setAutoReverse(false);
        rotateGameCoin3.play();
    }

    private void islandTranslate(){
        TranslateTransition translateIsland = new TranslateTransition();
        translateIsland.setNode(movingIsland1);
        translateIsland.setDuration(Duration.millis(500));
        translateIsland.setCycleCount(TranslateTransition.INDEFINITE);
        translateIsland.setByY(-40);
        translateIsland.setAutoReverse(true);
        translateIsland.play();
    }

    AnimationTimer collisionTimer = new AnimationTimer() {
        @Override
        public void handle(long timestamp) {
            boolean heroOrc = heroOrcCheckCollision(heroImage, orcImage);
            heroIslandCheckCollision(heroImage, staticIsland1);
            heroIslandCheckCollision(heroImage, staticIsland2);
            heroIslandCheckCollision(heroImage, movingIsland1);
            heroChestCheckCollision(heroImage, chestImage);

            if(heroOrc){
                orcMoveForward();
            }

        }
    };


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        heroTranslate();
        orcTranslate();
        scoreCoinRotate();
        gameCoin1Rotate();
        gameCoin2Rotate();
        gameCoin3Rotate();
        islandTranslate();

        collisionTimer.start();


    }

    private boolean heroOrcCheckCollision(ImageView img1, ImageView img2){
        if(img1.getBoundsInParent().intersects(img2.getBoundsInParent())){
            System.out.println("COLLISION");
            return true;
        }
        return false;
    }
    private void heroIslandCheckCollision(ImageView img1, ImageView img2){
        if(img1.getBoundsInParent().intersects(img2.getBoundsInParent())){
            System.out.println("COLLISION");
        }
    }
    private void heroChestCheckCollision(ImageView img1, ImageView img2) {

        if (img1.getBoundsInParent().intersects(img2.getBoundsInParent())) {

            if(!coinChest1.isOpened()){
                coinChest1.chestOpenAnimation(chestImage);
                coinChest1.setOpened(true);
            }
        }

    }
}
