package algorithms.recursion;

public class Reverse {

    public static void main(String[] args) {

        var reverse = new Reverse();
        String str = "Amit Kumar";
        var result = reverse.reverse(str);
        System.out.println("\nReverse of String " + str + ": " + result);

    }


    public String reverse(String str) {

        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);

    }

}
