public class Main {
    public static void main(String[] args) {
        System.out.println("\nJava Data Structures and Algorithms\n");

        SumOfDigitsOfPositiveInteger sumOfDigitsOfPositiveInteger = new SumOfDigitsOfPositiveInteger();
        var sumOfDigits = sumOfDigitsOfPositiveInteger.sumOfDigits(7896);
        System.out.println(sumOfDigits);
    }
}