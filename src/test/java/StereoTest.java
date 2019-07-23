import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CassettePlayer cassettePlayer;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void setup() {
        cassettePlayer = new CassettePlayer("Sony", "A300");
        cdPlayer = new CDPlayer("Sony", "AB9001", 10);
        radio = new Radio("Sony", "RB605");
        stereo = new Stereo("Super Stereo 3000", cassettePlayer, cdPlayer, radio);
    }

    @Test
    public void hasName() {
        assertEquals("Super Stereo 3000", stereo.getName());
    }

    @Test
    public void hasCassettePlayer() {
        assertEquals(cassettePlayer, stereo.getCassettePlayer());
    }

    @Test
    public void hasCDPlayer() {
        assertEquals(cdPlayer, stereo.getCDPlayer());
    }

    @Test
    public void hasRadio() {
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void canTuneRadio() {
        stereo.tuneRadio("Radio 4");
        assertEquals("Radio 4", stereo.getRadio().getStation());
    }

    @Test
    public void canGetRadioStation() {
        stereo.tuneRadio("Radio 4");
        assertEquals("Radio 4", stereo.getStation());
    }

    @Test
    public void canPlayRadio() {
        assertEquals("Playing radio", stereo.playRadio());
    }

    @Test
    public void canGetCDCapacity() {
        assertEquals(10, stereo.getCDCapacity());
    }

    @Test
    public void canGetNumberOfCDs() {
        assertEquals(0, stereo.getNumberOfCDs());
    }

    @Test
    public void canGetCDCollection() {
        assertEquals(0, stereo.getCDCollection().size());
    }

    @Test
    public void canPlayCD() {
        assertEquals("Playing CD", stereo.playCD());
    }

    @Test
    public void canSkipCD() {
        assertEquals("Song skipped", stereo.skipCDTrack());
    }

    @Test
    public void canGetCassettePlaySpeed() {
        assertEquals(1, stereo.getCassettePlaySpeed());
    }

    @Test
    public void canSpeedUpCassettePlayer() {
        stereo.speedUpCassette();
        assertEquals(2, stereo.getCassettePlaySpeed());
    }

    @Test
    public void canSpeedUpCassetteMultipleTimes() {
        stereo.speedUpCassette();
        stereo.speedUpCassette();
        stereo.speedUpCassette();
        assertEquals(4, stereo.getCassettePlaySpeed());
    }

    @Test
    public void canResetCassetteSpeed() {
        stereo.speedUpCassette();
        stereo.resetCassetteSpeed();
        assertEquals(1, stereo.getCassettePlaySpeed());
    }

    @Test
    public void canPlayCassettePlayer() {
        assertEquals("Playing cassette", stereo.playCassette());
    }

    @Test
    public void canSkipCassetteSong() {
        assertEquals("Song skipped", stereo.skipCassetteTrack());
    }

    @Test
    public void canGetVolume() {
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void canSetVolume() {
        stereo.setVolume(9);
        assertEquals(9, stereo.getVolume());
    }

    @Test
    public void canIncreaseVolume() {
        stereo.increaseVolume();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void canDecreaseVolume() {
        stereo.decreaseVolume();
        assertEquals(4, stereo.getVolume());
    }

    @Test
    public void volumeCannotBeAbove10BySettingIt() {
        stereo.setVolume(100);
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void volumeCannotBeBelow0BySettingIt() {
        stereo.setVolume(-100);
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void cannotIncreaseVolumeAbove10() {
        stereo.setVolume(10);
        stereo.increaseVolume();
        assertEquals(10, stereo.getVolume());
    }

    @Test
    public void cannotDecreaseVolumeBelow0() {
        stereo.setVolume(0);
        stereo.decreaseVolume();
        assertEquals(0, stereo.getVolume());
    }
}
