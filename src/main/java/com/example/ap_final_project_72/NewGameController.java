package com.example.ap_final_project_72;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class NewGameController implements Initializable
{
    public static int mode;
    private Hero hero=new Hero();
    private Orcs orc1=new Orcs();
    private Orcs orc2=new Orcs();
    private Orcs orc3=new Orcs();
    private Orcs orc4=new Orcs();
    private Orcs orc5=new Orcs();
    private ActionEvent event = new ActionEvent();
    private Parent root;
    private Stage stage;
    private Scene scene;
    private int steps, points;
    Media media=new Media(new File("src/main/resources/com/example/ap_final_project_72/music/backgroundMusic.mp3").toURI().toString());
    MediaPlayer mediaPlayer=new MediaPlayer(media);


    @FXML
    private AnchorPane staticPane, dynamicPane;

    @FXML
    private Label stepsLabel;

    @FXML
    private Rectangle rectangle_island1, rectangle_island2, rectangle_island3,
    rectangle_island4, rectangle_island5, rectangle_island6, rectangle_island7, rectangle_island8;

    @FXML
    private Label pointsLabel;

    private Timeline timeline1=new Timeline();

    private Timeline orc1_timeline, coin_timeline;

    private RotateTransition rotateScoreCoin=new RotateTransition();
    private RotateTransition rotateGameCoin1=new RotateTransition();
    private int coins;
    private Timeline hero_timeline;

    @FXML
    private ImageView orcImage1, orcImage2, orcImage3,orcImage4, orcImage5, heroImage, scoreCoin,
            movingIsland1, coinChest1,speaker,mute,tnt;

    @FXML
    private ImageView gameCoin1, gameCoin2, gameCoin3,gameCoin4,gameCoin5, gameCoin6,gameCoin7;


    @FXML
    private Button playButton, helpButton, quitButton, restartButton, resumeButton, speakerButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Label coinLabel;

    @FXML
    public void  heroTranslateX() throws IOException
    {
          hero.setCheck(true);
          orc1.setCheck(true);
          steps++;
          stepsLabel.setText("Steps: "+(steps));
    }
    public void move_hero() throws IOException
    {
        if(hero.getCheck())
        {
            if(hero.getSpeedx()<=hero.getMax_speed())
            {
                hero.setSpeedx(hero.getSpeedx()+0.3*mode);
                double v=heroImage.getLayoutX();
                System.out.println("Hero layout before edit: "+heroImage.getLayoutX());
                System.out.println("Dynamic pane layout before edit: "+dynamicPane.getLayoutX());
                heroImage.setLayoutX(heroImage.getLayoutX()+hero.getSpeedx());
                dynamicPane.setLayoutX(dynamicPane.getLayoutX()-hero.getSpeedx());
                System.out.println("Hero layout after edit: "+heroImage.getLayoutX());
                System.out.println("Orc layout"+orcImage1.getLayoutX());
                System.out.println("Dynamic pane layout after edit: "+dynamicPane.getLayoutX());
                System.out.println();

                if(heroImage.getBoundsInParent().intersects(gameCoin1.getBoundsInParent()))
                {
                    gameCoin1.setOpacity(0);
                    coins++;
                    coinLabel.setText(""+coins);
                }
                if(heroImage.getBoundsInParent().intersects(tnt.getBoundsInParent()))
                {
                    System.exit(0);
                }
                if(heroImage.getBoundsInParent().intersects(coinChest1.getBoundsInParent()))
                {
//                    Image image1 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_1.png");
//                    Image image2 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_2.png");
//                    Image image3 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_3.png");
//                    Image image4 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_4.png");
//                    Image image5 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_5.png");
//                    Image image6 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_6.png");
//                    Image image7 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_7.png");
//                    Image image8 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_8.png");
//                    Image image9 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_9.png");
//                    Image image10 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_10.png");
//                    Image image11 = new Image("src/main/resources/com/example/ap_final_project_72/images/chest_a_11.png");
//                    ImageView imageView = new ImageView();
//                    Timeline timeline = new Timeline(
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image1)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image2)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image3)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image4)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image5)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image6)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image7)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image8)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image9)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image10)),
//                            new KeyFrame(Duration.millis(10), new KeyValue(imageView.imageProperty(), image11))
//                    );
//                    timeline.play();
                    coins+=3;
                    coinLabel.setText(""+coins);
                }
                if(heroImage.getBoundsInParent().intersects(gameCoin2.getBoundsInParent()))
                {
                    gameCoin2.setOpacity(0);
                    coins++;
                    coinLabel.setText(""+coins);
                }
                if(heroImage.getBoundsInParent().intersects(gameCoin3.getBoundsInParent()))
                {
                    gameCoin3.setOpacity(0);
                    coins++;
                    coinLabel.setText(""+coins);
                }
                if(heroImage.getBoundsInParent().intersects(gameCoin4.getBoundsInParent()))
                {
                    gameCoin4.setOpacity(0);
                    coins++;
                    coinLabel.setText(""+coins);
                }
                if(heroImage.getBoundsInParent().intersects(gameCoin5.getBoundsInParent()))
                {
                    gameCoin5.setOpacity(0);
                    coins++;
                    coinLabel.setText(""+coins);
                }
                if(heroImage.getBoundsInParent().intersects(gameCoin6.getBoundsInParent()))
                {
                    gameCoin6.setOpacity(0);
                    coins++;
                    coinLabel.setText(""+coins);
                }
                if(heroImage.getBoundsInParent().intersects(gameCoin7.getBoundsInParent()))
                {
                    gameCoin7.setOpacity(0);
                    coins++;
                    coinLabel.setText(""+coins);
                }
                if(heroImage.getBoundsInParent().intersects(orcImage1.getBoundsInParent()))
                {
                    orcImage1.setLayoutX(orcImage1.getLayoutX()+40);
                    heroImage.setLayoutX(heroImage.getLayoutX()-20);
                    dynamicPane.setLayoutX(dynamicPane.getLayoutX()+20);
                    points++;
                    pointsLabel.setText("Points: "+(points));
                    //System.exit(0);
                }
                if(heroImage.getBoundsInParent().intersects(orcImage2.getBoundsInParent()))
                {
                    orcImage2.setLayoutX(orcImage2.getLayoutX()+40);
                    heroImage.setLayoutX(heroImage.getLayoutX()-20);
                    dynamicPane.setLayoutX(dynamicPane.getLayoutX()+20);
                    points++;
                    pointsLabel.setText("Points: "+(points));
                    //System.exit(0);
                }
                if(heroImage.getBoundsInParent().intersects(orcImage3.getBoundsInParent()))
                {
                    orcImage3.setLayoutX(orcImage3.getLayoutX()+40);
                    heroImage.setLayoutX(heroImage.getLayoutX()-20);
                    dynamicPane.setLayoutX(dynamicPane.getLayoutX()+20);
                    points++;
                    pointsLabel.setText("Points: "+(points));
                    //System.exit(0);
                }
                if(heroImage.getBoundsInParent().intersects(orcImage4.getBoundsInParent()))
                {
                    orcImage4.setLayoutX(orcImage4.getLayoutX()+40);
                    heroImage.setLayoutX(heroImage.getLayoutX()-20);
                    dynamicPane.setLayoutX(dynamicPane.getLayoutX()+20);
                    points++;
                    pointsLabel.setText("Points: "+(points));
                    //System.exit(0);
                }
            }
            else
            {
                hero.setCheck(false);
                hero.setSpeedx(0);
            }
        }
    }

    @FXML
    private void change()
    {
        if(speaker.getOpacity()==0)
        {
            speaker.setOpacity(1);
            mute.setOpacity(0);
            mediaPlayer.play();
        }
        else
        {
            mute.setOpacity(1);
            speaker.setOpacity(0);
            mediaPlayer.pause();
        }
    }
    private void heroTranslateY()
    {
            if(hero.getHeight()>=hero.getMax_height())
            {
                hero.setSpeedy(hero.getSpeedy()-0.01);
                heroImage.setLayoutY(heroImage.getLayoutY()+hero.getSpeedy());
                hero.setHeight(hero.getHeight()+hero.getSpeedy());
            }
            else
            {
                hero.setSpeedy(hero.getSpeedy()+0.01);
                heroImage.setLayoutY(heroImage.getLayoutY()+hero.getSpeedy());

            }

        if(heroImage.getBoundsInParent().intersects(rectangle_island1.getBoundsInParent()))
        {

            hero.setSpeedy(-1);
            hero.setHeight(0);
        }
        if(heroImage.getBoundsInParent().intersects(rectangle_island2.getBoundsInParent()))
        {

            hero.setSpeedy(-1);
            hero.setHeight(0);
        }
        if(heroImage.getBoundsInParent().intersects(rectangle_island3.getBoundsInParent()))
        {

            hero.setSpeedy(-1);
            hero.setHeight(0);
        }
        if(heroImage.getBoundsInParent().intersects(rectangle_island4.getBoundsInParent()))
        {

            hero.setSpeedy(-1);
            hero.setHeight(0);
        }
        if(heroImage.getBoundsInParent().intersects(rectangle_island5.getBoundsInParent()))
        {

            hero.setSpeedy(-1);
            hero.setHeight(0);
        }
        if(heroImage.getBoundsInParent().intersects(rectangle_island6.getBoundsInParent()))
        {

            hero.setSpeedy(-1);
            hero.setHeight(0);
        }
        if(heroImage.getBoundsInParent().intersects(rectangle_island7.getBoundsInParent()))
        {

            hero.setSpeedy(-1);
            hero.setHeight(0);
        }
        if(heroImage.getBoundsInParent().intersects(rectangle_island8.getBoundsInParent()))
        {

            hero.setSpeedy(-1);
            hero.setHeight(0);
        }
        if(heroImage.getLayoutY()>400)
        {
            System.exit(0);
        }
    }

    private void orc1_TranslateY()
    {
        if(orc1.getHeight()>=orc1.getMax_height())
        {
            //System.out.println("In IF part: value of layout->"+orcImage1.getLayoutY());
            //System.out.println("height:"+orcImage1.getHeight());
            orc1.setSpeedy(orc1.getSpeedy()-0.01);
            System.out.println("speed"+orc1.getSpeedy());
            orcImage1.setLayoutY(orcImage1.getLayoutY()+orc1.getSpeedy());
            orc1.setHeight(orc1.getHeight()+orc1.getSpeedy());
        }
        else
        {
            orc1.setSpeedy(orc1.getSpeedy()+0.01);
            orcImage1.setLayoutY(orcImage1.getLayoutY()+orc1.getSpeedy());
        }

        if(orcImage1.getBoundsInParent().intersects(rectangle_island2.getBoundsInParent()))
        {

            orc1.setSpeedy(-1);
            orc1.setHeight(0);
        }

        if(orcImage1.getBoundsInParent().intersects(rectangle_island3.getBoundsInParent()))
        {

            orc1.setSpeedy(-1);
            orc1.setHeight(0);
        }
        if(orcImage1.getBoundsInParent().intersects(rectangle_island4.getBoundsInParent()))
        {

            orc1.setSpeedy(-1);
            orc1.setHeight(0);
        }
        if(orcImage1.getBoundsInParent().intersects(rectangle_island5.getBoundsInParent()))
        {

            orc1.setSpeedy(-1);
            orc1.setHeight(0);
        }
        if(orcImage1.getBoundsInParent().intersects(rectangle_island6.getBoundsInParent()))
        {

            orc1.setSpeedy(-1);
            orc1.setHeight(0);
        }
        if(orcImage1.getBoundsInParent().intersects(rectangle_island7.getBoundsInParent()))
        {

            orc1.setSpeedy(-1);
            orc1.setHeight(0);
        }
        if(orcImage1.getBoundsInParent().intersects(rectangle_island8.getBoundsInParent()))
        {

            orc1.setSpeedy(-1);
            orc1.setHeight(0);
        }
        if(orcImage1.getLayoutY()>400)
        {

        }
    }

    private void orc2_TranslateY()
    {
        if(orc2.getHeight()>=orc2.getMax_height())
        {
            orc2.setSpeedy(orc2.getSpeedy()-0.01);
            orcImage2.setLayoutY(orcImage2.getLayoutY()+orc2.getSpeedy());
            orc2.setHeight(orc2.getHeight()+orc2.getSpeedy());
        }
        else
        {
            orc2.setSpeedy(orc2.getSpeedy()+0.01);
            orcImage2.setLayoutY(orcImage2.getLayoutY()+orc2.getSpeedy());
        }

        if(orcImage2.getBoundsInParent().intersects(rectangle_island5.getBoundsInParent()))
        {
            orc2.setSpeedy(-1);
            orc2.setHeight(0);
        }
        if(orcImage2.getBoundsInParent().intersects(rectangle_island6.getBoundsInParent()))
        {
            orc2.setSpeedy(-1);
            orc2.setHeight(0);
        }
        if(orcImage2.getBoundsInParent().intersects(rectangle_island7.getBoundsInParent()))
        {
            orc2.setSpeedy(-1);
            orc2.setHeight(0);
        }
        if(orcImage2.getBoundsInParent().intersects(rectangle_island8.getBoundsInParent()))
        {
            orc2.setSpeedy(-1);
            orc2.setHeight(0);
        }
        if(orcImage2.getLayoutY()>400)
        {

        }
    }

    private void orc3_TranslateY()
    {
        if(orc3.getHeight()>=orc3.getMax_height())
        {
            orc3.setSpeedy(orc3.getSpeedy()-0.01);
            orcImage3.setLayoutY(orcImage3.getLayoutY()+orc3.getSpeedy());
            orc3.setHeight(orc3.getHeight()+orc3.getSpeedy());
        }
        else
        {
            orc3.setSpeedy(orc3.getSpeedy()+0.01);
            orcImage3.setLayoutY(orcImage3.getLayoutY()+orc3.getSpeedy());
        }

        if(orcImage3.getBoundsInParent().intersects(rectangle_island6.getBoundsInParent()))
        {
            orc3.setSpeedy(-1);
            orc3.setHeight(0);
        }
        if(orcImage3.getBoundsInParent().intersects(rectangle_island7.getBoundsInParent()))
        {
            orc3.setSpeedy(-1);
            orc3.setHeight(0);
        }
        if(orcImage3.getBoundsInParent().intersects(rectangle_island8.getBoundsInParent()))
        {
            orc3.setSpeedy(-1);
            orc3.setHeight(0);
        }

        if(orcImage3.getLayoutY()>400)
        {

        }
    }

    private void orc4_TranslateY()
    {
        if(orc4.getHeight()>=orc4.getMax_height())
        {
            orc4.setSpeedy(orc4.getSpeedy()-0.01);
            orcImage4.setLayoutY(orcImage4.getLayoutY()+orc4.getSpeedy());
            orc4.setHeight(orc4.getHeight()+orc4.getSpeedy());
        }
        else
        {
            orc4.setSpeedy(orc4.getSpeedy()+0.01);
            orcImage4.setLayoutY(orcImage4.getLayoutY()+orc4.getSpeedy());
        }

        if(orcImage4.getBoundsInParent().intersects(rectangle_island6.getBoundsInParent()))
        {
            orc4.setSpeedy(-1);
            orc4.setHeight(0);
        }

        if(orcImage4.getBoundsInParent().intersects(rectangle_island7.getBoundsInParent()))
        {
            orc4.setSpeedy(-1);
            orc4.setHeight(0);
        }

        if(orcImage4.getBoundsInParent().intersects(rectangle_island8.getBoundsInParent()))
        {
            orc4.setSpeedy(-1);
            orc4.setHeight(0);
        }

        if(orcImage4.getLayoutY()>400)
        {

        }
    }
    private void orc5_TranslateY()
    {
        if(orc5.getHeight()>=orc5.getMax_height())
        {
            orc5.setSpeedy(orc5.getSpeedy()-0.01);
            orcImage5.setLayoutY(orcImage5.getLayoutY()+orc5.getSpeedy());
            orc5.setHeight(orc5.getHeight()+orc5.getSpeedy());
        }
        else
        {
            orc5.setSpeedy(orc5.getSpeedy()+0.01);
            orcImage5.setLayoutY(orcImage5.getLayoutY()+orc5.getSpeedy());
        }

        if(orcImage5.getBoundsInParent().intersects(rectangle_island8.getBoundsInParent()))
        {
            orc5.setSpeedy(-1);
            orc5.setHeight(0);
        }

        if(orcImage5.getLayoutY()>400)
        {

        }
    }
