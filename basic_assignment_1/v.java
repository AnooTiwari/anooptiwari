import java.util.*;
public class v{
public static void main(String[] args) {
  int size,i;
Vector v = new Vector();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size of vector list");
size=sc.nextInt();
    for(i=0;i<size;i++)
      v.add(sc.next());
    System.out.println(v);
}
}
