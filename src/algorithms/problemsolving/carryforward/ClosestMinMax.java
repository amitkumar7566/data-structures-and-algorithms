package algorithms.problemsolving.carryforward;

// Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array and at least one occurrence of the minimum value of the array.

public class ClosestMinMax {

    public static void main(String[] args) {
        int[] A = {1, 6, 4, 2, 7, 7, 5, 1, 3, 1, 1, 5};
        System.out.println("lengthOfMinMaxSubArray : " + lengthOfMinMaxSubArray(A));
        System.out.println("lengthOfMinMaxSubArray2 : " + lengthOfMinMaxSubArray2(A));
    }


    // Approach 1: Brute-Force {TC: O(N^2), SC: O(N)}
    public static int lengthOfMinMaxSubArray(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : A) {
            if (number < min)
                min = number;

            if (number > max)
                max = number;
        }

        int minMaxSubArrayLength = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) {
                for (int j = i; j < A.length; j++)
                    if (A[j] == max) {
                        minMaxSubArrayLength = Math.max(minMaxSubArrayLength, j - i + 1);
                        break;
                    }
            }

            if (A[i] == max) {
                for (int j = i; j < A.length; j++)
                    if (A[j] == min) {
                        minMaxSubArrayLength = Math.min(minMaxSubArrayLength, j - i + 1);
                        break;
                    }
            }
        }

        return minMaxSubArrayLength;
    }



    // Approach 2: Carry-Forward {TC: O(N), SC: O(N)}
    public static int lengthOfMinMaxSubArray2(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : A) {
            if (number < min)
                min = number;

            if (number > max)
                max = number;
        }

        int minMaxSubArrayLength = Integer.MAX_VALUE;
        int lastMinIndex = -1;
        int lastMaxIndex = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == min)
                lastMinIndex = i;

            if (A[i] == max)
                lastMaxIndex = i;

            if (lastMinIndex != -1 && lastMaxIndex != -1) {
                int subArrayLength = Math.abs(lastMaxIndex - lastMinIndex) + 1;

                if ( subArrayLength < minMaxSubArrayLength)
                    minMaxSubArrayLength = subArrayLength;
            }
        }

        return minMaxSubArrayLength;
    }

}
