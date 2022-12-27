package task3;

public class Divide implements Calculable {
    @Override
    public double calculate(double value1, double value2) {
        if (value2 == 0) {
            return 0;
        }
        return value1 / value2;
    }

    @Override
    public char getSign() {
        return '/';
    }
}
