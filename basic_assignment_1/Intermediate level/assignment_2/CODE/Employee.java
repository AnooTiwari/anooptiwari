import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Employee {
    private long id;
    private String name;
    private Date dateOfBirth;
    private BigDecimal salary;
    public final void setId(long id) {
        this.id = id;
    }
    public final void setName(String name) {
        this.name = name;
    }
    public final void setDateOfBirth(Date date) {
        this.dateOfBirth = date;
    }
    public final void setSalary(BigDecimal salaey) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        HashMap<Employee,String> employeeMap = new HashMap<Employee,String>();
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Sachin");
        employee1.setDateOfBirth(new Date(1987,2,1));
        employee1.setSalary(new BigDecimal(100000));
        employeeMap.put(employee1,"India");
        Iterator<Employee> itr = employeeMap.entrySet().iterator();
        while(itr.hasNext()){
        System.out.prinln((employee1)itr.next());
        }

      /*
        Employee{id=1, name='Sachin', dateOfBirth=Tue Mar 01 00:00:00 IST 3887, salary=100000}=India}
    */
    }


}
