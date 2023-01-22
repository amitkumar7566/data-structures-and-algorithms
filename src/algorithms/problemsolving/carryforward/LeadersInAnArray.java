package algorithms.problemsolving.carryforward;

// Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
//An element is a leader if it is strictly greater than all the elements to its right side.
//NOTE:The rightmost element is always a leader.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] A = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        System.out.println("raw: " + Arrays.toString(A));
        System.out.println(Arrays.toString(leaders(A)));
    }

    public static int[] leaders(int[] A) {
        int[] rightMaxArray = new int[A.length];
        int noOfLeaders = 0;

        for (int i = A.length - 1; i >= 0; i--)
            if (i == A.length - 1) {
                rightMaxArray[i] = A[i];
                noOfLeaders++;
            } else {
                rightMaxArray[i] = (Math.max(A[i], rightMaxArray[i + 1]));
                if (rightMaxArray[i] != rightMaxArray[i + 1]) {
                    noOfLeaders++;
                }
            }

        int[] leadersArray = new int[noOfLeaders];
        int lastLeader = 0;
        int leadersArrayNextIndex = 0;

        for (int number : rightMaxArray)
            if (number != lastLeader) {
                lastLeader = number;
                leadersArray[leadersArrayNextIndex++] = lastLeader;
            }

        return leadersArray;
    }
}
