public class SumOfDigits {

    public int sumOfDigits(int number) {

        if (number <= 0)
            return 0;

        return number % 10 + sumOfDigits(number/10);

    }
}
