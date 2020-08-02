package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "NumberStationEnter,2,,6,6",
            "NumberStationFrom_0Forward,0,true,10,1",
            "NumberStationFrom_5Forward,5,true,10,6",
            "NumberStationFrom_9Forward,9,true,10,0",
            "NumberStationFrom_0Forward,0,false,10,9",
            "NumberStationFrom_5Forward,5,false,10,4",
            "NumberStationFrom_9Forward,9,false,10,8"
    })
    public void NumberStation(String name, int currentNumberStation, Boolean forwardOrBackward,
                              int enteredNumberStation, int expected) {
        Radio station = new Radio();
        station.setCurrentNumberStation(currentNumberStation);
        station.setForwardOrBackward(forwardOrBackward);
        station.setEnteredNumberStation(enteredNumberStation);
        station.NumberStation();
        int actual = station.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "volumeUpFrom_0,0,true,1",
            "volumeUpFrom_5,5,true,6",
            "volumeUpFrom_max,10,true,10",
            "volumeDownFrom_10,10,False,9",
            "volumeDownFrom_6,6,False,5",
            "volumeDownFrom_min,0,False,0"
    })
    public void VolumeStation(String name, int currentSoundVolume, Boolean upOrDoun, int expected) {
        Radio station = new Radio();
        station.setCurrentSoundVolume(currentSoundVolume);
        station.setUpOrDoun(upOrDoun);
        station.VolumeStation();
        int actual = station.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

}
