import java.util.*;
import java.lang.*;
public class treeset
{
    public static void main(String[] args)
    {

        TreeSet<Integer> ts = new TreeSet<Integer>();
        int input,choice,i,n;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
          System.out.println("    Enter \n1 for insert\n2 for print\n3 check the value is exist or not\n4 for clear\n5 for print size of TreeSet\n6 for fist element\n7 for last element\n8 for exit");
          choice=sc.nextInt();
          switch(choice){
            case 1:
            ts.add(sc.nextInt());
            break;
            case 2:
            System.out.println(ts);
            break;
            case 3:
            System.out.println("    Enter the value wich you want to find the TreeSet");
            if(ts.contains(sc.nextInt()))
            System.out.println("\t****value exist****");
            else
            System.out.println("\t****value NOT exist****");
            break;
            case 4:
            ts.clear();
            System.out.println("\t****TreeSet is Clear****");
            break;
            case 5:
            System.out.println("Size of TreeSet is "+ts.size());
            break;
            case 6:
            System.out.println("First value  of TreeSet is "+ts.first());
            break;
            case 7:
            System.out.println("Last value  of TreeSet is "+ts.last());
            break;
            case 8:
            System.exit(0);
            break;
          }
}}}
