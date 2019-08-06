import java.util.*;

class pque
{
    public static void main(String args[])
    {

        PriorityQueue<String> que = new PriorityQueue<String>();

        int i,n;
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of HashSet");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        que.add(sc.next());

        System.out.println(que); 


    }
}
