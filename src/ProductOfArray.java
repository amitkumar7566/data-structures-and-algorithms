import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {

        var productOfArray = new ProductOfArray();
        int[] array = {1, 2, 3, 4, 5, 6};
        int result = productOfArray.productOfArray(array, array.length);
        System.out.println("\nProduct of the array " + Arrays.toString(array) + ": " + result);

    }


    public int productOfArray(int array[], int arrayLength) {

        if (arrayLength <= 0)
            return 1;

        return array[arrayLength-1] * productOfArray(array, arrayLength-1);

    }

}
