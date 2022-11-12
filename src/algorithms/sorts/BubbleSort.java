package algorithms.sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array : " + Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println("Sorted Array : " + Arrays.toString(myArray));
    }


    // Time complexity: O(n^2), Space Complexity: O(1)
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[ j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
