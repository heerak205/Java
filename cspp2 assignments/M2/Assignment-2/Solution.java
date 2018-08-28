/**
 * { item_description }
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * { function_description }
	 *
	 * @param      a     { parameter_description }
	 * @param      b     { parameter_description }
	 * @param      c     { parameter_description }
	 */
	static void rootsOfQuadraticEquation(final int a, final int b, final int c) {
		double root1 = (-b + Math.sqrt((b * b - 4 * a * c))) / (2 * a);
		double root2 = (-b - Math.sqrt((b * b - 4 * a * c))) / (2 * a);
		System.out.println(root1 + " " + root2);
	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation func
	*/
}
