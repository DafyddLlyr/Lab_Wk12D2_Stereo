public class Radio extends Component implements IPlay {

    private String station;

    public Radio(String make, String model) {
        super(make, model);
        this.station = null;
    }

    public String tune(String station) {
        this.station = station;
        return this.station;
    }

    public String getStation() {
        return this.station;
    }

    public String play() {
        return "Playing radio";
    }
}
