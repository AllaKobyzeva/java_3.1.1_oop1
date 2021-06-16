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

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
        else if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        }
        else if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }
        return currentVolume;
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

    public int nextStation() {
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        }
        else if (currentStation >= maxStation) {
            this.currentStation = minStation;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        }
        else if (currentStation <= minStation) {
            this.currentStation = maxStation;
        }
        return currentStation;
    }
}
