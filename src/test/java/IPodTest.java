import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IPodTest {

    private IPod iPod;
    private Stereo stereo;
    private CassettePlayer cassettePlayer;
    private CDPlayer cdPlayer;
    private Radio radio;

    @Before
    public void setup() {
        iPod = new IPod("Apple", "3rd Gen");
        cassettePlayer = new CassettePlayer("Sony", "A300");
        cdPlayer = new CDPlayer("Sony", "AB9001", 10);
        radio = new Radio("Sony", "RB605");
        stereo = new Stereo("Super Stereo 3000", cassettePlayer, cdPlayer, radio);
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", iPod.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("3rd Gen", iPod.getModel());
    }

    @Test
    public void canConnectToStereo() {
        assertEquals("Connected to Super Stereo 3000", iPod.connectToDevice(stereo));
    }
}
