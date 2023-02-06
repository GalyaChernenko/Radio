package ru.netology.radio;

public class Radio {
    private int currentTrack;
    private int currentVolume;


    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(int newCurrentTrack) {

        if (newCurrentTrack < 0) {
            return;
        }
        if (newCurrentTrack > 9) {
            return;
        }

        currentTrack = newCurrentTrack;
    }

    public void setNextTrack() {

        if (currentTrack != 9) {
            currentTrack++;

        } else {
            currentTrack = 0;
        }

    }


    public void setPrevTrack() {

        if (currentTrack != 0) {
            currentTrack--;
        } else {
            currentTrack = 9;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;

        }
    }
}








