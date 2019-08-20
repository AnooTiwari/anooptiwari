import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Employee
{
private String Id;
private String Name;
private String Department;
private String Salary;

public Employee(String Id, String Name, String Department,
String Salary)
{
this.Id=Id;
this.Name=Name;
this.Department=Department;
this.Salary=Salary;
}

public String getId() {
return Id;
}
public void setId(String id) {
Id = id;
}
public String getName() {
return Name;
}
public void setName(String name) {
Name = name;
}
public String getDepartment() {
return Department;
}
public void setDepartment(String department) {
Department = department;
}
public String getSalary() {
return Salary;
}
public void setSalary(String salary) {
Salary = salary;
}

public String toString()
{
return this.Id+"\t"+this.Name+"\t\t"+this.Department+"\t\t\t"+this.Salary;
}
}
