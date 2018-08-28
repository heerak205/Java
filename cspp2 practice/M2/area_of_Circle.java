import java.util.*;
public class area_of_Circle{
	static double pi()
	{
		double pie = 3.14;
		return pie;
	}
	static double area(double r)
	{
		double pie = pi();
		double area = pie * r * r;
		return area;

	}
	public static void main(String[] args) {
		double r = 3.24;
		double result = area(r);
		System.out.println("area is:" + result);

	}
}