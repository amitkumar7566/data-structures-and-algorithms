public class Main {
    public static void main(String[] args) {
        System.out.println("\nJava Data Structures and Algorithms\n");

        SumOfDigits sumOfDigits = new SumOfDigits();
        int number1 = 7896;
        var sumOfDigitsOfPositiveInteger = sumOfDigits.sumOfDigits(number1);
        System.out.println("Sum of digits of integer " + number1 + ": " + sumOfDigitsOfPositiveInteger);

        Power power = new Power();
        int number2 = 2;
        int number3 = 5;
        var powerValue = power.power(2, 4);
        System.out.println("\nThe value of " + number2 + " to the power " + number3 + ": " + powerValue);

        GCD gcd = new GCD();
        int number4 = 48;
        int number5 = 36;
        var gcdValue = gcd.gcd(number4, number5);
        System.out.println("\nThe Greatest Common Divisor (GCD) of " + number4 + " and " + number5 + ": " + gcdValue);
    }
}