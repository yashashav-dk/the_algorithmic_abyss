import java.util.Scanner;

class code {

    public static void main(String[] args) {
        /*
         * Approach 3 - Optimal
         * 1.
         * Time Complexity -
         * Space Complexity -
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

        // Step 1 - 
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
