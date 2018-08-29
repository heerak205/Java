
/**
 * { item_description }.
 */
import java.util.Scanner;
/*
    Do not modify this main function.
    */
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * { var_description }.
     */
    public static final int TEN = 100000;
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
        System.out.println(gcd(n1, n2));
    }
    

    /**
     * { function_description }
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }
     */
    public static int gcd(final int n1,final int n2) {
        int r = TEN;
        int temp_n1 = n1;
        int temp_n2 = n2;
        while (r > 0) {
            r = temp_n2 % temp_n1;
            temp_n2 = temp_n1;
            temp_n1 = r;
        }

        return temp_n2;
    }
}
