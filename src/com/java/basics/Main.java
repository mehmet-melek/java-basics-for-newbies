package com.java.basics;

import com.java.basics.oop.Polymorphism.Animal;
import com.java.basics.oop.Polymorphism.Cat;
import com.java.basics.oop.Polymorphism.Dog;
import com.java.basics.oop.composition.*;
import com.java.basics.oop.inheritance.Developer;
import com.java.basics.oop.inheritance.Manager;

public class Main {
    
    public static void main(String[] args) {
        
        
        //Math Operators
        /*MathOperators       mathOperators       = new MathOperators();
        mathOperators.perform();*/
        
        
        //Comparison Operators
        /*ComparisonOperators comparisonOperators = new ComparisonOperators();
        comparisonOperators.perform();*/
        
        
        //Conditions and Loops
        //IfElse ifElse = new IfElse();
        //ifElse.perform();
        //SwitchCase switchCase = new SwitchCase();
        //switchCase.perform();
        //ForLoops forLoops = new ForLoops();
        //forLoops.perform();
        //WhileLoops whileLoops = new WhileLoops();
        //whileLoops.perform();
        //DoWhileLoops doWhileLoops = new  DoWhileLoops();
        //doWhileLoops.perform();
        //BreakAndContinue breakAndContinue = new BreakAndContinue();
        //breakAndContinue.perform();
        
        
        //Sample App
        //PrimeNumberFinding primeNumberFinding = new PrimeNumberFinding();
        //primeNumberFinding.perform();
        
        
        // Method Overloading
        /*MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.perform(1);
        methodOverloading.perform(1,2,3);
        methodOverloading.perform("Sample String");*/
        
        
        //Encapsulation
        /*Encapsulation encapsulation = new Encapsulation(); // car = reference, Car()=Object
        encapsulation.setCarType("SUV");
        System.out.println(encapsulation.getCarType());
        encapsulation.setCarType("Sport");*/
        
        
        //Constructors
        //Constructors constructors = new Constructors("suv",2019,180,"Red");
        //Constructors constructors = new Constructors();
        //Constructors constructors = new Constructors(2018,160);
        /* System.out.println(constructors.getCarType());
        System.out.println(constructors.getCarModelYear());
        System.out.println(constructors.getCarHp());
        System.out.println(constructors.getCarColor());*/
        
        
        //Inheritance
        /*Manager manager = new Manager("Mehmet","Melek","IT",123456,3);
        manager.showInformation();
        manager.getSalary();
        Developer developer = new Developer("Mehmet","Melek","IT","Java", 123456);
        developer.showInformation();*/
        
        
        //Composition
        /*Cpu cpu = new Cpu("Intel","I9 9900K",8,3.6);
        Gpu gpu = new Gpu("Asus","GTX 1050",2,"GDDR5");
        Hardware hardware = new Hardware(cpu,gpu);
        OperatingSystem operatingSystem = new OperatingSystem("Ubuntu",18,"Open Source");
        OtherApps otherApps = new OtherApps("Firefox",75);
        Software software = new Software(operatingSystem,otherApps);
        Computer computer = new Computer(hardware,software);
        System.out.println(computer.getHardware().getCpu().getModel());
        computer.getSoftware().getOperatingSystem().upgradeOs(16);*/
    
    
        //Polymorphism
        /*Animal animal1 = new Dog("HotDog");
        Animal animal2 = new Cat("Cat");
        animal1.perform();
        animal2.perform();*/
        
        
        
        
        
        
        
    }
}
