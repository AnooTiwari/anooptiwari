import java.util.*;
import java.util.concurrent.TimeUnit;


class Employee{

  public String name;
  public String city;
  public String email;
  public String phone;
  public int age;

  public Employee(String name,String city,String email,int age,String phone)
  {
    super();
    this.name = name;
    this.city=city;
    this.email = email;
    this.age=age;
    this.phone = phone;
  }


  public String getPhone() {
    return phone;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public String getAddress() {
    return city;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
}


public class Display_Employee implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {        //  in the case if when age is Integer
  return o1.getAge() - o2.getAge();
}
/*public int compare(Employee o1, Employee o2) {              //for short by Name
return o1.getFirstName().compareTo(o2.getFirstName());
}*/
/*
public int compare(Employee o1, Employee o2) {              //for short by Name
  return o1.getAge().compareTo(o2.getAge());
}*/
public static void main(String[] args) throws Exception
{
  int choice,i,size,mob_serch_result,email_serch_result,age,age1;
  String name,city,email,phone,mob_serch,email_serch,update_search,choice_update,update_search_email;
  String name1,city1,email1,phone1,Update_choice,choice_update_for_phone,choice_update_for_email;

  Scanner sc = new Scanner(System.in);


  Map< String, Integer > mapEmail=new HashMap< String, Integer >();
  Map< String, Integer > mapPhone=new HashMap< String, Integer >();
  List<Employee> list = new ArrayList<Employee>();
                                                                              //User Input
  /*System.out.println("How much details you want to Enter");
  size=sc.nextInt()  ;
  for(i=0;i<size;i++)
  {

  System.out.println("\t\t\t\tEnter the  "+(i+1)+"  Employee Details \t\t\t\t\n");
  System.out.println("Enter the name ");
  name=sc.next();
  System.out.println("Enter the City ");
  city=sc.next();
  System.out.println("Enter the email ");
  email=sc.next();
  System.out.println("Enter the age ");
  age=sc.next();
  System.out.println("Enter the MobNum ");
  phone=sc.next();
  Employee employee=new Employee(name,city,email,age,phone);
  list.add(employee);
  mapPhone.put(phone,i);
  mapEmail.put(email,i);
}*/

//Testing input
Employee employee1=new Employee("Raj","Mumbai","raj@yahoo.com",27,"7499031600");
list.add(employee1);
phone="7499031600";
email="raj@yahoo.com";
mapPhone.put(phone,0);
mapEmail.put(email,0);
Employee employee2=new Employee("Rekha","Chennai","rekha@hotmail.com",24,"9598551664");
list.add(employee2);
phone1="9598551664";
email1="rekha@hotmail.com";
mapPhone.put(phone1,1);
mapEmail.put(email1,1);
Employee employee3=new Employee("Ram","Siliguri","ram@outlook.com",55,"8563878480");
list.add(employee3);
String phone2="8563878480";
String email2="ram@outlook.com";
mapPhone.put(phone2,2);
mapEmail.put(email2,2);
Employee employee4=new Employee("Lakhan","Bhopal","Lakhan@outlook.com",30,"8563050698");
list.add(employee4);
String phone3="8563050698";
String email3="Lakhan@outlook.com";
mapPhone.put(phone3,3);
mapEmail.put(email3,3);
Employee employee5=new Employee("Bharat","Ayodhya","Bharat@outlook.com",35,"9044669201");
list.add(employee5);
String phone4="9044669201";
String email4="Bharat@outlook.com";
mapPhone.put(phone4,4);
mapEmail.put(email4,4 );


for (Employee s : list)
{
  System.out.println("\n\n"+s.getName()+" " +s.getAddress()+" " +s.getAge()+" " +s.getEmail()+" " +s.getPhone());
}
                                                                          /*Seaching part*/
while(true)
{
  System.out.println("===========================================================================================================");
  System.out.println("Press 1 for Sort by age\nPress 2 for find the Person by mobile number\nPress 3 for find the Person by email\nPress 4 for update the mobiel number");
  choice= sc.nextInt();
  sc.nextLine();
  switch(choice)
  {
    case 1:
    Collections.sort(list, new  Display_Employee  ());
    for (Employee s : list)
    {
      System.out.println("  Name : "+s.getName()+"  City  : " +s.getAddress()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
    }
    System.out.println("===========================================================================================================");

    break;
    /*case 1 is Running perfectly*/

    case 2:
    System.out.println("Enter the mobile number of Employee ");
    mob_serch=sc.next();
    mob_serch_result=mapPhone.get(mob_serch);
    System.out.println("Mobile mob_serch_result is "+mob_serch_result);
    Employee Emp_phone_obj=(Employee)list.get(mob_serch_result);
    System.out.println("Employee Name:  "+Emp_phone_obj.getName()+"  Email : "+Emp_phone_obj.getEmail()+"  Age : "+Emp_phone_obj.getAge()+"  City : "+Emp_phone_obj.getAddress());
    break;                                                                /*case 2 is Running perfectly*/
    case 3:
    System.out.println("Enter the emailId of Employee ");
    email_serch=sc.nextLine();
    email_serch_result=mapEmail.get(email_serch);
    System.out.println("Email_serch_result is "+email_serch_result);
    Employee Emp_email_obj=(Employee)list.get(email_serch_result);
    System.out.println("Employee Name :  "+Emp_email_obj.getName()+"  Email : "+Emp_email_obj.getEmail()+"  Age : "+Emp_email_obj.getAge()+"  City : "+Emp_email_obj.getAddress());
    break;
    case 4:
    System.out.println("\033[H\033[2J"+"\n\n\t\t\tPress P to Edit PhoneNumber & Press E for Edit Email ");
    choice_update_for_phone=sc.next();
    choice_update_for_email=choice_update_for_phone;
    if(choice_update_for_phone.equalsIgnoreCase("P")||choice_update_for_phone.equalsIgnoreCase("p"))
    {
      System.out.println("Enter the mobile number ");
      update_search=  sc.next();
      mob_serch_result=mapPhone.get(update_search);
      Employee Emp_update_obj_phone=(Employee)list.get(mob_serch_result);
      update_search_email=Emp_update_obj_phone.getEmail();
      System.out.println("\t\t\t\t\t\t\tYour Search Result");
      System.out.println(" Name:  "+Emp_update_obj_phone.getName()+"  Email : "+Emp_update_obj_phone.getEmail()+"  Age : "+Emp_update_obj_phone.getAge()+"  City : "+Emp_update_obj_phone.getAddress());
      System.out.println("\t\t\t\t\t\t\tPress Y or y for Confirm and Update\tPress N or n for Cancle");
      choice_update=sc.next();
      if(choice_update.equalsIgnoreCase("Y")||choice_update.equalsIgnoreCase("y"))
      {
        mapPhone.remove(update_search);
        // mapEmail.remove(update_search_email);
        list.remove(Emp_update_obj_phone);                                      // Remove the full selected details of employee

        // System.out.println("Enter the Firstname ");
        name1=Emp_update_obj_phone.getName();
        // System.out.println("Enter the City ");
        city1=Emp_update_obj_phone.getAddress();
        // System.out.println("Enter the email ");
        email1=Emp_update_obj_phone.getEmail();
        // System.out.println("Enter the age ");
        age1=Emp_update_obj_phone.getAge();
        System.out.println("Enter the MobNum ");
        phone1=sc.next();
        Employee employee=new Employee(name1,city1,email1,age1,phone1);
        list.add(employee);
        mapPhone.put(phone1,  mob_serch_result);
        //mapEmail.put(email1,  mob_serch_result);
      }

    }//phone edit Option
    else if(choice_update_for_email.equalsIgnoreCase("e")||choice_update_for_email.equalsIgnoreCase("E"))
    {
      System.out.println("Enter the email ");
      update_search_email=  sc.next();
      email_serch_result=mapEmail.get(update_search_email);
      Employee Emp_update_obj_email=(Employee)list.get(email_serch_result);
      // update_search_email=Emp_update_obj_email.getEmail();
      System.out.println("\t\t\t\t\t\t\tYour Search Result");
      System.out.println(" Name:  "+Emp_update_obj_email.getName()+"  Email : "+Emp_update_obj_email.getEmail()+"  Age : "+Emp_update_obj_email.getAge()+"  City : "+Emp_update_obj_email.getAddress());
      System.out.println("\t\t\t\t\t\t\tPress Y or y for Confirm and Update\tPress N or n for Cancle");
      choice_update=sc.next();
      if(choice_update.equalsIgnoreCase("Y")||choice_update.equalsIgnoreCase("y"))
      {
        // mapPhone.remove(update_search);
        mapEmail.remove(update_search_email);
        list.remove(Emp_update_obj_email);                                      // Remove the full selected details of employee
        // System.out.println("Enter the Firstname ");
        name1=Emp_update_obj_email.getName();
        // System.out.println("Enter the City ");
        city1=Emp_update_obj_email.getAddress();
      // System.out.println("Enter the age ");
        age1=Emp_update_obj_email.getAge();
        // System.out.println("Enter the MobNum ");
        phone1=Emp_update_obj_email.getPhone();
        System.out.println("Enter the email ");
        email1=sc.next();
        Employee employee=new Employee(name1,city1,email1,age1,phone1);
        list.add(employee);
        // mapPhone.put(phone1,  mob_serch_result);
        mapEmail.put(email1,email_serch_result);
      }
    }//email edit option

    break;
    default:
    System.out.println("\n\t****Please give a valid Input****\t\n");
    break;
  }
}

}//End of main() method
}//end of DisplayArrayList class
