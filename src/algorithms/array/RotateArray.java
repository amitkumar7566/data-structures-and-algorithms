package algorithms.array;

//Given an array of N elements, rotate the array from last to first by k times.

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int noOfRotations = 4;

        System.out.println("Original Array : " + Arrays.toString(array));
        rotate(array, noOfRotations);
        System.out.println("Array after " + noOfRotations + " rotations from the end : " + Arrays.toString(array));
    }


    private static void rotate(int[] array, int k) {
        int n = array.length;
        k = k % n;

        reverse(array,0, n - 1);
        reverse(array,0, k - 1);
        reverse(array, k, n - 1);
    }


    private static void reverse(int[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            array[startIndex] = array[startIndex] + array[endIndex];
            array[endIndex] = array[startIndex] - array[endIndex];
            array[startIndex] = array[startIndex] - array[endIndex];

            startIndex++;
            endIndex--;
        }
    }

}
