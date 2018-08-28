import java.util.*;
public class factorial{
	static int fact(int a){
		if(a == 1)
			return 1;
		return a * fact(a-1);

	}
	public static void main(String[] args) {
		int a;
		System.out.println("Enter a:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		int b = fact(a);
		System.out.println("factorial of a is" + " " + b);

	}
}