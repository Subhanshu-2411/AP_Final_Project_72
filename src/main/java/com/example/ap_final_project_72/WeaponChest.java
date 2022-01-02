package com.example.ap_final_project_72;

public class WeaponChest implements Chest{
    private String weaponPresent;

    public WeaponChest(String weaponPresent) {
        this.weaponPresent = weaponPresent;
    }

    public String getWeaponPresent() {
        return weaponPresent;
    }

    public void setWeaponPresent(String weaponPresent) {
        this.weaponPresent = weaponPresent;
    }

    public void chestOpenAnimation() {

    }
}
