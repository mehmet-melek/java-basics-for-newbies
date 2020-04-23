package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    int[] array;
    
    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length");
        int arrayLength = scanner.nextInt();
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please enter " + (i+1) + ". value");
            array[i] = scanner.nextInt();
        }
        
        soutArrayValues("Values of the created array ", array);
        return array;
    }
    
    public void soutArrayValues(String comment, int[] array) {
        System.out.println(comment);
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println(array[i]);
        }
    }
    
    
    public void sortArray(int[] array) {
        
        java.util.Arrays.sort(array);
        System.out.println("");
        soutArrayValues("Ordering..", array);
    }
    
    
    public void arrayEquals() {
        
        int[] first_array  = {1, 2, 3, 4, 5};
        int[] second_array = {1, 2, 3, 4, 5};
        
        if (first_array == second_array) {
            System.out.println("In this is statement its return false because, arrays shows different locations in RAM");
        }
        else if (Arrays.equals(first_array, second_array)) {
            System.out.println("In this statement its compare only their value so return true");
        }
    }
    
    
}

