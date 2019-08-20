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


public class DisplayArrayList implements Comparator<Employee> {
  public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
/*public int compare(Employee o1, Employee o2) {              //for short by Name
  return o1.getFirstName().compareTo(o2.getFirstName());
  }
*/
  public static void main(String[] args) throws Exception
  {
    int choice,index=0;
    String data,newMob;
    // String Name;
    // String email;
    // String phone;
    // String city;
    // int age;
    Scanner sc = new Scanner(System.in);

    Map< String, List<Employee> > map=new HashMap< String, List<Employee> >();

    List<Employee> list = new ArrayList<Employee>();
    Employee employee1=new Employee("Ravi","Delhi","Ravi@gmail.com",28,"9415418279");
    Employee employee2=new Employee("Rekha","Chennai","rekha@hotmail.com",24,"9598551664");
    Employee employee3=new Employee("Ram","Siliguri","ram@outlook.com",55,"8563878480");
    Employee employee4=new Employee("Lakhan","Bhopal","Lakhan@outlook.com",30,"8563050698");
    Employee employee5=new Employee("Bharat","Ayodhya","Bharat@outlook.com",35,"9044669201");
    Employee employee6=new Employee("ravan","lanka","Ravan@outlook.com",32,"9336566428");
    //list.add(new Employee("Ravi","Delhi","Ravi@gmail.com",28,"9415418279"));
    list.add(employee1);
    list.add(employee2);
    list.add(employee3);
    list.add(employee4);
    list.add(employee5);
    list.add(employee6);
    map.put("securifi",list);
    // list.add(new Employee("Raj","Mumbai","raj@yahoo.com",27,"7499031600"));
    // list.add(new Employee("Rekha","Chennai","rekha@hotmail.com",24,"9598551664"));
    // list.add(new Employee("Ram","Siliguri","ram@outlook.com",55,"8563878480"));
    // list.add(new Employee("Lakhan","Bhopal","Lakhan@outlook.com",30,"8563050698"));
    // list.add(new Employee("Bharat","Ayodhya","Bharat@outlook.com",35,"9044669201"));
    // list.add(new Employee("ravan","lanka","Ravan@outlook.com",32,"9336566428"));
    /*System.out.print("\nId: ");
    Id=sc.next();
    System.out.print("\nName: ");
    Name=sc.next();
    System.out.print("\nCity: ");
    city=sc.next();
    System.out.print("\nEmail: ");
    email=sc.next();
    System.out.print("\nphone: ");
    phone=sc.next();
    System.out.print("\nAge: ");
    age=sc.nextInt();
    sc.nextLine();
    Employee employee1=new Employee(Name, city, email, age, phone);
  */


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
        Collections.sort(list, new  DisplayArrayList());
        for (Employee s : list)
        {
          System.out.println("  Name : "+s.getName()+"  City  : " +s.getAddress()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
        }
        System.out.println("===========================================================================================================");
        TimeUnit.SECONDS.sleep(5);
        System.out.print("\033[H\033[2J");
        break;
        case 2:
        // System.out.println("Enter the mobile number ");
        // data = sc.nextLine();
        map.values();

        // for (Employee s : list)
        // {
        //   if(s.getPhone().equals(data)){
        //   // System.out.println("ArrayList contains data at index :" + (index+1));
        //   System.out.println("  Name : "+s.getName()+"  City  : " +s.getAddress()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
        //   TimeUnit.SECONDS.sleep(3);
        //   System.out.print("\033[H\033[2J");
        // }
        //   //else
        //   //index++;
        // }

        break;
        case 3:
          System.out.println("Enter the email ");
          data = sc.nextLine();
          for (Employee s : list)
          {
              if(s.getEmail().equals(data)){
            // System.out.println("ArrayList contains data at index :" + (index+1));
              System.out.println("  Name : "+s.getName()+"  City  : " +s.getAddress()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
              TimeUnit.SECONDS.sleep(5);
            }
            //else
            //index++;
          }
        break;
        case 4:
              System.out.println("Enter the mobile number ");
              data = sc.nextLine();
              for (Employee s : list)
              {
                if(s.getPhone().equals(data)){
                  System.out.println("  Name : "+s.getName()+"  City  : " +s.getName()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
                  System.out.println("Ener a New Mobile Number");
                  newMob=sc.nextLine();
                  Employee e = list.get(0);
                  e.setPhone(newMob);
                  System.out.println("Mobile Number Change Successfully for check select Option number 2");
                  TimeUnit.SECONDS.sleep(3);
                   System.out.print("\033[H\033[2J");
                }
            }
        break;
        default:
        System.out.println("\n\t****Please give a valid Input****\t\n");

        break;
      }
    }

  }//End of main() method
}//end of DisplayArrayList class
