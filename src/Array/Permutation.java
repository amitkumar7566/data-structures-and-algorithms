package Array;

public class Permutation {

    public static void main(String[] args) {

        int[] numArray1 = {1, 2, 3, 4, 5};
        int[] numArray2 = {2, 3, 6, 4, 5};

        var permutation = new Permutation();
        boolean result = permutation.arePermutations(numArray1, numArray2);
        System.out.println("\nAre the 2 arrays permutations of each other?: " + result);

    }


    //Check if two arrays are permutations of each other
    public boolean arePermutations(int[] numArray1, int[] numArray2) {

        if (numArray1.length != numArray2.length)
            return false;

        int sum1 = 0;
        int sum2 = 0;
        int product1 = 1;
        int product2 = 1;

        for (int i = 0; i < numArray1.length; i++) {
            sum1 += numArray1[i];
            sum2 += numArray2[i];
            product1 *= numArray1[i];
            product2 *= numArray2[i];
        }

        return sum1 == sum2 && product1 == product2;

    }

}
