package SetMatrixZeroes_73;
import java.util.ArrayList;
import java.util.Scanner;

class SetMatrixZeroesArrayListBrute {

    public static void main(String[] args) {
        /*
         * Approach 1 - Brute Force
         * for every "0" you find
         * set the row as -1 only if the element is other than "0"
         * why is "0" being preserved? and why are we using "-1" instead of "0"
         * Ans: TO preserve other "0" by not getting polluted
         * Time Complexity: O((n*m) * (n + m)) + O(n*m)
         * Space Complexity: O(n*m)
         */
        Scanner keyboard = new Scanner(System.in);
        ArrayList <ArrayList <Integer>> matrix = new ArrayList<>();
        int rows = keyboard.nextInt();
        int cols = keyboard.nextInt();

        // Taking input
        for (int i = 0; i < rows; i++) {
            ArrayList <Integer> aux_list = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                int ele = keyboard.nextInt();
                aux_list.add(ele);
                }
            matrix.add(aux_list);
        }

        // Detecting the existence of 0 and passing it to functions to turn it into -1
        // appropriately
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix.get(i).get(j) == 0) {
                    setRows(matrix, rows, cols, i);
                    setCols(matrix, rows, cols, j);
                }
            }
        }

        // Setting the "-1" markings as "0"
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }


        // Printing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

        keyboard.close();
    }

    public static void setRows(ArrayList<ArrayList<Integer>> matrix, int rows, int cols, int keyRow) {
        for (int i = 0; i < cols; i++) {
            if (matrix.get(keyRow).get(i) != 0) {
                matrix.get(keyRow).set(i, -1);
            }
        }
    }

    public static void setCols(ArrayList<ArrayList<Integer>> matrix, int rows, int cols, int keyCol) {
        for (int i = 0; i < rows; i++) {
            if (matrix.get(i).get(keyCol) != 0) {
                matrix.get(i).set(keyCol, -1);
            }
        }
    }

  }
