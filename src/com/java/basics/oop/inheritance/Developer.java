package com.java.basics.oop.inheritance;

// Manager **Is a** employee
// SubClass
public class Developer extends Employee {
    
    private String lang;
    
    public Developer(String name, String surName, String department, String lang, int salary) {
        super(name, surName, department, salary);
        this.lang = lang;
    }
    
    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println(getLang());
    }
    
    public String getLang() {
        return lang;
    }
    
    public void setLang(String lang) {
        this.lang = lang;
    }
}
