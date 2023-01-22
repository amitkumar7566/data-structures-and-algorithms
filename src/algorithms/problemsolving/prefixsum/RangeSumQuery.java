package algorithms.problemsolving.prefixsum;


//Given an array of size N and Q queries of format s(start) & e(end), return the sum of array of elements from s to e.

// You are given an integer array A of length N.
// You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
// For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
// More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

import java.util.Arrays;

public class RangeSumQuery {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = { {0, 3}, {1, 2}, {2, 4} };
        System.out.println(Arrays.toString(rangeSum(A, B)));
        System.out.println(Arrays.toString(rangeSum2(A, B)));
    }


    // Approach 1: Brute-Force  {TC: O(B(length) X N), SC: O(1)}
    public static int[] rangeSum(int[] A, int[][] B) {
        int[] sumOfElements = new int[B.length];

        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0];
            int endIndex = B[i][1];
            int sum = 0;

            for (int j = startIndex; j <= endIndex; j++)
                sum += A[j];

            sumOfElements[i] = sum;
        }

        return sumOfElements;
    }



    // Approach 2: Prefix-Sum  {TC: O(B(length) + N), SC: O(N)}
    public static int[] rangeSum2(int[] A, int[][] B) {
        int[] prefixSumArray = new int[A.length];
        int[] sumOfElements = new int[B.length];

        for (int i = 0; i < A.length; i++)
            prefixSumArray[i] = (i == 0) ? A[0] : (prefixSumArray[i - 1] + A[i]);

        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0];
            int endIndex = B[i][1];

            int sum = (startIndex == 0) ? prefixSumArray[endIndex] : (prefixSumArray[endIndex] - prefixSumArray[startIndex - 1]);
            sumOfElements[i] = sum;
        }

        return sumOfElements;
    }

}
