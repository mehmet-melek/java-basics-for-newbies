package com.java.basics.oop.inheritance;

// SuperClass or BaseClass
public class Employee {
    
    private String name;
    private String surName;
    private String department;
    private int    salary;
    
    public Employee(String name, String surName, String department, int salary) {
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }
    
    public void showInformation() {
        System.out.println(getName());
        System.out.println(getSurName());
        System.out.println(getDepartment());
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurName() {
        return surName;
    }
    
    public void setSurName(String surName) {
        this.surName = surName;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getSalary() {
        System.out.println(salary);
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
