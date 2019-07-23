public class Radio extends Component {

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

}
