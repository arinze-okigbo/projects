import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        
        int[][] array = new int[n][n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        boolean isMagicSquare = checkMagicSquare(array, n);
        
        System.out.println("Magic square: " + isMagicSquare);
        
        scanner.close();
    }
    
    public static boolean checkMagicSquare(int[][] array, int n) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += array[0][j];
        }
        
        // Check rows
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += array[i][j];
            }
            if (rowSum != sum) {
                return false;
            }
        }
        
        // Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += array[i][j];
            }
            if (colSum != sum) {
                return false;
            }
        }
        
        // Check main diagonal
        int diagSum = 0;
        for (int i = 0; i < n; i++) {
            diagSum += array[i][i];
        }
        if (diagSum != sum) {
            return false;
        }
        
        // Check secondary diagonal
        diagSum = 0;
        for (int i = 0; i < n; i++) {
            diagSum += array[i][n - 1 - i];
        }
        if (diagSum != sum) {
            return false;
        }
        
        return true;
    }
}
