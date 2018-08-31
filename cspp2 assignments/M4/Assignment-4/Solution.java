
// Given an String, Write a java method that returns the decimal value for the given binary string.

/**
 * { imports Scanner class}.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {  
	/*
	Do not modify the main function 
	*/
	/**
	 * Constructs the object.
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
	a function for creating reverse of a string
	*/
	public static String reverseString(String s) {
		String l = "";
		for (int i = (s.length() - 1); i >= 0; i--) {
			l = l + s.charAt(i);
		}
		return l;
	}

}
