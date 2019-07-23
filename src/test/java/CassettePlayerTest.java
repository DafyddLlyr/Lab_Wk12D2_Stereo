import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassettePlayerTest {

    CassettePlayer cassettePlayer;

    @Before
    public void setup() {
        cassettePlayer = new CassettePlayer("Sony", "AS2600");
    }

    @Test
    public void hasModel() {
        assertEquals("Sony", cassettePlayer.getMake());
    }

    @Test
    public void hasMake() {
        assertEquals("AS2600", cassettePlayer.getModel());
    }

    @Test
    public void startsWithPlaySpeed1() {
        assertEquals(1, cassettePlayer.getPlaySpeed());
    }

    @Test
    public void canIncrementPlaySpeed() {
        cassettePlayer.speedUp();
        assertEquals(2, cassettePlayer.getPlaySpeed());
    }

    @Test
    public void canIncrementPlaySpeedMultipleTimes() {
        cassettePlayer.speedUp();
        cassettePlayer.speedUp();
        cassettePlayer.speedUp();
        assertEquals(4, cassettePlayer.getPlaySpeed());
    }

    @Test
    public void canResetPlaySpeed() {
        cassettePlayer.speedUp();
        cassettePlayer.resetSpeed();
        assertEquals(1, cassettePlayer.getPlaySpeed());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing cassette", cassettePlayer.play());
    }

    @Test
    public void canSkipSong() {
        assertEquals("Song skipped", cassettePlayer.skip());
    }

}
