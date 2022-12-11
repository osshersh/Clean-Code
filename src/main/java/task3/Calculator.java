package task3;

public class Calculator {
    private Addition addition;
    private Divide divide;
    private Multiply multiply;
    private Subtract subtract;

    public Calculator(Addition addition, Divide divide, Multiply multiply, Subtract subtract) {
        this.addition = addition;
        this.divide = divide;
        this.multiply = multiply;
        this.subtract = subtract;
    }
    public Calculator(){
        this.subtract = new Subtract();
        this.multiply = new Multiply();
        this.divide = new Divide();
        this.addition = new Addition();
    }

    public double calculationMathematics(double value1, char sign, double value2) {

        switch (sign){
            case '+':
                return addition.calculation(value1,value2);
            case '/':
                return divide.calculation(value1,value2);
            case '*':
                return multiply.calculation(value1,value2);
            case '-':
                return subtract.calculation(value1,value2);
            default:
                return 0;
        }
    }
}
