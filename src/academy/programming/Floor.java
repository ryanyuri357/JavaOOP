package academy.programming;

public class Floor {

    // fields
    private double width, length;

    // constructor
    public Floor(double width, double length) {
        // the condition ? what to return if it's true : what to return if it's false
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    // methods
    public double getArea() {
        return this.length*this.width;
    }


}
