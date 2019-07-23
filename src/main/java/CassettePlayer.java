public class CassettePlayer extends Component {

    private int playSpeed;

    CassettePlayer(String make, String model) {
        super(make, model);
        this.playSpeed = 1;
    }

    public int getPlaySpeed() {
        return this.playSpeed;
    }

    public void speedUp() {
        this.playSpeed += 1;
    }

    public void resetSpeed() {
        this.playSpeed = 1;
    }
}
