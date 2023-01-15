package algorithms.array;


import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 3, 9, 0, 6, 8};
        System.out.println("Array : " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array : " + Arrays.toString(array));
    }


    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            array[start] = array[start] + array[end];
            array[end] = array[start] - array[end];
            array[start] = array[start] - array[end];

            start++;
            end--;
        }
    }
}
