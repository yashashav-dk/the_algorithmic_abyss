package SetMatrixZeroes_73;
import java.util.Scanner;

class SetMatrixZeroesSubOptimal {

    public static void main(String[] args) {
        /*
         * Approach 2 - Optimised using two arrays of size rows and cols respectively
         * 1. Initialise two arrays with size rows and cols respectively
         * 2. For every "0" you find mark the respective row_arr and col_arr with "0"
         * 3. Print the result with reference of the array by looking at both row_arr, col_arr
         * Time Complexity - O(m*n) + O(m*n) // once for reading and another for marking
         * Space Complexity - O(m+n) // since we use both the arrays
         */
        Scanner keyboard = new Scanner(System.in);
        int rows = keyboard.nextInt();
        int cols = keyboard.nextInt();
        int[][] matrix = new int[rows][cols];
        int[] row_arr = new int[rows];
        int[] col_arr = new int[cols];

        // Taking input
        for (int i = 0; i < rows; i++) {
            int[] aux_list = new int[cols];
            for (int j = 0; j < cols; j++) {
                int ele = keyboard.nextInt();
                aux_list[j] = ele;
                }
            matrix[i] = aux_list;
        }

        // Detecting the existence of 0 and setting the respective row_arr and col_arr
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row_arr[i] = 1;
                    col_arr[j] = 1;
                }
            }
        }
        // for (int i = 0; i < row_arr.length; i++) {
        //     System.out.print(row_arr[i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i < col_arr.length; i++) {
        //     System.out.print(col_arr[i] + " ");
        // }

        // System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row_arr[i] == 1 || col_arr[j] == 1) {
                    System.out.print(0 + " ");
                }
                else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

        // Printing the matrix
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        keyboard.close();
    }

    public static void setRows(int[][] matrix, int rows, int cols, int keyRow) {
        for (int i = 0; i < cols; i++) {
            if (matrix[keyRow][i] != 0) {
                matrix[keyRow][i] = -1;
            }
        }
    }

    public static void setCols(int[][] matrix, int rows, int cols, int keyCol) {
        for (int i = 0; i < rows; i++) {
            if (matrix[i][keyCol] != 0) {
                matrix[i][keyCol] = -1;
            }
        }
    }

  }
