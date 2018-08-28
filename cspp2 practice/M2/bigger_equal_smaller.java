import java.util.*;
public class bigger_equal_smaller{
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter a and b");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		if(a > b){
			System.out.println("a is greater");
		}
		else if(a == b){
			System.out.println(("Equal"));
		}
		else{
			System.out.println("b is greater");
		}
	}
}