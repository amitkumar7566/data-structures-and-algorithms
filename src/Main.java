public class Main {
    public static void main(String[] args) {
        System.out.println("Java Data Structures and Algorithms");

        SumOfDigitsOfPositiveInteger sumOfDigitsOfPositiveInteger = new SumOfDigitsOfPositiveInteger();
        var sumOfDigits = sumOfDigitsOfPositiveInteger.sumOfDigits(1134);
        System.out.println(sumOfDigits);
    }
}