package academy.programming;

public class Calculator {

    // fields
    private Floor floor = new Floor(0,0);
    private Carpet carpet = new Carpet(0.00);

    // constructors
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // method
    public double getTotalCost() {
        return this.floor.getArea()*this.carpet.getCost();
    }
}
