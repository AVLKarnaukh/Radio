package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetToMaxVolume() {
        Radio vol = new Radio();
        vol.setToMaxVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio vol = new Radio();
        vol.setToMinVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.increaseVolume();
        int expected = 100;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(98);
        vol.increaseVolume();
        int expected = 99;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.decreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldDecreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(5);
        vol.decreaseVolume();
        int expected = 4;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio vol = new Radio();
        vol.setToMaxRadioStation();

        int expected = 9;
        int actual = vol.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio vol = new Radio();
        vol.setToMinRadioStation();

        int expected = 0;
        int actual = vol.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationMin() {
        Radio vol = new Radio();
        vol.setCurrentRadioStation(9);
        vol.increaseRadioStation();
        int expected = 0;
        int actual = vol.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseRadioStation() {
        Radio vol = new Radio();
        vol.setCurrentRadioStation(7);
        vol.increaseRadioStation();
        int expected = 8;
        int actual = vol.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationMax() {
        Radio vol = new Radio();
        vol.setCurrentRadioStation(0);
        vol.decreaseRadioStation();
        int expected = 9;
        int actual = vol.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseRadioStation() {
        Radio vol = new Radio();
        vol.setCurrentRadioStation(4);
        vol.decreaseRadioStation();
        int expected = 3;
        int actual = vol.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationMin() {
        Radio vol = new Radio();
        vol.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = vol.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationMax() {
        Radio vol = new Radio();
        vol.setCurrentRadioStation(10);
        int expected = 0;
        int actual = vol.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolumeMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolumeMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(101);
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