//    private void CoinRotate(ImageView imageView, int rotatedAngle, Duration duration){
//        rotateScoreCoin.setNode(imageView);
//        rotateScoreCoin.setDuration(duration);
//        rotateScoreCoin.setCycleCount(RotateTransition.INDEFINITE);
//        rotateScoreCoin.setToAngle(rotatedAngle);
//        rotateScoreCoin.setAxis(Rotate.Y_AXIS);
//        rotateScoreCoin.setAutoReverse(false);
//        rotateScoreCoin.play();
//    }

    private void islandTranslateY(){


        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline1.setAutoReverse(true);
        KeyValue kv1 = new KeyValue(movingIsland1.yProperty(), 100, Interpolator.EASE_BOTH);
        KeyFrame kf1 = new KeyFrame(Duration.millis(500), kv1);
        timeline1.getKeyFrames().add(kf1);

        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline1.setAutoReverse(true);
        KeyValue kv2 = new KeyValue(rectangle_island3.yProperty(), 100, Interpolator.EASE_BOTH);
        KeyFrame kf2 = new KeyFrame(Duration.millis(500), kv2);
        timeline1.getKeyFrames().add(kf2);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        steps=0;
        points=0;
        coins=0;
        mediaPlayer.setAutoPlay(true);
        hero_timeline=new Timeline(new KeyFrame(Duration.millis(4/mode), event2->{
            try {
                move_hero();
                heroTranslateY();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ));
        hero_timeline.setCycleCount(Timeline.INDEFINITE);
        hero_timeline.setAutoReverse(false);
        System.out.println("(initial)Dynamic pane layout: "+dynamicPane.getLayoutX());
        System.out.println("(initial)hero layout: "+heroImage.getLayoutX());
        orc1_timeline=new Timeline(new KeyFrame(Duration.millis(3), event2->{

            orc1_TranslateY();
            orc2_TranslateY();
            orc3_TranslateY();
            orc4_TranslateY();
            orc5_TranslateY();
        }
        ));


        orc1_timeline.setCycleCount(Timeline.INDEFINITE);
        orc1_timeline.setAutoReverse(false);
//        coin_timeline=new Timeline(new KeyFrame(Duration.millis(3), event2->{
//
//            CoinRotate(scoreCoin, 360, Duration.millis(1000));
//            CoinRotate(gameCoin1, 360, Duration.millis(1000));
//            CoinRotate(gameCoin2, 360, Duration.millis(1000));
//            CoinRotate(gameCoin3, 360, Duration.millis(1000));
//            CoinRotate(gameCoin4, 360, Duration.millis(1000));
//            CoinRotate(gameCoin5, 360, Duration.millis(1000));
//            CoinRotate(gameCoin6, 360, Duration.millis(1000));
//            CoinRotate(gameCoin7, 360, Duration.millis(1000));
//
//        }));


        orc1_timeline.setCycleCount(Timeline.INDEFINITE);
        orc1_timeline.setAutoReverse(false);

//

        islandTranslateY();
        timeline1.play();

        hero_timeline.play();
        orc1_timeline.play();
    }

    @FXML
    private void pause() throws IOException
    {
        timeline1.pause();
        orc1_timeline.pause();
        rotateScoreCoin.pause();
        rotateGameCoin1.pause();
        hero_timeline.pause();
    }
    @FXML
    private void resume() throws IOException
    {
        timeline1.play();
        rotateScoreCoin.play();
        rotateGameCoin1.play();
        hero_timeline.play();
        orc1_timeline.play();
    }

    @FXML
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