/*add an element at specified index */
import java.util.*;
public class array_three
{
public static void main(String[] args)
	{
Scanner s = new Scanner(System.in);
int location,value,n,i=0;
System.out.println("Enter the size of array");
n=s.nextInt();

int array[]= new int[n+1];
Arrays.fill(array, 0);
	for(i=0;i<n;i++){
	array[i]=s.nextInt();
	}
System.out.println("Enter the location and value where you want to insert the element");
location=s.nextInt();
value=s.nextInt();
	if(location>=0&&location<=n)
	{
		if(array[location]==0)
		{
		array[location]=value;
		}else{
			System.out.print("\nOops!! location is full program will shift the element\n");
			for( i = (n-1); i >= (location-1); i--)
        		{
           		 array[i+1] = array[i];
        		}
        		array[location-1] = value;
			
		}
			for(int k=0;k<=n;k++)
			System.out.print(array[k]+" ");
			System.out.print("\n");

	}
	else{
	System.out.println("enter valid location");
		}
}


}





