package algorithms.problemsolving.prefixsum;

// Given an array A of N integers. Construct prefix sum of the array in the given array itself.

import java.util.Arrays;

public class ConstructPrefixSumArray {

    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("A : " + Arrays.toString(A));
        System.out.println("A : " + Arrays.toString(constructPrefixSumArrayInTheSameArray(A)));

        int[] B = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("B : " + Arrays.toString(B));
        System.out.println("B : " + Arrays.toString(constructPrefixSumArrayUsingNewAArray(B)));
    }

    public static int[] constructPrefixSumArrayInTheSameArray(int[] A) {
        for (int i = 0; i < A.length; i++)
            A[i] = (i == 0) ? A[0] : (A[i - 1] + A[i]);

        return A;
    }

    public static int[] constructPrefixSumArrayUsingNewAArray(int[] A) {
        int[] prefixSumArray = new int[A.length];

        for (int i = 0; i < A.length; i++)
            prefixSumArray[i] = (i == 0) ? A[0] : (prefixSumArray[i - 1] + A[i]);

        return prefixSumArray;
    }
}
