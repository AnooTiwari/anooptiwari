import java.util.*;

class hashset
{
    public static void main(String[]args)
    {
      int i,n;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of HashSet");
        n=sc.nextInt();
        HashSet<String> h = new HashSet<String>();

        for(i=0;i<n;i++)
        h.add(sc.next());
        System.out.println(h);

    }
}
