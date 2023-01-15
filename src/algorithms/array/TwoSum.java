package algorithms.array;

import java.util.Arrays;

//Given an array of N elements, find the indices of the two integers whose sum is equal to a given target number.
//i.e. array[i] + array[j] = k and i != j and k is the target number

public class TwoSum {

    public static void main(String[] args) {

        int[] numArray = {2, 2, 3, 4, 9, 11, 12, 15, 6, 8, 5,};
        var twoSum = new TwoSum();
        int[] result = twoSum.twoSum(numArray, 23);
        System.out.println("\nThe two indices are " + Arrays.toString(result));

    }



    public int[] twoSum(int[] numArray, int target) {

        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == target)
                    return new int[] {i, j};
            }
        }

        throw new IllegalArgumentException("No 2 numbers sums up to " + target + " in the given algorithms.array");

    }

}
