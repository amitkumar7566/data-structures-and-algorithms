package algorithms.problemsolving;

// Given an array of N integers, return the second-largest element in the array.

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] A = {1, 6, 4, 2, 7, 7, 5, 1, 3, 1, 1, 5};
        System.out.println(secondLargestElement(A));
    }

    public static int secondLargestElement(int[] A) {
        int largestEl = Integer.MIN_VALUE;
        int secondLargestEl = Integer.MIN_VALUE;

        for (int number : A)
            if (number > largestEl) {
                secondLargestEl = largestEl;
                largestEl = number;
            } else if (number > secondLargestEl && number != largestEl) {
                secondLargestEl = number;
            }

        return secondLargestEl;
    }
}
