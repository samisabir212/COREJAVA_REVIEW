package Programs_Interview_questions;

/**
 * Created by sami on 9/22/17.
 */
public class Fibonacci_Recursion {

    public static int getFibonacci(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return getFibonacci(n - 1) + getFibonacci(n - 2);

    }

    public static void main(String[] args) {

        System.out.println(getFibonacci(4));

    }
}
