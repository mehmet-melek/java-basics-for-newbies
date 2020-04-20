package com.java.basics.operators;

public class MathOperators {


/*
Math Operator	Description
+	Performs addition
-	Performs subtraction
*	Performs multiplication
/	Performs division
%   Remainder
*/
    
    int    intValue    = 10;
    double doubleValue = 7.8;
    
    
    public void perform() {
        
    
/*      normal
        intValue += intValue;
        intValue -= intValue;

        postfix
        intValue++;
        intValue--;
        
        prefix
        ++intValue;
        --intValue;
 */
        
        //when use postfix: first sout value then perform addition
        System.out.println(intValue++);
    
        //when use prefix: first perform addition then sout
        System.out.println(++intValue);
    
    
    
        System.out.println(intValue + 1);
        System.out.println(intValue + 1d);
    
        System.out.println(doubleValue * intValue);
        System.out.println((int) doubleValue * intValue);
    
        System.out.println(intValue / doubleValue);
        System.out.println(intValue / (int) doubleValue);
    
    
        System.out.println(intValue % (int) doubleValue);
        System.out.println(intValue % doubleValue);
        
    }
    
    
}
