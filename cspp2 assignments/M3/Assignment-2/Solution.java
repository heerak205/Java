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
/* Fill the main function to print the number of 7's between 1 to n*/
/**
 * { function_description }
 *
 * @param      args  The arguments
 */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++) {
            int temp = i;
            while(temp > 0) {
                int r = temp % 10;
                if(r == 7){
                    count = count + 1;
                }
                temp = temp / 10;
            }
        }
        System.out.println(count);
    }
}