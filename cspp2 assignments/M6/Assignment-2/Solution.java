import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author :
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
/**
 * { Giving value of 100 to Hundred }.
 */
private static final int HUNDRED = 100;
/**
 * { Giving value of 50 to Fifty }.
 */
private static final int FIFTY = 50;
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a,
        final int rows, final int columns) {
    // write ypur code here
        int maxi = HUNDRED;
        int mini = FIFTY;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int rem = a[i][j] % maxi;
                //System.out.println(rem);
                int num = a[i][j] / maxi;
                //System.out.println(num);
                if (rem <= mini) {
                    a[i][j] = num * maxi;
                    //System.out.println(a[i][j]);
                } else {
                    a[i][j] = (num + 1) * maxi;
                }
            }
        }
        return a;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
