import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter dimensions of first matrix:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        
        System.out.println("Enter dimensions of second matrix:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied!");
            return;
        }
        
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        int[][] result = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println("Result of multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
