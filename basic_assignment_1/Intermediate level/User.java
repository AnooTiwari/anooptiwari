/*Stores a list of users
Display list of unique user names
lists the user in the increasing order of age
Ability to edit a user(phone number and email id)
Search a user by mobile number
Search a user by email ID*/
import java.util.*;
class employee{
  int ID;
  String name;
  int age;
  String phone;
  String email;
  double salary;
  employee(int ID,String name,double salary,int age,String phone,  String email){
    this.ID=ID;
    this.name=name;
    this.salary=salary;
    this.age=age;
    this.phone=phone;
    this.email=email;
  }
}
class User{
  public static void main(String args[]){
    employee s1=new employee(101,"vikash",50000.00,25,"9415418279","vikash@securifi.com");
    employee s2=new employee(102,"anoop",29000.00,27,"8563878480","anoop.tiwari@securifi.com");
    employee s3=new employee(103,"ronish",30000.00,30,"9984183098","ronish.pakhrin@securifi.com");
    //HashMap<Integer,employee> map=new HashMap<Integer,employee>();
    ArrayList<employee> list = new ArrayList<employee>();
    ArrayList<Integer> ageSort = new ArrayList<Integer>();

    list.add(s1);//adding employee class object
    list.add(s2);
    list.add(s3);
    Iterator itr=list.iterator();
    while(itr.hasNext()){
    employee st=(employee)itr.next();
    ageSort.add(ageSort.sort(st.age));
  //  System.out.println(st.ID+" "+st.name+" "+st.salary+" "+st.age+" "+st.phone+" "+st.email);
    }
    System.out.println(ageSort);
    }
  }
