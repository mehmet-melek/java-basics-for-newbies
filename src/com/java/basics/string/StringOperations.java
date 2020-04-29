package com.java.basics.string;

public class StringOperations {
    
    private String string = "Github";
    
    
    public void performOperations() {
        
        //index
        System.out.println("0. index =" + string.charAt(0));
        System.out.println("3. index =" + string.charAt(3));
        System.out.println("Last index =" + string.charAt(string.length() - 1));
        
        System.out.println(string.indexOf("h"));
        
        
        // UpperCase and LoweCase
        string.toUpperCase();
        string.toLowerCase();
        
        
        //startsWith and endsWith
        System.out.println(string.startsWith("Git"));
        System.out.println(string.endsWith("hub"));
        
        
        // Convert to Int
        String a = "112233";
        int    b = Integer.parseInt(a);
        System.out.println(b);
        
        
        // Convert to string
        int    x = 123;
        String y = String.valueOf(x);
        System.out.println(y);
        
        
        //Comparison
        String first  = new String("Hello");
        String second = new String("Hello");
        
        if (first == second) { // its return false because "first" and "second" located different location in memory
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        
        if (first.equals(second)) { // its return true because we just compared the values
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    
    
}
