package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetTrackX() {


        Radio radio = new Radio(20);
        radio.setCurrentTrack(15);
        int expected = 15;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTrack() {


        Radio radio = new Radio();
        radio.setCurrentTrack(8);
        int expected = 8;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTrackMinus() {
        Radio radio = new Radio();
        radio.setCurrentTrack(-1);
        int expected = 0;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTrack() {


        Radio radio = new Radio();
        radio.setCurrentTrack(10);
        int expected = 0;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextTrack() {


        Radio radio = new Radio();
        radio.setCurrentTrack(6);
        radio.setNextTrack();
        int expected = 7;
        int actual = radio.getCurrentTrack();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextTrack0() {


        Radio radio = new Radio();
        radio.setCurrentTrack(9);
        radio.setNextTrack();
        int expected = 0;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextTrack9() {


        Radio radio = new Radio();
        radio.setCurrentTrack(8);
        radio.setNextTrack();
        int expected = 9;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevTrack() {


        Radio radio = new Radio();
        radio.setCurrentTrack(9);
        radio.setPrevTrack();
        int expected = 8;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevTrack9() {


        Radio radio = new Radio();
        radio.setCurrentTrack(0);
        radio.setPrevTrack();
        int expected = 9;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevTrack0() {


        Radio radio = new Radio();
        radio.setCurrentTrack(1);
        radio.setPrevTrack();
        int expected = 0;
        int actual = radio.getCurrentTrack();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {


        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {


        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetVolume() {


        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {


        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume10() {


        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume0() {


        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {


        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume0() {


        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume10() {


        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

