package algorithms.hashtable;

import java.util.HashMap;

public class ItemInCommon {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon1(array1, array2));
        System.out.println(itemInCommon2(array1, array2));
    }


    //Inefficient solution - 0(n^2)
    public static boolean itemInCommon1(int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) return true;
            }
        }
        return false;
    }


    //Efficient solution - 0(n)
    public static boolean itemInCommon2(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1)
            myHashMap.put(i, true);

        for (int j : array2)
            if (myHashMap.get(j) != null) return true;

        return false;
    }
}
