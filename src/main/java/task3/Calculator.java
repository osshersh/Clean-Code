package task3;

public class Calculator {
    private double value1;
    private double value2;


    public Calculator(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getSum() {
        return value1 + value2;
    }

    public double getSubtract() {
        return value1 - value2;
    }

    public double getMultiply() {
        return value1 * value2;
    }

    public double getDivide() {
        return value1 / value2;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
}
