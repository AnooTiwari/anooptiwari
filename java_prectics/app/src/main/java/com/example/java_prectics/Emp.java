package com.example.java_prectics;

import java.util.Objects;

public class Emp {
    private  int ID;
    private  String name;
    private  int age;

    public Emp(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return getID() == emp.getID() &&
                getAge() == emp.getAge() &&
                getName().equals(emp.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName(), getAge());
    }

    public void setName(String name) {
        this.name = name;
    }

}
