package algorithms.problemsolving.prefixsum;

// You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
// For every query, the task is to find the count of even numbers in the range A[B[i][0]…B[i][1]].

import java.util.Arrays;

public class EvenNumbersInARange {

    public static void main(String[] args) {
        int[] A = {2, 1, 8, 3, 9};
        int[][] B = { {0, 3}, {1, 2}, {2, 4} };
        System.out.println(Arrays.toString(countOfEvenNum(A, B)));
        System.out.println(Arrays.toString(countOfEvenNum2(A, B)));
    }


    // Approach 1: Brute-Force
    public static int[] countOfEvenNum(int[] A, int[][] B) {
        int[] countOfEvenNo = new int[B.length];

        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0];
            int endIndex = B[i][1];
            int count = 0;

            for (int j = startIndex; j <= endIndex; j++)
                if (A[j] % 2 == 0)
                    count ++;

            countOfEvenNo[i] = count;
        }

        return countOfEvenNo;
    }


    // Approach 2: Prefix-Sum
    public static int[] countOfEvenNum2(int[] A, int[][] B) {
        int[] prefixEvenNoCountArray = new int[A.length];
        int[] evenNoCountForRangeArray = new int[B.length];
        int count = 0;

        for (int i = 0; i < A.length; i++)
            prefixEvenNoCountArray[i] = (A[i] % 2 == 0) ? ++count : count;


        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0];
            int endIndex = B[i][1];

            int evenNoCountInRange = (startIndex == 0) ? prefixEvenNoCountArray[endIndex] : (prefixEvenNoCountArray[endIndex] - prefixEvenNoCountArray[startIndex - 1]);
            evenNoCountForRangeArray[i] = evenNoCountInRange;
        }

        return evenNoCountForRangeArray;
    }
}
