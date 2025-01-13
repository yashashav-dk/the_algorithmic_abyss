package SetMatrixZeroes_73;

import java.util.Scanner;

public class SetMatrixZeroesOptimal {
    public static void main(String[] args) {
        /*
         * Approach 3 - Optimising SC further by using constant space
         * 1. Just like the previous approach of using two separate arrays,
         * - use the topmost row and the leftmost column to store the presence of "0"s
         * and use "col0" variable to store the overlap in arr[0][0]
         * 2. Firstly traverse the entire matrix; if you find 0 at arr[i][j] then mark
         * the
         * - respective topmost column and leftmost row as 0; note if j == 0 then update
         * the col0 variable
         * 3. Now traverse from a[1][1] and use the topmost and leftmost row and col as
         * reference to set "0"s
         * 4. Note that if you traverse from a[0][0] you will lose the array that the
         * rest of the matrix depends on.
         * Time Complexity - O(m * n) + O(m * n) // once for reading another for marking
         * Space Complexity - o(1) // since we are only using one variable
         */
        Scanner keyboard = new Scanner(System.in);
        int rows = keyboard.nextInt();
        int cols = keyboard.nextInt();
        int[][] matrix = new int[rows][cols];

        // Taking input
        for (int i = 0; i < rows; i++) {
            int[] aux_list = new int[cols];
            for (int j = 0; j < cols; j++) {
                int ele = keyboard.nextInt();
                aux_list[j] = ele;
            }
            matrix[i] = aux_list;
        }

        // Step 1 - traverse and mark respective 0s considering the col0 variable
        int col0 = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // update topmost column and col0 accordingly
                    if (j == 0) {
                        col0 = 0;
                    } else {
                        matrix[i][0] = 0;
                    }

                    // update leftmost row only on the basis that it isn't the leftmost column
                    if (j != 0) {
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        System.out.println(col0);

        // Step 2 - traverse from a[1][1] and use the leftmost and topmost arr for
        // reference and don't forget col0
        // for (int i = 1; i < rows; i++) {
        // for (int j = 1; j < cols; j++) {
        // if (matrix[0][j] == 0 || matrix[i][0] == 0) {
        // matrix[i][j] = 0;
        // }
        // }
        // }

        // Step 3 - check for col0 and row[0]
        // start with row[0] since we are storing col0 already
        // for (int i = 1; i < cols; i++) {
        // if (matrix[0][0] == 0) {
        // matrix[0][i] = 0;
        // }
        // }
        // for (int i = 0; i < rows; i++) {
        // if (col0 == 0) {
        // matrix[i][0] = 0;
        // }
        // }

        // Printing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        keyboard.close();
    }

}
