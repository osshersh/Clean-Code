package task2;

public class FizzBuzz {

    public void printFizzBuzzGame(int value) {

        for (int i = 1; i <= value; i++) {
            if (isNumberDivide3(i) && isNumberDivide5(i)) {
                System.out.println("Fizz Buzz");
            }
            else if (isNumberDivide3(i)) {
                System.out.println("Fizz");
            }
            else if (isNumberDivide5(i)) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    private boolean isNumberDivide3(int number) {
        return number % 3 == 0;
    }

    private boolean isNumberDivide5(int number) {
        return number % 5 == 0;
    }
}