package algorithms.recursion;

public class Factorial {

    public static void main(String[] args) {

        var factorial = new Factorial();
        int number = 5;
        var result = factorial.factorial(number);
        System.out.println("\nalgorithms.recursion.Factorial of " + number + ": " + result);

    }


    public int factorial(int number) {

        if (number <= 1)
            return 1;

        return number * factorial(number - 1);

    }

}
