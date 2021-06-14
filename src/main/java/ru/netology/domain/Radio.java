package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentTemperature(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }
    }
    // Переключение станций
    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void nextStation(int currentStation) {
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        }
    }

    public void prevStation(int currentStation) {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        }
    }
}

