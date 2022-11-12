package algorithms.sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array : " + Arrays.toString(myArray));
        insertionSort(myArray);
        System.out.println("Sorted Array : " + Arrays.toString(myArray));
    }


    // Time complexity: O(n^2) / for almost sorted or sorted array O(n), Space Complexity: O(1)
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

}
