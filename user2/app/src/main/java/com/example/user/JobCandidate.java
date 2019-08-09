package com.example.user;


public class JobCandidate implements Comparable<JobCandidate> {
    private String name;
    private String gender;
    private int age;
    private double salary;
    private String email;
    private long phone;


    public JobCandidate(String name, String gender, int age,double salary,String email,long phone) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.salary = salary;

    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public double getsalary() {
        return  salary;
    }
    public long getPhone() {
        return  phone;
    }
    @Override
    public int compareTo(JobCandidate candidate) {
        return (this.getAge() < candidate.getAge() ? -1 :
                (this.getAge() == candidate.getAge() ? 0 : 1));
    }
    @Override
    public String toString() {
        return " Name: " + this.name + ", Gender: " + this.gender + ", age:" + this.age+ ", salary:" + this.salary;
    }
}