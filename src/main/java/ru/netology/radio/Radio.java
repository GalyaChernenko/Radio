package ru.netology.radio;

public class Radio {
    private int currentTrack;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        maxStation = 9;

    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }


    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(int newCurrentTrack) {

        if (newCurrentTrack < 0) {
            return;
        }
        if (newCurrentTrack > maxStation) {
            return;
        }

        currentTrack = newCurrentTrack;
    }

    public void setNextTrack() {

        if (currentTrack != maxStation) {
            currentTrack++;

        } else {
            currentTrack = 0;
        }

    }


    public void setPrevTrack() {

        if (currentTrack != 0) {
            currentTrack--;
        } else {
            currentTrack = maxStation;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;

        }
    }
}








