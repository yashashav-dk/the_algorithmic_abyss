package APSS.ArrayIndexing;

import java.util.Scanner;

public class ArrayIndexing_6_Traverse_2D_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // traversing a 2D matrix
        // let's say we have a 2D matrix of size 3x4
        // 1  2  3  4
        // 5  6  7  8
        // 9 10 11 12
        // rows are -> 3
        // cols are -> 4

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // row major traversal
        // for(int i = 0; i < rows; i++) {
        //     for(int j = 0; j < cols; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // column major traversal
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        
    }
}
