import  java.util.*;
import java.lang.*;
public class linkedlist
{
public static void main(String[] args) {
  int flag,choice,input;
   LinkedList<String>  list =new  LinkedList<String> ();

  Scanner sc=new Scanner(System.in);
  while(true)
  {
    System.out.println("    Enter \n1 for insert\n2 for print\n3 for Delete\n4 for clear\n5 for print size of list\n6 for exit");
    choice=sc.nextInt();
    switch(choice){
      case 1:
                        System.out.println("    Enter \n1 for insert from front \n2 for insert from specific Position\n");
                        input=sc.nextInt();
                        switch(input){
                          case 1:
                          list.add(sc.next());
                          break;
                          case 2:
                          if(list.size()>0){
                                          System.out.println("Existing list is  ***"+list+"***  Enter the postion ");
                                          input=sc.nextInt();//use for take Position
                                                  if(input<=list.size()+1)
                                                  {
                                                  list.add(input-1,sc.next());
                                                  }else
                                                  System.out.println("\t****Please Enter a valid Input****");
                                          break;
                                        }else
                                            System.out.println("*************NO Existing list************* ");
                                      }
      break;
      case 2:
      System.out.println(list);
      break;
      case 3:
        if(list.size()>0){
                          System.out.println("    Enter \n1 for Delete from front \n2 for Delete from End \n3 for Delete from specific Position\n");
                          input=sc.nextInt();
                          switch(input)
                          {
                            case 1:
                            list.removeFirst();
                            break;
                            case 2:
                            list.removeLast();
                            break;
                            case 3:
                                  System.out.println(list+"\nEnter the Position of the Elemet");
                                  input=sc.nextInt();
                                  if(input<=list.size())
                                  {
                                  list.remove(input-1);
                                  }else
                                  System.out.println("\t****Please Enter a valid Input****");
                                  break;
                            }
                        }else
                        System.out.println("\t****List is empty****");
      break;
      case 4:
      list.clear();
        System.out.println("\t****List is Clear****");
      break;
      case 5:
      System.out.println("Size of list is "+list.size());
      break;
      case 6:
      System.exit(0);
      break;
    }

  }


}

}
