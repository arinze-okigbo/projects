import java.util.Scanner;
import java.util.Arrays;

public class Flatten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] array = new int[rows][cols];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        int[] flattenedArray = new int[rows * cols];
        int index = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flattenedArray[index++] = array[i][j];
            }
        }
        
        System.out.println("Flattened array:");
        System.out.println(Arrays.toString(flattenedArray));
        
        scanner.close();
    }
}
