package Array;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        var missingNumber = new MissingNumber();
        missingNumber.findMissingNumber(array);

    }


    // Find the missing number in an integer array of 1 to 10.
    public void findMissingNumber(int[] array) {

        int originalSum = 10 * (10+1) / 2;
        int actualSum = 0;

        for (int i: array) {
            actualSum += i;
        }

        int difference = originalSum - actualSum;
        System.out.println("\nThe missing number in the array " + Arrays.toString(array) +  " is " + difference);

    }

}
