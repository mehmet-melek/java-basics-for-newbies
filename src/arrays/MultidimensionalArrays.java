package arrays;

public class MultidimensionalArrays {
    
    
    public int[][] createMultidimensionalArrays() {
        
        int[][] first_array = new int[2][2];
        first_array[0][0] = 1;
        first_array[0][1] = 2;
        first_array[1][0] = 3;
        first_array[1][1] = 4;
        
        int[][] second_array = {{1, 2, 3}, {4, 5, 6}};
        
        return second_array;
    }
    
    public void soutMultidimensionalArray(String comment, int[][] array) {
        
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {
                
                System.out.print(array[i][j]);
            }
            
            System.out.println("");
        }
    }
    
    
}
