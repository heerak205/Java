import java.util.*;
public class degrees_to_fahrenheit{
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter a:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = a * 9/5 + 32;
		System.out.println("after conversion to fahrenheit:" + b);

	}
}
