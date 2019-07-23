import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setup() {
        radio = new Radio("Sony", "A380");
    }

    @Test
    public void radioBeginsWithNoStation() {
        assertEquals(null, radio.getStation());
    }

    @Test
    public void tuneReturnsString() {
        assertEquals("Radio 4", radio.tune("Radio 4"));
    }

    @Test
    public void tuneUpdatesStation() {
        radio.tune("Radio 2");
        assertEquals("Radio 2", radio.getStation());
    }

    @Test
    public void hasModel() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasMake() {
        assertEquals("A380", radio.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing radio", radio.play());
    }

}


