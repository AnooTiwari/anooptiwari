import java.util.*;
import java.util.concurrent.TimeUnit;
class Employee implements Comparator<Employee> {
  private String name;
  private String city;
  private String email;
  private String phone;
  private int age;
  public Employee(){}
    public void setAge(Integer age) {
      this.age = age;
    }
    public void setName(String Name) {
      this.name = Name;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public void setPhone(String phone) {
      this.phone=null;
      this.phone = phone;
    }
    public void setCity(String city) {
      this.city = city;
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
    public int compare(Employee o1, Employee o2) {        //  in the case if when age is Integer
      return o1.getAge() - o2.getAge();
    }

  }
  public class Display_Employee  {
    public static void main(String[] args)
    {
      int choice,i,size,mob_serch_result,email_serch_result,age,age1;
      String name,city,email,phone,mob_serch,email_serch,update_search,choice_update,update_search_email;
      String name1,city1,email1,phone1,Update_choice,choice_update_for_phone,choice_update_for_email;
      Scanner sc = new Scanner(System.in);
      Map< String, Integer > mapEmail=new HashMap< String, Integer >();
      Map< String, Integer > mapPhone=new HashMap< String, Integer >();
      List<Employee> list = new ArrayList<Employee>();
      /*
      System.out.println("How much details you want to Enter");
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
      age=sc.nextInt();

      System.out.println("Enter the MobNum ");
      phone=sc.next();

      Employee employee=new Employee();
      employee.setAge(age);
      employee.setName(name);
      employee.setCity(city);
      employee.setPhone(phone);
      employee.setEmail(email);
      list.add(employee);
      mapPhone.put(phone,i);
      mapEmail.put(email,i);
    }*/

    /*Test input Start*/
    name="Anoop";
    city="kanpur";
    email="anoop@gmail.com";
    age=23;
    phone="9415418279";
    Employee employee=new Employee();
    employee.setAge(age);
    employee.setName(name);
    employee.setCity(city);
    employee.setPhone(phone);
    employee.setEmail(email);
    list.add(employee);
    mapPhone.put(phone,0);
    mapEmail.put(email,0);

    /*Test input end*/

    for (Employee s : list)
    {
      System.out.println("\n\n"+s.getName()+" " +s.getAddress()+" " +s.getAge()+" " +s.getEmail()+" " +s.getPhone());
    }
    while(true)
    {
      System.out.println("===========================================================================================================");
      System.out.println("Press 1 for Sort by age\nPress 2 for find the Person by mobile number\nPress 3 for find the Person by email\nPress 4 for update the mobiel number\nPress 5 for print list and free the varible ");
      choice= sc.nextInt();
      sc.nextLine();
      switch(choice)
      {
        case 1:
        Collections.sort(list,new Employee());
        for (Employee s : list)
        {
          System.out.println("  Name : "+s.getName()+"  City  : " +s.getAddress()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
        }
        System.out.println("===========================================================================================================");

        break;
        case 2:
        System.out.println("Enter the mobile number of Employee ");
        mob_serch=sc.next();
        mob_serch_result=mapPhone.get(mob_serch);
        System.out.println("Mobile mob_serch_result is "+mob_serch_result);
        Employee Emp_phone_obj=(Employee)list.get(mob_serch_result);
        System.out.println("Employee Name:  "+Emp_phone_obj.getName()+"  Email : "+Emp_phone_obj.getEmail()+"  Age : "+Emp_phone_obj.getAge()+"  City : "+Emp_phone_obj.getAddress());
        break;
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
          System.out.println("Enter the Old Mobile number ");
          update_search=sc.next();
          mob_serch_result=mapPhone.get(update_search);
          System.out.println("  mob_serch_result "+mob_serch_result);
          Employee Emp_update_obj_phone=(Employee)list.get(mob_serch_result);
          System.out.println("\t\t\t\t\t\t\tYour Search Result");
          System.out.println(" Name:  "+Emp_update_obj_phone.getName()+"  Email : "+Emp_update_obj_phone.getEmail()+"  Age : "+Emp_update_obj_phone.getAge()+"  City : "+Emp_update_obj_phone.getAddress());
          System.out.println("\t\t\t\tPress Y or y for Confirm and Update\tPress N or n for Cancle");
          choice_update=sc.next();
          if(choice_update.equalsIgnoreCase("Y")||choice_update.equalsIgnoreCase("y"))
          {
            System.out.println("Enter the New MobNum ");
            phone1=sc.next();
            Emp_update_obj_phone.setPhone(phone1);
            System.out.println("\t\t\t\tupdated entry is :\n");
            mapPhone.put(phone1,mob_serch_result);                                        //Map update
            System.out.println(" Name:  "+Emp_update_obj_phone.getName()+"  Email : "+Emp_update_obj_phone.getEmail()+"  Age : "+Emp_update_obj_phone.getAge()+"  City : "+Emp_update_obj_phone.getAddress()+"  PhoneNumber : "+Emp_update_obj_phone.getPhone());
          }
        }
        else if(choice_update_for_email.equalsIgnoreCase("e")||choice_update_for_email.equalsIgnoreCase("E"))
        {
          System.out.println("Enter the old email ");
          update_search_email=  sc.next();
          email_serch_result=mapEmail.get(update_search_email);
          System.out.println(" email_serch_result = "+  email_serch_result);
          Employee Emp_update_obj_email=(Employee)list.get(email_serch_result);
          System.out.println("\t\t\t\t\t\t\tYour Search Result");
          System.out.println(" Name:  "+Emp_update_obj_email.getName()+"  Email : "+Emp_update_obj_email.getEmail()+"  Age : "+Emp_update_obj_email.getAge()+"  City : "+Emp_update_obj_email.getAddress());
          System.out.println("\t\t\t\t\t\t\tPress Y or y for Confirm and Update\tPress N or n for Cancle");
          choice_update=sc.next();
          if(choice_update.equalsIgnoreCase("Y")||choice_update.equalsIgnoreCase("y"))
          {
            System.out.println("Enter the new email ");
            email1=sc.next();
            Emp_update_obj_email.setEmail(email1);
            mapEmail.put(email1,email_serch_result);
          }
        }
        break;
        case 5:
        Iterator<Employee> itr=list.iterator();

        while(itr.hasNext())
        {
          Employee employe = itr.next();
          System.out.print("  name:  "+employe.getName());
          System.out.print("  email:  "+employe.getEmail());
          System.out.print("  age:  "+employe.getAge());
          System.out.println("  phone:  "+employe.getPhone());
        }
        System.gc();
        break;
        default:
        System.out.println("\n\t****Please give a valid Input****\t\n");
        break;
      }

    }
  }//End of main() method
}//end of DisplayArrayList class
