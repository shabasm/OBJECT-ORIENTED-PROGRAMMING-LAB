import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[][] matrix1 = {
                    { 1, 2, 3 },
                    { 3, 4, 5 },
                    { 5, 6, 7 }
            };
            int[][] matrix2 = {
                    { 5, 4, 3 },
                    { 6, 7, 8 },
                    { 3, 2, 1 }
            };
            int row_size = matrix1.length;
            int column_size = matrix1[0].length;
            int[][] sum = new int[row_size][column_size];

            for (int i = 0; i < row_size; i++) {
                for (int j = 0; j < column_size; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Sum of the matrices:");
            for (int i = 0; i < row_size; i++) {
                for (int j = 0; j < column_size; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
