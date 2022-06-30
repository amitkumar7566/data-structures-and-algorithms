public class SumOfDigits {
    public static void main(String[] args) {

        var sumOfDigits = new SumOfDigits();
        int number = 7896;
        var sumOfDigitsOfPositiveInteger = sumOfDigits.sumOfDigits(number);
        System.out.println("\nSum of digits of integer " + number + ": " + sumOfDigitsOfPositiveInteger);

    }


    public int sumOfDigits(int number) {

        if (number <= 0)
            return 0;

        return number % 10 + sumOfDigits(number/10);

    }
}
