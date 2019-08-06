import java.util.*;
import java.lang.*;
public class arrdeque
{
    public static void main(String[] args)
    {

        Deque<Integer> dque = new ArrayDeque<Integer>();
        int input,choice,i,n;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
          System.out.println("    Enter \n1 for insert\n2 for print\n3 for Delete\n4 for clear\n5 for print size of ArrayDeque\n6 for exit");
          choice=sc.nextInt();
          switch(choice){
            case 1:
                              System.out.println("    Enter \n1 for insert from front \n2 for insert from back\n");
                              input=sc.nextInt();
                              switch(input){
                                            case 1:
                                            dque.addFirst(sc.nextInt());
                                            break;
                                            case 2:
                                            dque.addLast(sc.nextInt());
                                            break;
                                          }
            break;
            case 2:
            System.out.println(dque);
            break;
            case 3:import java.lang.*;
              if(dque.size()>0){
                                System.out.println("    Enter \n1 for Delete from front \n2 for Delete from End \n3 for Delete from specific Position\n");
                                input=sc.nextInt();
                                switch(input)
                                {
                                  case 1:
                                  dque.removeFirst();
                                  break;
                                  case 2:
                                  dque.removeLast();
                                  break;
                                  case 3:
                                        System.out.println(dque+"\nEnter the Position of the Elemet");
                                        input=sc.nextInt();
                                        if(input<=dque.size())
                                        {
                                        dque.remove(input);
                                        }else
                                        System.out.println("\t****Please Enter a valid Input****");
                                        break;
                                  }
                              }else
                              System.out.println("\t****dque is empty****");
            break;
            case 4:
            dque.clear();
              System.out.println("\t****dque is Clear****");
            break;
            case 5:
            System.out.println("Size of dque is "+dque.size());
            break;
            case 6:
            System.exit(0);
            break;
          }
}}}
