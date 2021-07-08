package academy.programming;

public class Carpet {

    // field
    private double cost;

    // constructor
    public Carpet(double cost) {
        // the condition ? what to return if it's true : what to return if it's false
        this.cost = cost < 0 ? 0: cost;
    }

    // method
    public double getCost() {
        return cost;
    }

}
