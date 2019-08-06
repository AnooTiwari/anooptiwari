/*remove element from specified index of ArrayList*/
import java.util.*;
public class arraylist_foure
{
   public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<Integer>();
      int size,i,element;
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the sie of the ArrayList");
     size= sc.nextInt();
     for(i=0;i<size;i++)
     {
      al.add(sc.nextInt());
     }
   System.out.println("ArrayList is  "+al+"\t Which position you want to remove Enter the element");
   element = sc.nextInt();
   for(i=0;i<size;i++)
   {
     if(i==element)
     al.remove(element-1);
   }
    System.out.println("Now ArrayList is  "+al);

}
}
