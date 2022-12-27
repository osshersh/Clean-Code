package task3;

public class Addition implements Calculable {
    @Override
    public double calculate(double value1, double value2) {
        return value1 + value2;
    }

    @Override
    public char getSign() {
        return '+';
    }
}
