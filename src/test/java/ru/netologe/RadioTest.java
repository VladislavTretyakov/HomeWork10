package ru.netologe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test void numberStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);

        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        volume.nextVolume();

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveBorderVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.nextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        volume.previousVolume();

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beyondUpperLimitVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowLowerLimitVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerBoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.previousVolume();

        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void NextStation() {
        Radio station = new Radio();
        station.setCurrentStation(6);
        station.nextStation();

        int expected = 7;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAfterUpperBoundStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.prevStation();

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowLowerLimitStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveBorderStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeMeaningStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
