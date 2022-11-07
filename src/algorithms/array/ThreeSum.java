package algorithms.array;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] numArray = {-1, 0, 1, 2, -1, -4};
//        int[] numArray = {1, 2, -2, -1,};
        var threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(numArray);
        System.out.println("\nAll the triplets with sum equals to 0 are " + result.toString());



    }


    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> tripletList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        tripletList.add(triplet);
                    }
                }
            }

        }
        tripletList = new ArrayList<>(new LinkedHashSet<List<Integer>>(tripletList));
        return tripletList;

    }


}
