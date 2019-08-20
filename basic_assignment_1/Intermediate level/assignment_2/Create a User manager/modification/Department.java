public class Department {

Employees emp;
static ArrayList<Employees> employees;
String deptName;
    String department;

    public Department(String String) {
    this.deptName = deptName;

}

public String getDeptName() {
    return deptName;
}

public void setDeptName(String deptName) {
    this.deptName = deptName;
}

public static void addEmployeeX(Employees e)
{
    //put the employee age's in ascending order
    if (employees.isEmpty())
    {
    employees.add(e);
    }
    else
    {
        int i;
    for (i = 0; i < employees.size(); i++)
    {
        if (employees.get(i).getAge() > e.getAge())
        {
        employees.add(i, e);
        break;
        }
        }
    if (i == employees.size())
        {
            employees.add(e);
        }

        checkDept(e);
    }

}



public ArrayList<Employees> getEmployees() {
    return this.employees;

}

public void setEmployees(Employees e) {
    this.emp = e;

}

}
