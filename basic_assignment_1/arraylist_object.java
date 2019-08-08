import java.util.*;
class employee{
  int ID;
  String name;
  double salary;
  employee(int ID,String name,double salary){
    this.ID=ID;
    this.name=name;
    this.salary=salary;
  }
}
class arraylist_object{
  public static void main(String args[]){
    employee s1=new employee(101,"vikash",50000.00);
    employee s2=new employee(102,"anoop",29000.00);
    employee s3=new employee(103,"ronish",30000.00);
    ArrayList<employee> al=new ArrayList<employee>();
    al.add(s1);//adding employee class object
    al.add(s2);
    al.add(s3);
    Iterator itr=al.iterator();
    while(itr.hasNext()){
      employee st=(employee)itr.next();
      System.out.println(st.ID+" "+st.name+" "+st.salary);
    }
  }
}
