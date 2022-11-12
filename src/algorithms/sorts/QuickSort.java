package algorithms.sorts;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array : " + Arrays.toString(myArray));
        quickSort(myArray);
        System.out.println("Sorted Array : " + Arrays.toString(myArray));
    }


    // Time complexity: O(n^2), Space Complexity: O(1)
    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }


    private static void quickSortHelper(int[] array, int left, int right) {
        if(left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }


    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;

        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }


    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
