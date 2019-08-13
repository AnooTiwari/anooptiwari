import java.util.*;
import java.util.concurrent.TimeUnit;


class Employee{
  public int id;
  public String name;
  public String city;
  public String email;
  public String phone;
  public int age;

  public Employee(int id, String name,String city,String email,int age,String phone)
  {
    super();
    this.id = id;
    this.name = name;
    this.city=city;
    this.email = email;
    this.age=age;
    this.phone = phone;
  }

  public int getId() {
    return id;
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
    Scanner sc = new Scanner(System.in);

    List<Employee> list = new ArrayList<Employee>();
    list.add(new Employee(1, "Ravi","Delhi","Ravi@gmail.com",28,"9415418279"));
    list.add(new Employee(2, "Raj","Mumbai","raj@yahoo.com",27,"7499031600"));
    list.add(new Employee(3, "Rekha","Chennai","rekha@hotmail.com",24,"9598551664"));
    list.add(new Employee(4, "Ram","Siliguri","ram@outlook.com",55,"8563878480"));
    list.add(new Employee(4, "Lakhan","Bhopal","Lakhan@outlook.com",30,"8563050698"));
    list.add(new Employee(4, "Bharat","Ayodhya","Bharat@outlook.com",35,"9044669201"));
    list.add(new Employee(4, "ravan","lanka","Ravan@outlook.com",32,"9336566428"));

    for (Employee s : list)
    {
      System.out.println("\n\n"+s.getId()+" "+s.getName()+" " +s.getAddress()+" " +s.getAge()+" " +s.getEmail()+" " +s.getPhone());

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
          System.out.println("SN : "+s.getId()+"  Name : "+s.getName()+"  City  : " +s.getAddress()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
        }
        System.out.println("===========================================================================================================");
        TimeUnit.SECONDS.sleep(5);
        System.out.print("\033[H\033[2J");
        break;
        case 2:
        System.out.println("Enter the mobile number ");
        data = sc.nextLine();
        for (Employee s : list)
        {
          if(s.getPhone().equals(data)){
          // System.out.println("ArrayList contains data at index :" + (index+1));
          System.out.println("SN : "+s.getId()+"  Name : "+s.getName()+"  City  : " +s.getAddress()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
          TimeUnit.SECONDS.sleep(3);
          System.out.print("\033[H\033[2J");
        }
          //else
          //index++;
        }
        break;
        case 3:
          System.out.println("Enter the email ");
          data = sc.nextLine();
          for (Employee s : list)
          {
              if(s.getEmail().equals(data)){
            // System.out.println("ArrayList contains data at index :" + (index+1));
              System.out.println("SN : "+s.getId()+"  Name : "+s.getName()+"  City  : " +s.getAddress()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
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
                  System.out.println("SN : "+s.getId()+"  Name : "+s.getName()+"  City  : " +s.getName()+" Age : " +s.getAge()+" Email : " +s.getEmail()+"    Phone : " +s.getPhone());
                  System.out.println("Ener a New Mobile Number");
                  newMob=sc.nextLine();
                  Employee e = list.get(1);
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
