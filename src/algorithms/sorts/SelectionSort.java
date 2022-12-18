package algorithms.sorts;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array : " + Arrays.toString(myArray));
        selectionSort(myArray);
        System.out.println("Sorted Array : " + Arrays.toString(myArray));
    }


    // Time complexity: O(n^2), Space Complexity: O(1)
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}
