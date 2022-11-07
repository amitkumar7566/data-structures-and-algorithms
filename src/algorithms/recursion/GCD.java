package algorithms.recursion;

public class GCD {

    public static void main(String[] args) {

        var gcd = new GCD();
        int number1 = 48;
        int number2 = 36;
        var result = gcd.gcd(number1, number2);
        System.out.println("\nThe Greatest Common Divisor (algorithms.recursion.GCD) of " + number1 + " and " + number2 + ": " + result);

    }


    public int gcd(int a, int b) {

        if ( a < 0 || b < 0)
            return -1;

        if (b == 0)
            return a;

        return gcd(b, a % b);

    }
}
