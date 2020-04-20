package com.java.basics.operators;

public class ComparisonOperators {

/*
==      equal to
!=      not equal to
>       greater than
>=      greater than or equal to
<       less than
<=      less than or equal to
*/

/*
&&     and operator
||     or operator
!      not operator
*/
    
    int     intValue     = 10;
    double  doubleValue  = 10.5;
    boolean booleanValue = true;
    String  stringValue  = "course";
    
    
    public void perform() {
        
        System.out.println(intValue == 10);
        System.out.println(intValue == (int) doubleValue);
        
        System.out.println(doubleValue > intValue);
        System.out.println((int) doubleValue > intValue && !booleanValue);
        System.out.println((int) doubleValue >= intValue);
        
        System.out.println(!booleanValue || booleanValue);  // for boolean values we can use not operator(!) like (!value)
        
        System.out.println(stringValue != "notequel ");
        
    }
    
}
