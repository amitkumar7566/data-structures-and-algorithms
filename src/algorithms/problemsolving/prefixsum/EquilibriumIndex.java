package algorithms.problemsolving.prefixsum;


//Given an array, return true if there exists an equilibrium index in the array.

// You are given an array A of integers of size N. Your task is to find the equilibrium index of the given array.
// The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

//NOTE:
// Array indexing starts from 0.
// If there is no equilibrium index then return -1.
// If there are more than one equilibrium indexes then return the minimum index.

public class EquilibriumIndex {

    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibriumIndex(A));
        System.out.println(equilibriumIndex2(A));
    }


    // Approach 1: Brute-Force  {TC: O(N^2), SC: O(1)}
    public static int equilibriumIndex(int[] A) {

        for (int i = 0; i < A.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            if (i != 0)
                for (int j = 0; j < i; j++)
                    leftSum += A[j];

            if (i != A.length - 1)
                for (int k = i + 1; k < A.length; k++)
                    rightSum += A[k];

            if (leftSum == rightSum)
                return i;
        }

        return -1;
    }



    // Approach 1: Prefix-Sum  {TC: O(N), SC: O(N)}
    public static int equilibriumIndex2(int[] A) {
        int[] prefixSumArray = new int[A.length];

        for (int i = 0; i < A.length; i++)
            prefixSumArray[i] = (i == 0) ? A[0] : (prefixSumArray[i - 1] + A[i]);

        for (int i = 0; i < A.length; i++) {
            int leftSum = (i == 0) ? 0 : prefixSumArray[i - 1];
            int rightSum = (i == A.length - 1) ? 0 : (prefixSumArray[A.length - 1] - prefixSumArray[i]);

            if (leftSum == rightSum)
                return i;
        }

        return -1;
    }

}