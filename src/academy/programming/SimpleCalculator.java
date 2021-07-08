package academy.programming;

public class SimpleCalculator {

    //fields
    private double firstNumber;
    private double secondNumber;

    ////getter and setters
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber1) {
        this.firstNumber = firstNumber1;
    }

    public void setSecondNumber(double secondNumber1) {
        this.secondNumber = secondNumber1;
    }

    public double getAdditionResult() {
        return (firstNumber+secondNumber);
    }

    public double getSubtractionResult() {
        return(firstNumber-secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber*secondNumber);

    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return (firstNumber / secondNumber);
        }

    }
}
