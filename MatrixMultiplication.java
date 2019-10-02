import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int m = myScanner.nextInt();
        int n = myScanner.nextInt();
        int p = myScanner.nextInt();

        //defining the m*n matrix
        int[][] matrix1 = new int[m][];
        for (int i = 0; i < m; i++) {
            matrix1[i] = new int[n];
        }

        //defining the n*p matrix
        int[][] matrix2 = new int[n][]; //n*p matrix
        for (int i = 0; i < n; i++) {
            matrix2[i] = new int[p];
        }

        //getting the first matrix from the user
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = myScanner.nextInt();
            }
        }

        //getting the second matrix from the user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                matrix2[i][j] = myScanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(matrix2[i][j]);
            }
            System.out.println("");
        }

        int[][] result = matrixMul(matrix1, matrix2, m, n, p);

        //printing the result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixMul(int[][] matrix1, int[][] matrix2, int m, int n, int p) {

        //defining the output matrix
        int[][] matrix3 = new int[m][]; //m*p matrix
        for (int i = 0; i < m; i++) {
            matrix3[i] = new int[p];
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }
                matrix3[i][j] = sum;
            }
        }
        return matrix3;
    }
}