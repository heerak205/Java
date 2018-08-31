
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		// sc.nextLine();
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	public static String binaryToDecimal(String s){
		// System.out.println(s);
		int sum = 0;
		int count = 0;
		int res;
		for(int i = s.length() - 1; i>=0; i--){
			char p = s.charAt(i);
			int l = Character.getNumericValue(p);
			//System.out.print(l+"*");
			//System.out.println(Math.pow(2, count));
			sum = sum + (int)((Math.pow(2, count)) * l);
			count = count + 1;

		}
		res = (int) sum;
		return String.valueOf(sum);
	}

}
