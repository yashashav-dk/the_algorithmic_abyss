
import java.util.ArrayList;
import java.util.Arrays;

public class code {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printMatrix(int top, int bottom, int left, int right, int[][] matrix) {
        // print 
        
    }

    public static void main(String[] args) {
        // Getting back into DSA
        // Part 1: Array Indexing
        // Q1: Iterate over an array

        // int[] myArr;
        // myArr = new int[] {1, 2, 3, 4, 5, 6};

        
        // for(int i = 0; i < myArr.length; i++) {
        //     System.out.println(myArr[i]);
        // }

        // Q2: Iterate over an array in reverse

        // int[] myArr;
        // myArr = new int[] {1, 2, 3, 4, 5, 6};

        // for(int i = myArr.length - 1; i > -1; i--) {
        //     System.out.println(myArr[i]);
        // }

        // Q3: Fetch Every Second Element

        // int[] myArr = {1, 2, 3, 4, 5, 6};
        
        // for(int i = 1; i < myArr.length; i = i + 2) {
        //     System.out.println(myArr[i]);
        // }

        // Q4: Find the index of the target element

        // int[] myArr;
        // int target;
        // myArr = new int[] {1, 2, 3, 4, 5, 6, 7};
        // target = 4;

        // for (int i = 0; i < myArr.length; i++) {
        //     if (target == myArr[i]) {
        //         System.out.println("Target found at index: " + i);
        //         break
        //     }
        // }

        // Q5. Find the first prime number in the array
        // check isPrime implementation
        // System.out.println(isPrime(10));


        // Q6. Traverse a 2D Array

        // int[][] myArr = {
        //     {1, 2, 3},
        //     {2, 3, 4},
        //     {3, 4, 5}
        // };
        // int rows = myArr.length;
        // int cols = myArr[0].length;

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(myArr[i][j]);
        //     }
        //     System.out.println();
        // }

        // Q7. Traverse the main diagonal / principle of a matrix
        // int[][] myArr;
        // myArr = new int[][] {
        //     {1, 2, 3},
        //     {2, 3, 4},
        //     {3, 4, 5}
        // };

        // int rows = myArr.length;
        // int cols = myArr[0].length;

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (i == j) {
        //             System.out.println(myArr[i][j]);
        //         }
        //     }
        // }


        // Q8. Traverse the perimeter of the matrix
        // int[][] matrix;
        // matrix = new int[][] {
        //     {1, 2, 3, 4},
        //     {2, 3, 4, 5},
        //     {3, 4, 5, 6},
        //     {4, 5, 6, 7},
        //     {5, 6, 7, 8},
        //     {1, 2, 3, 4},
        //     {2, 3, 4, 5},
        //     {3, 4, 5, 6},
        //     {4, 5, 6, 7},
        //     {5, 6, 7, 8}
        // };

        // int rows = matrix.length;
        // int cols = matrix[0].length;

        // // print top row
        // for (int i = 0; i < cols; i++) {
        //     System.out.print(matrix[0][i] + " ");
        // }
        // System.out.println();

        // // print first element and the last element from 0+1th row to n - 1th row
        // for (int i = 1; i < rows - 1; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (j == 0) {
        //             System.out.print(matrix[i][j] + "   ");
        //         }
        //         if (j == cols - 1) {
        //             System.out.print("  " + matrix[i][j]);
        //         }
        //     }
        //     System.out.println();
        // }

        // // print last row
        // for (int i = 0; i < cols; i++) {
        //     System.out.print(matrix[rows-1][i] + " ");
        // }
        // System.out.println();

       
        

        // Q9. Traverse in sprial order from top left to inner element
        int[][] matrix;
        matrix = new int[][] {
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 5, 6},
            {4, 5, 6, 7}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        printMatrix(top, bottom, left, right, matrix);

        
        

        // Q10. Traverse the lower triangle of the matrix
        // Print the elements below and including the main diagonal of a square matrix.

        // int[][] matrix;
        // matrix = new int[][] {
        //     {1, 2, 3, 4},
        //     {2, 3, 4, 5},
        //     {3, 4, 5, 6},
        //     {4, 5, 6, 7}
        // };

        // if (matrix.length == 0) return; // Check for empty matrix
        // int rows = matrix.length;
        // int cols = matrix[0].length;

        // for(int i = 0; i < rows; i++) {
        //     System.out.print(matrix[0][i] + " ");
        // }
        // System.out.println();

        // for (int i = 1; i < rows - 1; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (j == 0) {
        //             System.out.print(matrix[i][j]);
        //         } else if (j == cols - 1) {
        //             System.out.print(matrix[i][j]);
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < cols; i++) {
        //     System.out.print(matrix[rows - 1][i] + " ");
        // }

    }

}
