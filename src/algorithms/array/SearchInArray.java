package algorithms.array;

public class SearchInArray {

    public static void main(String[] args) {

        int[] numArray = {2, 4, 6, 8, 5, 9, 11, 12, 15};
        int valueToSearch = 11;

        var searchInArray = new SearchInArray();
        searchInArray.linearSearch(numArray, valueToSearch);

    }


    //Search an element in algorithms.array and return its index
    public void linearSearch(int[] numArray, int valueToSearch) {

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == valueToSearch) {
                System.out.println("\nThe number " + valueToSearch + " is present at index " + i);
                return;
            }
        }

        System.out.println("\nThe number " + valueToSearch + " is not present in the given algorithms.array");

    }

}
