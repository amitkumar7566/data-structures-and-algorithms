package algorithms.sorts;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array : " + Arrays.toString(myArray));
        int[] sortedArray = mergeSort(myArray);
        System.out.println("Sorted Array : " + Arrays.toString(sortedArray));
    }


    // Time complexity: O(n log n), Space Complexity: O(n)
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }


    private static int[] merge(int[] array1, int[] array2) {
        int[] combinedArray = new int[array1.length + array2.length];
        int combinedArrayIndex = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length & j < array2.length) {
            if (array1[i] < array2[j]) {
                combinedArray[combinedArrayIndex] = array1[i];
                combinedArrayIndex++;
                i++;
            } else {
                combinedArray[combinedArrayIndex] = array2[j];
                combinedArrayIndex++;
                j++;
            }
        }

        while (i < array1.length) {
            combinedArray[combinedArrayIndex] = array1[i];
            combinedArrayIndex++;
            i++;
        }

        while (j < array2.length) {
            combinedArray[combinedArrayIndex] = array2[j];
            combinedArrayIndex++;
            j++;
        }

        return combinedArray;
    }
}
