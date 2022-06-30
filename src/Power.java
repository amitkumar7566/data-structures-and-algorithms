public class Power {

    public static void main(String[] args) {

        var power = new Power();
        int number1 = 2;
        int number2 = 5;
        var result = power.power(2, 4);
        System.out.println("\nThe value of " + number1 + " to the power " + number2 + ": " + result);

    }


    public int power(int base, int exponent) {

        if (exponent < 0)
            return -1;

        if (exponent == 0)
            return 1;

        return base * power(base, exponent - 1);

    }
}
