package ru.netology;

import java.security.PrivateKey;

public class Radio {
    private int currentNumberStation;
    private int enteredNumberStation;
    private int currentSoundVolume;

    public void setEnteredNumberStation(int enteredNumberStation) {
        this.enteredNumberStation = enteredNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void NumberStationEntered() {
        if (enteredNumberStation > 9) {
            this.currentNumberStation=9;
            return;
        }
        this.currentNumberStation = enteredNumberStation;
        return;

    }

    public void NumberStationNext() {
        if (currentNumberStation == 9){
            this.currentNumberStation=0;
            return;
        }
        currentNumberStation++;
        this.currentNumberStation = currentNumberStation;
        return;
    }

    public void NumberStationPrev() {
        if (currentNumberStation == 0) currentNumberStation = 10;
        currentNumberStation--;
        this.currentNumberStation = currentNumberStation;
        return;
    }

    public void VolumeStationUp() {
        if (currentSoundVolume >= 10) {
            currentSoundVolume = 10;
            return;
        } else {
            currentSoundVolume++;
            return;
        }

    }

    public void VolumeStationDoun() {
        if (currentSoundVolume <= 0) {
            currentSoundVolume = 0;
            return;
        } else {
            currentSoundVolume--;
            return;
        }
    }
}

