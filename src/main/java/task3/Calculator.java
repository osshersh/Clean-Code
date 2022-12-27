package task3;

import java.util.List;

public class Calculator {
    private final List<Calculable> mathematicsOperations;

    public Calculator(List<Calculable> mathematicsOperations) {
        this.mathematicsOperations = mathematicsOperations;
    }

    public double calculateMathematics(double value1, char sign, double value2) {
        for (Calculable calculable : mathematicsOperations) {
            if (calculable.getSign() == sign) {
                return calculable.calculate(value1, value2);
            }
        }
        return 0;
    }
}