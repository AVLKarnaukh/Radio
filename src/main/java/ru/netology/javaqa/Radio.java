package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            setToMaxVolume();
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            setToMinVolume();
        }
    }

    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            setToMinRadioStation();
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            setToMaxRadioStation();
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
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

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }


}
