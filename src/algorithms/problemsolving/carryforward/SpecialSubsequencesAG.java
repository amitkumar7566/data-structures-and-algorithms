package algorithms.problemsolving.carryforward;

// Given a String, return the count of pairs (i, j) such that i < j & s[i] = 'A' & s[j] = 'G'.

// You have given a string A having Uppercase English letters. You have to find how many times subsequence "AG" is there in the given string.
// NOTE: Return the answer modulo 10^9 + 7 as the answer can be very large.

public class SpecialSubsequencesAG {

    public static void main(String[] args) {
        String A = "ABCGAG";
        System.out.println(subsequence(A));
        System.out.println(subsequence2(A));
    }


    // Approach 1: Brute-Force {TC: O(N^2), SC: O(1)}
    public static int subsequence(String A) {
        int noOfSubsequence = 0;
        int modulo = 1000000007;

        for (int i = 0; i < A.length(); i++)
            if (A.charAt(i) == 'A')
                for (int j = i + 1; j < A.length(); j++)
                    if (A.charAt(j) == 'G')
                        noOfSubsequence++;

        return noOfSubsequence % modulo;
    }


    // Approach 2: Carry-Forward {TC: O(N), SC: O(1)}
    public static int subsequence2(String A) {
        int countOfA = 0;
        int noOfSubsequence = 0;
        int modulo = 1000000007;

        for (int i = 0; i < A.length(); i++)
            switch (A.charAt(i)) {
                case 'A' -> countOfA++;
                case 'G' -> {
                    noOfSubsequence += countOfA;
                    noOfSubsequence %= modulo;
                }
            }

        return noOfSubsequence;
    }
    
}
