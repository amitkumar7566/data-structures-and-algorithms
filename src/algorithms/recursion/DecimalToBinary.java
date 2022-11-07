package algorithms.recursion;

public class DecimalToBinary {

    public static void main(String[] args) {

        var decimalToBinary = new DecimalToBinary();
        int number = 10;
        var result = decimalToBinary.decimalToBinary(number);
        System.out.println("\nThe Binary number for Decimal number " + number + ": " + result);

    }


    public int decimalToBinary(int number) {

        if (number == 0)
            return 0;

        return number % 2 + 10 * decimalToBinary(number/2);

    }

}
