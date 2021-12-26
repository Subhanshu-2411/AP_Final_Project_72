package com.example.ap_final_project_72;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hero {
    private static ImageView HeroImage;


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
