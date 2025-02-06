package APSS.ArrayIndexing;

import java.util.Scanner;

public class ArrayIndexing_7_Traverse_Diagonal_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        // Prints the principal diagonal or the main diagonal
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
