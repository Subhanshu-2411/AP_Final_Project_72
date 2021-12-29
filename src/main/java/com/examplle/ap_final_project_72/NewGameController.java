package com.example.ap_final_project_72;

import animatefx.animation.Bounce;
import animatefx.animation.RollIn;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.animation.AnimationTimer;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.ap_final_project_72.HelloApplication.musicPlay;


public class NewGameController implements Initializable {

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private ImageView orcImage1, heroImage, scoreCoin, gameCoin1, gameCoin2, gameCoin3,
            staticIsland1, staticIsland2, movingIsland1, coinChest1;

    @FXML
    private AnchorPane navigationContent;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private Button myButton, pauseButton, helpButton, quitButton,
            restartButton, resumeButton;

    @FXML
    private Label coinLabel, pointsLabel;

    CoinChest CoinChest1 = new CoinChest(5, false);
    int a = 2;


    //@FXML
//    private void heroMoveForward() {
//
//        if (a > 0) {
//            --a;
//            heroTranslateX(heroImage, + 250.0, Duration.millis(200));
//        }
//        else {
//            orcTranslateX(orcImage1, -250.0, Duration.millis(200));
//            staticIslandTranslateX(staticIsland1, -250.0, Duration.millis(200));
//            staticIslandTranslateX(staticIsland2, -250.0, Duration.millis(200));
//            movingIslandTranslateX(movingIsland1, -250.0, Duration.millis(200));
//            gameCoinTranslateX(gameCoin1, -250.0, Duration.millis(200));
//            coinChestTranslateX(coinChest1, -250.0, Duration.millis(200));
//        }
//    }

//    private void coinChestTranslateX(ImageView imageView, double translatedAmount, Duration duration) {
//        TranslateTransition translateCoinChest1 = new TranslateTransition();
//        translateCoinChest1.setNode(imageView);
//        translateCoinChest1.setDuration(duration);
//        translateCoinChest1.setByX(translatedAmount);
//        translateCoinChest1.play();
//    }
//    private void gameCoinTranslateX(ImageView imageView, double translatedAmount, Duration duration) {
//        TranslateTransition translateGameCoin1 = new TranslateTransition();
//        translateGameCoin1.setNode(imageView);
//        translateGameCoin1.setDuration(duration);
//        translateGameCoin1.setByX(translatedAmount);
//        translateGameCoin1.play();
//    }
//    private void heroTranslateX(ImageView imageView, double translatedAmount, Duration duration) {
//        TranslateTransition translateHero = new TranslateTransition();
//        translateHero.setNode(imageView);
//        translateHero.setDuration(duration);
//        translateHero.setByX(translatedAmount);
//        translateHero.play();
//    }
//    private void staticIslandTranslateX(ImageView imageView, double translatedAmount, Duration duration) {
//        TranslateTransition translateStaticIsland = new TranslateTransition();
//        translateStaticIsland.setNode(imageView);
//        translateStaticIsland.setDuration(duration);
//        translateStaticIsland.setByX(translatedAmount);
//        translateStaticIsland.play();
//    }
//    private void movingIslandTranslateX(ImageView imageView, double translatedAmount, Duration duration) {
//        TranslateTransition translateMovingIsland = new TranslateTransition();
//        translateMovingIsland.setNode(imageView);
//        translateMovingIsland.setDuration(duration);
//        translateMovingIsland.setByX(-250.0);
//        translateMovingIsland.play();
//    }
//    private void orcTranslateX(ImageView imageView, double translatedAmount, Duration duration) {
//        TranslateTransition translateOrc = new TranslateTransition();
//        translateOrc.setNode(imageView);
//        translateOrc.setDuration(duration);
//        translateOrc.setByX(translatedAmount);
//        translateOrc.play();
//    }

//    public void pauseGame() throws IOException{
//        musicPause();
//        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PauseGame.fxml")));
//        stage = (Stage) pauseButton.getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

//    private void orcMoveForward() {
//        orcTranslateX(orcImage1, 50, Duration.millis(100));
//        heroTranslateX(heroImage, - 50.0, Duration.millis(100));
//    }

//    private void heroTranslateY(ImageView imageView, double translatedAmount, Duration duration, boolean autoReverse){
//        TranslateTransition translateHero = new TranslateTransition();
//        translateHero.setNode(imageView);
//        translateHero.setDuration(duration);
//        translateHero.setCycleCount(TranslateTransition.INDEFINITE);
//        translateHero.setByY(translatedAmount);
//        translateHero.setAutoReverse(autoReverse);
//        translateHero.play();
//
//    }
//    private void orcTranslateY(ImageView imageView, double translatedAmount, Duration duration, boolean autoReverse){
//        TranslateTransition translateOrc = new TranslateTransition();
//        translateOrc.setNode(imageView);
//        translateOrc.setDuration(duration);
//        translateOrc.setCycleCount(TranslateTransition.INDEFINITE);
//        translateOrc.setByY(translatedAmount);
//        translateOrc.setAutoReverse(autoReverse);
//        translateOrc.play();
//    }
    private void scoreCoinRotate(ImageView imageView, int rotatedAngle, Duration duration){
        RotateTransition rotateScoreCoin = new RotateTransition();
        rotateScoreCoin.setNode(imageView);
        rotateScoreCoin.setDuration(duration);
        rotateScoreCoin.setCycleCount(RotateTransition.INDEFINITE);
        rotateScoreCoin.setToAngle(rotatedAngle);
        rotateScoreCoin.setAxis(Rotate.Y_AXIS);
        rotateScoreCoin.setAutoReverse(false);
        rotateScoreCoin.play();
    }
    private void gameCoinRotate(ImageView imageView, int rotatedAngle, Duration duration){
        RotateTransition rotateGameCoin1 = new RotateTransition();
        rotateGameCoin1.setNode(imageView);
        rotateGameCoin1.setDuration(duration);
        rotateGameCoin1.setCycleCount(RotateTransition.INDEFINITE);
        rotateGameCoin1.setToAngle(rotatedAngle);
        rotateGameCoin1.setAxis(Rotate.Y_AXIS);
        rotateGameCoin1.setAutoReverse(false);
        rotateGameCoin1.play();
    }
    private void islandTranslateY(ImageView imageView, double translatedAmount, Duration duration, boolean autoReverse){
        TranslateTransition translateIsland = new TranslateTransition();
        translateIsland.setNode(imageView);
        translateIsland.setDuration(duration);
        translateIsland.setCycleCount(TranslateTransition.INDEFINITE);
        translateIsland.setByY(translatedAmount);
        translateIsland.setAutoReverse(autoReverse);
        translateIsland.play();
    }

