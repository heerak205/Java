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
public class Solution {
    /**
     * Empty constructor.
     */
    private Solution() {
    }
    /**
     * { var_description }.
     */
private static final int TEN = 10 ;

private static final int SEVEN = 7 ;
/* Fill the main function to print the number of 7's between 1 to n*/
/**
 * { function_description }.
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                int r = temp % TEN;
                if (r == SEVEN) {
                    count = count + 1;
                }
                temp = temp / TEN;
            }
        }
        System.out.println(count);
    }
}

