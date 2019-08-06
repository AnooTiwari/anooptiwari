// Java code to illustrate the entrySet() method 
import java.util.*; 
public class Sample_TestMaps { 
	public static void main(String[] args) 
	{ 
      int size,i;
      String a,b;

		// Creating an empty HashMap 
		HashMap<String, String> map = new HashMap<String, String>(); 

		// Mapping string values to int keys 
Scanner sc =new Scanner(System.in);
System.out.println("How Much data you want to insert");
size=sc.nextInt();
for(i=1;i<=size;i++)
{
  map.put(a=sc.nextLine(),b=sc.nextLine());
}

		// Displaying the HashMap 
		System.out.println("Initial Mappings are: " + map); 

		// Using entrySet() to get the set view 
		System.out.println("The set is: " + map); 
	} 
} 












