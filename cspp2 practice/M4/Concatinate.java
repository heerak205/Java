import java.util.*;
public class Concatinate{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String l = "Hello ";
		String m = "!";
		l = l.concat(str).concat(m);
		//l = l.concat(m);

		System.out.println(l);
	}
}