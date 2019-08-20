package com.example.java_prectics;

import java.util.ArrayList;

class Employees {
    //fields
    private String name;
    private int age;
    public String employees;
    public String department;

    public String getDepartment(){
        return department;
    }
    public Employees()
    {
        name = "unknown name";
        age = 3;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return this.getName() + " (" + this.getAge() + " Age)";
    }
    public void setDepartment(String d1) {
        this.department = d1;

    }
    public void setDeptName(String string) {
        string = string;

    }

}



class Department {

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

            //checkDept(e);
        }

    }



    public ArrayList<Employees> getEmployees() {
        return this.employees;

    }

    public void setEmployees(Employees e) {
        this.emp = e;

    }

}






public class Company
{

    String name;
    ArrayList<Department> department;
    static ArrayList<Employees> employees;
    public Company(String name)
    {
        this.name = name;
        department = new ArrayList<Department>();
        employees = new ArrayList<Employees>(13);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Department> getDepartment()
    {
        return department;
    }

    public ArrayList<Employees> getEmployees()
    {
        return employees;
    }

    public void addDepartment(Department d1)
    {
        this.department.add(d1);
    }
    public void addEmployees(Employees e1)
    {
        this.employees.add(e1);
    }

    public static boolean primeNumber(int ageX) {
        if (ageX <= 1)
        {
            System.out.println("Age is not a prime number");
            return false;

        }
        for (int i = 2; i < Math.sqrt(ageX); i++)
        {
            if (ageX % i == 0)
            {
                System.out.println("Age is not a prime number");
                return false;

            }
        }

        System.out.println("Age is a prime number");
        return true;

    }

    public static void main(String[] args)
    {
        //create a new company
        //Company testCompany = new Company("Company's Employee List");
        ArrayList<Department> listB = new ArrayList(4);
        ArrayList<Employees> list = new ArrayList(13);
        Department d1 = new Department("Accounting");
        d1.setDeptName("Accounting");
        Department d2 = new Department("Marketing");
        d2.setDeptName("Marketing");
        Department d3 = new Department("Human Resources");
        d3.setDeptName("Human Resources");
        Department d4 = new Department("Information Systems");
        d4.setDeptName("Information Systems");
        listB.add(d1);
        listB.add(d2);
        listB.add(d3);
        listB.add(d4);



        Employees e1 = new Employees();
        e1.setName("Counting Guru");
        e1.setAge(55);
        e1.setDepartment("Accounting");

        Employees e2 = new Employees();
        e2.setName("Counting Pro");
        e2.setAge(45);
        e2.setDepartment("Accounting");

        Employees e3 = new Employees();
        e3.setName("Counting Savvy");
        e3.setAge(40);
        e3.setDepartment("Accounting");

        Employees e4 = new Employees();
        e4.setName("Counting Novice");
        e4.setAge(25);
        e4.setDepartment("Accounting");

        Employees e5 = new Employees();
        e5.setName("Sales Guru");
        e5.setAge(50);
        e5.setDepartment("Marketing");

        Employees e6 = new Employees();
        e6.setName("Sales Pro");
        e6.setAge(48);
        e6.setDepartment("Marketing");

        Employees e7 = new Employees();
        e7.setName("Sales Savvy");
        e7.setAge(38);
        e7.setDepartment("Marketing");

        Employees e8 = new Employees();
        e8.setName("Hiring Guru");
        e8.setAge(58);
        e8.setDepartment("Human Resources");

        Employees e9 = new Employees();
        e9.setName("Hiring Pro");
        e9.setAge(47);
        e9.setDepartment("Human Resources");

        Employees e10 = new Employees();
        e10.setName("Hacking Pro");
        e10.setAge(46);
        e10.setDepartment("Information Systems");

        Employees e11 = new Employees();
        e11.setName("Hacking Guru");
        e11.setAge(51);
        e11.setDepartment("Information Systems");

        Employees e12 = new Employees();
        e12.setName("Hacking Savvy");
        e12.setAge(38);
        e12.setDepartment("Information Systems");

        Employees e13 = new Employees();
        e13.setName("Hacking Novice");
        e13.setAge(23);
        e13.setDepartment("Information Systems");

        Department.addEmployeeX(e1);
        Department.addEmployeeX(e2);
        Department.addEmployeeX(e3);
        Department.addEmployeeX(e4);
        Department.addEmployeeX(e5);
        Department.addEmployeeX(e6);
        Department.addEmployeeX(e7);
        Department.addEmployeeX(e8);
        Department.addEmployeeX(e9);
        Department.addEmployeeX(e10);
        Department.addEmployeeX(e11);
        Department.addEmployeeX(e12);
        Department.addEmployeeX(e13);



        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);
        list.add(e11);
        list.add(e12);
        list.add(e13);

        System.out.println("********** Company's Employee List **********");

        for (int x = 0; x < list.size(); x++)
        {
            System.out.println(list.get(x).getDepartment());

            if (x == 0)
            {
                primeNumber(e1.getAge());

            }
            else if (x == 1)
            {
                primeNumber(e2.getAge());
            }
            else if (x == 2)
            {
                primeNumber(e3.getAge());
            }
            else if (x == 3)
            {
                primeNumber(e4.getAge());
            }
            else if ( x == 4)
            {
                primeNumber(e5.getAge());
            }
            else if ( x == 5)
            {
                primeNumber(e6.getAge());
            }
            else if (x == 6)
            {
                primeNumber(e7.getAge());
            }
            else if (x == 7)
            {
                primeNumber(e8.getAge());
            }
            else if (x == 8)
            {
                primeNumber(e9.getAge());
            }
            else if (x == 9)
            {
                primeNumber(e10.getAge());
            }
            else if (x == 10)
            {
                primeNumber(e11.getAge());
            }
            else if (x == 11)
            {
                primeNumber(e12.getAge());
            }
            else if (x == 12)
            {
                primeNumber(e13.getAge());
            }

        }

        System.out.println("********** End of Employee List **********");


    }

}
