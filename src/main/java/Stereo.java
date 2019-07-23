import java.util.ArrayList;

public class Stereo {

    private String name;
    private CassettePlayer cassettePlayer;
    private CDPlayer cdPlayer;
    private Radio radio;
    private int volume;

    public Stereo(String name, CassettePlayer cassettePlayer, CDPlayer cdPlayer, Radio radio) {
        this.name = name;
        this.cassettePlayer = cassettePlayer;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
        this.volume = 5;
    }

    public String getName() {
        return this.name;
    }

    public CassettePlayer getCassettePlayer() {
        return this.cassettePlayer;
    }

    public CDPlayer getCDPlayer() {
        return this.cdPlayer;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public void tuneRadio(String station) {
        this.radio.tune(station);
    }

    public String getStation() {
        return this.radio.getStation();
    }

    public String playRadio() {
        return this.radio.play();
    }

    public int getCDCapacity() {
        return this.cdPlayer.getCapacity();
    }

    public int getNumberOfCDs() {
        return this.cdPlayer.getNumberOfCDs();
    }

    public ArrayList<String> getCDCollection() {
        return this.cdPlayer.getCDCollection();
    }

    public String playCD() {
        return this.cdPlayer.play();
    }

    public String skipCDTrack() {
        return this.cdPlayer.skip();
    }

    public int getCassettePlaySpeed() {
        return this.cassettePlayer.getPlaySpeed();
    }

    public void speedUpCassette() {
        this.cassettePlayer.speedUp();
    }

    public void resetCassetteSpeed() {
        this.cassettePlayer.resetSpeed();
    }

    public String playCassette() {
        return this.cassettePlayer.play();
    }

    public String skipCassetteTrack() {
        return this.cassettePlayer.skip();
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int newVolume) {
        if(newVolume <= 10 && newVolume >= 0) {
            this.volume = newVolume;
        }
    }

    public void increaseVolume() {
        if(this.volume < 10) {
            this.volume += 1;
        }
    }

    public void decreaseVolume() {
        if(this.volume > 0) {
            this.volume -= 1;
        }
    }
}