    private void navigationDrawer() throws IOException {
        navigationContent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NavigationDrawerContent.fxml")));
        drawer.setSidePane(navigationContent);

        HamburgerBackArrowBasicTransition hamburgerBackArrowBasicTransition = new HamburgerBackArrowBasicTransition(hamburger);
        hamburgerBackArrowBasicTransition.setRate(-1.0);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
            hamburgerBackArrowBasicTransition.setRate(hamburgerBackArrowBasicTransition.getRate() * -1.0);
            hamburgerBackArrowBasicTransition.play();

            if (drawer.isOpened()) {
                drawer.close();
            } else {
                drawer.open();
            }
        });
    }

    AnimationTimer collisionTimer = new AnimationTimer() {
        @Override
        public void handle(long timestamp) {
            heroIslandCheckCollision(heroImage, staticIsland1);
            heroIslandCheckCollision(heroImage, staticIsland2);
            heroIslandCheckCollision(heroImage, movingIsland1);
            heroCoinChestCheckCollision(heroImage, coinChest1, CoinChest1);
            heroOrcCheckCollision(heroImage, orcImage1);
            heroCoinCheckCollision(heroImage, gameCoin1);
            orcIslandCheckCollision(orcImage1, staticIsland1);
            orcIslandCheckCollision(orcImage1, staticIsland2);
            orcIslandCheckCollision(orcImage1, movingIsland1);
        }
    };

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        musicPlay();
        try {
            navigationDrawer();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //heroTranslateY(heroImage, 100, Duration.millis(500), true);
        //orcTranslateY(orcImage1, 100, Duration.millis(500), true);
        scoreCoinRotate(scoreCoin, 360, Duration.millis(2500));
        gameCoinRotate(gameCoin1, 360, Duration.millis(1000));
        gameCoinRotate(gameCoin2, 360, Duration.millis(1000));
        gameCoinRotate(gameCoin3, 360, Duration.millis(1000));
        islandTranslateY(movingIsland1, -40, Duration.millis(500), true);

        new RollIn(heroImage).play();
        new Bounce(orcImage1).play();

        collisionTimer.start();

    }

    private void heroOrcCheckCollision(ImageView img1, ImageView img2){
        if(img1.getBoundsInParent().intersects(img2.getBoundsInParent())){
            //orcMoveForward();
        }
    }
    private void heroIslandCheckCollision(ImageView img1, ImageView img2){
        if(img1.getBoundsInParent().intersects(img2.getBoundsInParent())){
        }
    }
    private void orcIslandCheckCollision(ImageView img1, ImageView img2){
        if(img1.getBoundsInParent().intersects(img2.getBoundsInParent())){
        }
    }
    private void heroCoinChestCheckCollision(ImageView img1, ImageView img2, CoinChest coinChest) {
        if (img1.getBoundsInParent().intersects(img2.getBoundsInParent()) && !coinChest.isOpened()) {
            coinChest.chestOpenAnimation(coinChest1);
            coinChest.setOpened(true);
            coinLabel.setText(String.valueOf(Integer.parseInt(coinLabel.getText()) + coinChest.getCoinsPresent()));
        }
    }
    private void heroCoinCheckCollision(ImageView img1, ImageView img2) {
        if (img1.getBoundsInParent().intersects(img2.getBoundsInParent())) {
            if(img2.getImage() != null){
                coinLabel.setText(String.valueOf(Integer.parseInt(coinLabel.getText()) + 1));
                img2.imageProperty().set(null);
            }
        }
    }

    private void gameOver(){
        collisionTimer.stop();
    }
    private void bounce(){

    }

    private void restart() throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NewGame.fxml")));
        stage = (Stage) restartButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    private void help() throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HelpPage.fxml")));
        stage = (Stage) helpButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    private void quit() throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainMenu.fxml")));
        stage = (Stage) quitButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
