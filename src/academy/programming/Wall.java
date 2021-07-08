package academy.programming;

public class Wall {

    //fields
    private double width;
    private double height;

    //constructors


    public Wall() {
        this(0,0);
    }

    public Wall(double width, double height) {
        /*
            ternary operator
            the condition ? what to return if it's true : what to return if it's false
        */
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    // setters and getters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}
