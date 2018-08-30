/**
 * { imports all methods in utility package }.
 */
import java.util.*;
public class Solution {
    private Solution(){    
    }
/*
Fill this main function to print maximum of given array
*/  

    /**
     * { main fucntion }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
