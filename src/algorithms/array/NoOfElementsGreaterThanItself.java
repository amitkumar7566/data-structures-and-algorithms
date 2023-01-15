package algorithms.array;

//Given an array of N elements, count the number of elements having at least one element greater than itself.

public class NoOfElementsGreaterThanItself {

    public static void main(String[] args) {
        int[] array = {2, 9, 4, 0, 6, 9, 1, 0, 9, 4, 5};
        System.out.println(noOfElements(array));
    }


    public static int noOfElements(int[] array) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int element : array)
            if (element > max)
                max = element;

        for (int element : array)
            if (element == max)
                count++;

        return array.length - count;
    }
}
