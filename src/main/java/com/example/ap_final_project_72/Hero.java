package com.example.ap_final_project_72;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hero
{
    private static ImageView HeroImage;

    public double getMax_height() {
        return max_height;
    }

    public void setMax_height(double max_height) {
        this.max_height = max_height;
    }

    private double max_height;
    private double max_speed;
    private double speedx;

    public double getInitial_speedy() {
        return initial_speedy;
    }

    private final double initial_speedy=-1;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public double getSpeedy() {
        return speedy;
    }

    public void setSpeedy(double speedy) {
        this.speedy = speedy;
    }

    private double speedy;

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    private Boolean check;
    public static void setHeroImage(ImageView heroImage) {
        HeroImage = heroImage;
    }

    public double getSpeedx() {
        return speedx;
    }

    public void setSpeedx(double speedx) {
        this.speedx = speedx;
    }

    public double getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
    }




    public Hero()
    {
        setSpeedx(10);
        setMax_speed(12);
        setCheck(false);
        setSpeedy(-1);
        setMax_height(-9);
        setHeight(0);
    }
    public Hero(ImageView heroImage) {
        HeroImage = heroImage;
    }


    public static void setHeroImage(Image img){
        HeroImage.setImage(img);
    }

    public static Image getHeroImage() {
        return HeroImage.getImage();
    }


}
