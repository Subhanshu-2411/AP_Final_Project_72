package com.example.ap_final_project_72;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class CoinChest implements Chest{
    private int coinsPresent;
    private boolean opened;

    public CoinChest(int coinsPresent, boolean opened) {
        this.coinsPresent = coinsPresent;
        this.opened = opened;
    }

    public int getCoinsPresent() {
        return coinsPresent;
    }

    public void setCoinsPresent(int coinsPresent) {
        this.coinsPresent = coinsPresent;
    }

    public void chestOpenAnimation(ImageView chestImage) {
        chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_1.png"));


        Timeline animation = new Timeline();
        animation.setCycleCount(1);
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_2.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_3.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_4.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_5.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_6.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_7.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_8.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_9.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_10.png"));
        }));
        animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), (ActionEvent event) -> {
            chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_11.png"));
        }));
        animation.play();

        //chestImage.setImage(new Image("D:\\Users\\subha\\IdeaProjects\\AP_Final_Project_72\\src\\main\\resources\\com\\example\\ap_final_project_72\\images\\chest_a_11.png"));


    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }
}
