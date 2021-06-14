package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldIncreaseVolumeUnderMax() {
        Radio radio = new Radio();
        radio.increaseVolume(9);

        assertEquals (10, radio.getCurrentVolume());

    }
    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.increaseVolume(10);

        assertEquals (10, radio.getCurrentVolume());

    }
    @Test
    public void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.increaseVolume(11);

        assertEquals (10, radio.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.decreaseVolume(1);

        assertEquals (0, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.decreaseVolume(0);

        assertEquals (0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeOverMin() {
        Radio radio = new Radio();
        radio.decreaseVolume(-1);

        assertEquals (0, radio.getCurrentVolume());
    }
    //Тесты для переключения радиостанций
    @Test
    public void shouldNextStationUnderMax() {
        Radio radio = new Radio();
        radio.nextStation(8);

        assertEquals (9, radio.getCurrentStation());

    }
    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.nextStation(9);

        assertEquals (0, radio.getCurrentStation());

    }
    @Test
    public void shouldNextStationOverMax() {
        Radio radio = new Radio();
        radio.nextStation(10);

        assertEquals (0, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStationUnderMin() {
        Radio radio = new Radio();
        radio.prevStation(1);

        assertEquals (0, radio.getCurrentStation());
    }
    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        radio.prevStation(0);

        assertEquals (9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationOverMin() {
        Radio radio = new Radio();
        radio.prevStation(-1);

        assertEquals (9, radio.getCurrentStation());
    }
}

