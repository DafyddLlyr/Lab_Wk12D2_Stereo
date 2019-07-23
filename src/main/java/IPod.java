public class IPod implements IConnect {

    private String make;
    private String model;

    public IPod(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String connectToDevice(Stereo stereo) {
        return "Connected to " + stereo.getName();
    }
}
