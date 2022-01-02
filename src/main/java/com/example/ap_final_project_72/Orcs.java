package com.example.ap_final_project_72;

public class Orcs extends Obstacles
{
    public double getMax_height() {
        return max_height;
    }

    public void setMax_height(double max_height) {
        this.max_height = max_height;
    }

    private double max_height;
    private double max_speed;
    private double speedx;

    public Boolean getFall() {
        return fall;
    }

    public void setFall(Boolean fall) {
        this.fall = fall;
    }

    private Boolean fall;

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

    public Orcs()
    {
        setSpeedx(0);
        setMax_speed(10);
        setCheck(false);
        setSpeedy(-1);
        setMax_height(8);
        setHeight(0);
    }
}
