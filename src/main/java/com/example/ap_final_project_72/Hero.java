package com.example.ap_final_project_72;

import javafx.scene.image.Image;

public class Hero {
    private static Image HeroImage;

    public Hero(Image heroImage) {
        HeroImage = heroImage;
    }


    public static void setHeroImage(Image img){
        HeroImage = img;
    }

    public static Image getHeroImage() {
        return HeroImage;
    }
}
