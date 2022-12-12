package task2;

public class FizzBuzz {

    public void printFizzBuzzGame(int value) {

        for (int i = 1; i <= value; i++) {
            if (isDivisibleBy(i,3) && isDivisibleBy(i,5)) {
                System.out.println("Fizz Buzz");
            }
            else if (isDivisibleBy(i,3)) {
                System.out.println("Fizz");
            }
            else if (isDivisibleBy(i,5)) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    private boolean isDivisibleBy(int number, int divider) {
        return number % divider == 0;
    }
}