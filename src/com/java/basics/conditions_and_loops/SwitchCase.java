package com.java.basics.conditions_and_loops;

import java.util.Scanner;

public class SwitchCase {
    
    
    public void perform() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("db name = ?");
        String database = scanner.next();
        
        switch (database) {
            case "db1":
                System.out.println("db1 operations");
                break;
            
            case "db2":
                System.out.println("db2 operataions");
                break;
            
            case "All":
                System.out.println("db1 and db2 opertaions"); // İf we dont use "break" all methods will run until "break"
            
            default:
                System.out.println("other operations");
                break;
        }
        
    }
}
