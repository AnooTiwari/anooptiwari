import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class hashmapnew2 {
	public static void main(String[] args)
	{
	HashMap<String, String> obj=new HashMap<>();
	System.out.println("Enter the size: ");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();

	String first,last;
	for(int i=0;i<n;i++){
		first=sc.next();
		last=sc.next();
		obj.put(first,last);
	}
	System.out.println("without loop" + obj);
// 	Iterator itr = obj.entrySet().iterator();
// while (itr.hasNext()) {
//         Map.Entry mp = (Map.Entry)itr.next();
//         System.out.println(mp.getKey()+"  "+mp.getValue());
//        }
	}
}
