import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void setup() {
        cdPlayer = new CDPlayer("Sony", "B6000", 8);
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("B6000", cdPlayer.getModel());
    }

    @Test
    public void startWithNoCDs() {
        assertEquals(0, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void hasCapacity() {
        assertEquals(8, cdPlayer.getCapacity());
    }

    @Test
    public void startsWithEmptyArrayListOfCDs() {
        assertEquals(0, cdPlayer.getCDCollection().size());
    }
}
