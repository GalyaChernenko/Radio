package ru.netology.radio;

public class Radio {
    public int currentTrack;

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

        if (currentTrack == 9) {
            currentTrack = 0;
            return;
        }
        currentTrack = currentTrack + 1;

    }


    public void setPrevTrack() {

        if (currentTrack == 0) {
            currentTrack = 9;
            return;
        }
        currentTrack = currentTrack - 1;

    }


    public int currentVolume;

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
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;

        }
    }
}








