package com.java.basics;


import com.java.basics.oop.abstractclass.Circle;
import com.java.basics.oop.abstractclass.Figure;
import com.java.basics.oop.abstractclass.Square;
import com.java.basics.sample_apps.interfaceapp.SignUpManager;
import com.java.basics.sample_apps.interfaceapp.User;
import com.java.basics.sample_apps.interfaceapp.UserComplexCheckService;

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
        
        
        //Arrays
        //ArrayOperations arrayOperations = new ArrayOperations();
        //arrayOperations.createArray();
        //arrayOperations.sortArray(arrayOperations.createArray());
        //arrayOperations.arrayEquals();
        
        //MultidimensionalArrays multidimensionalArrays = new MultidimensionalArrays();
        //multidimensionalArrays.soutMultidimensionalArray("ss",multidimensionalArrays.createMultidimensionalArrays());
        //ForEachLoops forEachLoops = new ForEachLoops();
        //forEachLoops.perform();
        
        
        //ArrayList
        //SampleArrayList sampleArrayList = new SampleArrayList();
        //sampleArrayList.sizeAndIndex(sampleArrayList.addAndRemoveValue());
        //sampleArrayList.getValues(sampleArrayList.addAndRemoveValueThenReturnArrayList());
        //AutoboxingAndUnboxing autoboxingAndUnboxing = new AutoboxingAndUnboxing();
        //autoboxingAndUnboxing.unboxing();
        
        
        //String
        /*StringOperations stringOperations = new StringOperations();
        stringOperations.performOperations();*/
        
        //LinkedList
        //LinkedListBasics linkedListBasics = new LinkedListBasics();
        //linkedListBasics.showValuesWithForEachLoop(linkedListBasics.createLinkedList());
        //linkedListBasics.showValuesWithListIterator(linkedListBasics.createLinkedList());
        //linkedListBasics.addValueToLinkedList(linkedListBasics.createLinkedList(),"Red");
        
        
        //Interface
       /* UserServiceImplementation userServiceFromClass = new UserServiceImplementation();
        System.out.println(userServiceFromClass.getNameById(0));
        UserService userServiceFromInterface = new UserServiceImplementation();
        System.out.println(userServiceFromInterface.getNameById(0));*/
        
        
        //Sample Interface App
        /*User user = new User(0,"Mikel",25);
        SignUpManager signUpManager = new SignUpManager(new UserComplexCheckService());
        signUpManager.signUp(user);*/
        
        
        //Abstract Class
        /*Square square = new Square("First square", 5);
        square.calculateArea();
        
        Circle circle = new Circle("First Circle", 5);
        circle.calculateArea();
        circle.calculateCircumference();
        
        Figure sampleFigure = new Circle("Circe from figure",7);
        sampleFigure.calculateArea();*/
        
        
    }
}
