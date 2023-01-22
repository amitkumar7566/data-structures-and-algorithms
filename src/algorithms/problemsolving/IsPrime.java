package algorithms.problemsolving;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(23));
        System.out.println(isPrimeOptimized(23));
    }


    public static boolean isPrime(int number) {
        int noOfFactors = 0;

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                noOfFactors++;

        return noOfFactors == 2;
    }


    public static boolean isPrimeOptimized(int number) {
        int noOfFactors = 0;

        for (int i = 1; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                noOfFactors += (i * i == number) ? 1 : 2;

        return noOfFactors == 2;
    }
}
