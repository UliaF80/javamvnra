import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void testSwitchNextCurrentStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(-1);


        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchNextTuCurrentStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationsMoreMaxStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchPrevCurrentStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationEquallyMaxStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testControlApCurrentVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(10);

        radio.ap();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testControlUnderCurrentVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(-1);

        radio.under();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxVolumeNotAct() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(11);

        radio.ap();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinVolumeNotAct() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(10);

        radio.under();
        int actual = radio.getCurrentVolume();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }
}
