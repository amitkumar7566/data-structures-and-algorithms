package algorithms.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] numArray = {2, 4, 6, 8, 5, 9, 11, 5, 12, 15};
        var containsDuplicate = new ContainsDuplicate();
        boolean result = containsDuplicate.containsDuplicate(numArray);
        System.out.println("\nDoes the given algorithms.array contain duplicate elements?: " + result);

    }


    //Check if the algorithms.array contains duplicate elements / whether the algorithms.array is unique or not
    public boolean containsDuplicate(int[] numArray) {

        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] == numArray[j])
                    return true;
            }
        }
        return false;

    }
    
    
    public boolean containsDuplicate2(int[] numArray) {
		Set<Integer> numSet = new HashSet<>();
        
		for (int i = 0; i < numArray.length; i++) {
			if (numSet.contains(numArray[i])) {
				return true;
			}
			numSet.add(numArray[i]);	
		}
        return false;
        
    }
    

}
