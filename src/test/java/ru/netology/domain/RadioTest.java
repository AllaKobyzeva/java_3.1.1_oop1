package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldIncreaseVolumeUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int actual = radio.increaseVolume();

        assertEquals(100, actual);

    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int actual = radio.increaseVolume();

        assertEquals(100, actual);

    }

    @Test
    public void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int actual = radio.increaseVolume();

        assertEquals(100, actual);

    }

    @Test
    public void shouldDecreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int actual = radio.decreaseVolume();

        assertEquals(0, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int actual = radio.decreaseVolume();

        assertEquals(0, actual);
    }

    @Test
    public void shouldDecreaseVolumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.decreaseVolume();

        assertEquals(0, actual);
    }

    //Тесты для переключения радиостанций
    @Test
    public void shouldNextStationUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.nextStation();

        assertEquals(9, actual);

    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int actual = radio.nextStation();

        assertEquals(0, actual);

    }
    @Test
    public void shouldNextStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int actual = radio.nextStation();

        assertEquals(0, actual);

    }
    @Test
        public void shouldNextStationOverMaxWithCount() {
            Radio radio = new Radio(15);
            radio.setCurrentStation(15);
            int actual = radio.nextStation();

            assertEquals(0, actual);
    }

    @Test
    public void shouldPrevStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.prevStation();

        assertEquals(0, actual);
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.prevStation();

        assertEquals(10, actual);
    }

    @Test
    public void shouldPrevStationOverMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.prevStation();

        assertEquals(10, actual);
    }

}
