public class Fibonacci {

    public static void main(String[] args) {

        var fibonacci = new Fibonacci();
        int nthFibonacciNumber = 10;
        int result = fibonacci.fib(nthFibonacciNumber);
        System.out.println("\nThe fibonacci number at position " + nthFibonacciNumber + ": " + result);

    }


    public int fib(int number) {

        if (number < 0)
            return -1;

        if (number <= 1)
            return number;

        return fib(number - 1) + fib(number - 2);

    }


}
