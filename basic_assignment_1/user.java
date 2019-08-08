import java.util.*;

class user
{
  int n=4;
  class Data
  {
    int id;
    String name;
    long phone;
    Data(int id, String name,long phone)
    {
      this.id = id;
      this.name = name;
      this.phone = phone;
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int id[] = {1, 2, 3, 4};
    long k;
    String[] name= new  String[50];
    long[] phone = new long[50];
    for(int i=0;i<4;i++){
      System.out.println("Enter the "+(i+1)+"name");
      name[i]=sc.next();
      System.out.println("Enter the "+(i+1)+"mobile number");
      k=sc.nextLong();
      phone[i]=k;
    }
    user usrobj = new user();
    usrobj.addValues(id, name,phone);
  }

  public void addValues(int id[], String name[], long phone[])
  {
    ArrayList<Data> list=new ArrayList<>();

    for (int i = 0; i < n; i++)
    {
      list.add(new Data(id[i], name[i],phone[i]));
    }
    printValues(list);
  }

  public void printValues(ArrayList<Data> list)
  {
    for (int i = 0; i < n; i++)
    {
      Data data = list.get(i);
      System.out.println(data.id+" "+data.name+" "+data.phone);
    }
  }
}
