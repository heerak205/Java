import java.util.*;
public class SumOfNNumbers{
	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter n:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int sum = 0;
		i = 0;
		while(i<=n){
			sum = sum + i;
			i = i + 1;
		}
	System.out.println(sum);	
	}

}