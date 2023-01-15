package algorithms.problems;

//Given a perfect square, find the square root for the given number.

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(squareRoot(36));

    }


    private static int squareRoot(int number) {
        for (int i = 0; i <= number; i++)
            if (i * i == number)
                return i;

        return -1;
    }
}
