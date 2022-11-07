package algorithms.recursion;

public class RecursiveRange {

    public static void main(String[] args) {

        var recursiveRange = new RecursiveRange();
        int number = 11;
        var result = recursiveRange.recursiveRange(number);
        System.out.println("\nThe range from 0 to " + number + ": " + result);

    }


    public int recursiveRange(int number) {

        if (number <=0)
            return 0;

        return number + recursiveRange(number - 1);

    }

}
