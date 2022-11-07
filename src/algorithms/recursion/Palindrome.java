package algorithms.recursion;

public class Palindrome {

    public static void main(String[] args) {

        var palindrome = new Palindrome();
        String str = "malayalam";
        boolean result = palindrome.isPalindrome(str);
        System.out.println("\nIs \"" + str + "\" a palindrome? : " + result);

    }


    public boolean isPalindrome(String str) {

        if(str.length() == 0 || str.length() == 1)
            return true;

        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length()- 1));

        return false;

    }

}
