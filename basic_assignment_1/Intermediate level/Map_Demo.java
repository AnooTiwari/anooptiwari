import java.util.*;

public class Map_Demo {
	public static void main(String[] args)
	{

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "4");
		map.put(20, "B");
		map.put(25, "C");
		map.put(30, "D");


		System.out.println("Initial Mappings are: " + map);

		System.out.println("	System.out.println"+"("+"The Value is: "+" map.get(3))");
		System.out.println("The Value is: " + map.get(3));
		System.out.println("The Value is: " + map.get(10));
	}
}
