package algorithms.problems;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(23));
    }


    public static boolean isPrime(int number) {
        int noOfFactors = 0;

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                noOfFactors++;

        return noOfFactors == 2;
    }
}
