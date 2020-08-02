package ru.netology;

import java.security.PrivateKey;

public class Radio {
    private int currentNumberStation;
    private int enteredNumberStation;
    private Boolean forwardOrBackward;
    private int currentSoundVolume;
    private Boolean upOrDoun;


    public void setEnteredNumberStation(int enteredNumberStation) {
        this.enteredNumberStation = enteredNumberStation;
    }

    public void setForwardOrBackward(Boolean forwardOrBackward) {
        this.forwardOrBackward = forwardOrBackward;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setUpOrDoun(Boolean upOrDoun) {
        this.upOrDoun = upOrDoun;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void NumberStation() {
        if (enteredNumberStation != 10) {
            currentNumberStation = enteredNumberStation;
            this.currentNumberStation = currentNumberStation;
            return;
        }
        if (forwardOrBackward == true) {
            if (currentNumberStation == 9) currentNumberStation = -1;
            currentNumberStation++;
            this.currentNumberStation = currentNumberStation;
            return;
        } else {
            if (currentNumberStation == 0) currentNumberStation = 10;
            currentNumberStation--;
            this.currentNumberStation = currentNumberStation;
            return;
        }
    }

    public void VolumeStation() {
        if (upOrDoun == true) {
            if (currentSoundVolume >= 10) {
                currentSoundVolume = 10;
                return;
            } else {
                currentSoundVolume++;
                return;
            }
        } else {
            if (currentSoundVolume <= 0) {
                currentSoundVolume = 0;
                return;
            } else {
                currentSoundVolume--;
                return;
            }
        }
    }
}

