package com.java.basics.oop.inheritance;

// Manager **Is a** employee
// SubClass
public class Manager extends Employee {
    
    
    private int managerLevel;
    
    public Manager(String name, String surName, String department, int salary, int managerLevel) {
        super(name, surName, department, salary);
        this.managerLevel = managerLevel;
    }
    
    
    //Method Overriding
    //Similar method exist on the employee class. But the following method will execute.(Method Overriding)
    @Override
    public void showInformation() {
        super.showInformation();  // Getting from SuperClass (Employee) with "super."
        System.out.println(getManagerLevel());
    }
    
    
    //Getter and Setter
    
    //Method Overriding
    @Override
    public int getSalary() {
        System.out.println("The manager salary is confidential information!");
        return 0;
    }
    
    public int getManagerLevel() {
        return managerLevel;
    }
    
    public void setManagerLevel(int managerLevel) {
        this.managerLevel = managerLevel;
    }
}
