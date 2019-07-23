import java.util.ArrayList;

public class CDPlayer extends Component implements IPlay, ISkip {

    private int capacity;
    private int numberOfCDs;
    private ArrayList<String> cdCollection;

    CDPlayer(String make, String model, int capacity) {
        super(make, model);
        this.capacity = capacity;
        this.numberOfCDs = 0;
        this.cdCollection = new ArrayList<String>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfCDs() {
        return this.numberOfCDs;
    }

    public ArrayList<String> getCDCollection() {
        return this.cdCollection;
    }

    public String play() {
        return "Playing CD";
    }

    public String skip() {
        return "Song skipped";
    }

}
