
// Given an String

/**
 * { imports Scanner class}.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
    *Do not modify the main function
    *Constructs the object.
    */
    private Solution() {
    }
    /**
     * { main function}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    //Write reverseString function
    /**
    a function for creating reverse of a string.
    * @param s The arguments
    * @return l 
    */
    public static String reverseString(final String s) {
        String l = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            l = l + s.charAt(i);
        }
        return l;
    }

}
