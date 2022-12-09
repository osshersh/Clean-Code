package task2;

public class FizzBuzz {

    public String printFizzBuzzGame(int value) {
        for (int i = 1; i <= value; i++) {
            System.out.println(i % 3 == 0 ? getFizzBuzzOrFizz(i) : getBuzz(i));
        }
        return "Game Over";
    }

    private String getFizzBuzzOrFizz(int number) {
        return number % 5 == 0 ? "Fizz Buzz" : "Fizz";
    }

    private String getBuzz(int number) {
        return number % 5 == 0 ? "Buzz" : String.valueOf(number);
    }
}