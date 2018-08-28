/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * { function_description }
	 *
	 * @param      base      The base
	 * @param      exponent  The exponent
	 *
	 * @return     { description_of_the_return_value }.
	 */
	static long power(int base, int exponent) {
		if(exponent == 0)
			return 1;
		/**
		 * { item_description }.
		 */
		return base*power(base, (exponent-1));
	}
	/*
	Do not modify this main function.
	*/
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result=power(base,exponent);
        System.out.println(result);
	}
	/*
	Need to write the power function and print the output.
	*/
}
