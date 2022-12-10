package task2;

public class FizzBuzz {

    public void printFizzBuzzGame(int value) {

        for (int i = 1; i <= value; i++) {
            if (getFizz(i) && getBuzz(i)) {
                System.out.println("Fizz Buzz");
            }
            if (getFizz(i)) {
                System.out.println("Fizz");
            } else if (getBuzz(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public boolean getFizz(int number) {
        return number % 3 == 0;
    }

    public boolean getBuzz(int number) {
        return number % 5 == 0;
    }
}