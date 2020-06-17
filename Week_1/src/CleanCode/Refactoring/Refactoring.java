package CleanCode.Refactoring;

public class Refactoring {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }

    public static void main(String[] args) {
        String result = fizzBuzz(3);
        System.out.println(result);
    }
}
