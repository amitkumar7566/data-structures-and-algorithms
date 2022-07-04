package Array;

public class MaxProduct {

    public static void main(String[] args) {
        int[] numArray = {2, 4, 6, 8, 5, 9, 11, 12, 15};

        var maxProduct = new MaxProduct();
        String result = maxProduct.maxProduct(numArray);
        System.out.println("\nThe number pair with maximum product in the array is " + result);

    }


    //Find two integers in the array whose product is the maximum in that array
    public String maxProduct(int[] numArray) {
        int maxProduct = 0;
        String numPairs = "";

        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] * numArray[j] > maxProduct) {
                    maxProduct = numArray[i] * numArray[j];
                    numPairs = Integer.toString(numArray[i]) + " & " + Integer.toString(numArray[j]);
                }
            }
        }

        return numPairs;

    }


}
