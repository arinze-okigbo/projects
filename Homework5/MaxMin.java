import java.util.Scanner;

public class MaxMin {
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
        
        int max = array[0][0];
        int min = array[0][0];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        
        scanner.close();
    }
}
