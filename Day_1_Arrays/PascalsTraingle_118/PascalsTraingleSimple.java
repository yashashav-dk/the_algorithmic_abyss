package PascalsTraingle_118;
import java.util.ArrayList;
import java.util.Scanner;

class PascalsTraingleSimple {

    public static void main(String[] args) {
        /* 
        Pascal's Traingle - 118
        Naive Approach by Generating the traingle 
        Ex: if numOfRows = 5

        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1

        a00
        a10 a11
        a21 a22 a23
        a31 a32 a33 a34
        a41 a42 a43 a44 a45

        1. Loop until the numOfRows
        2. For the 0th index append 1
        3. Inner loop -> only from 1st idx to last but 1 i.e. numOfRows - 1
            a. in the arr[i][j] append = arr[i][j-1] + arr[i-1][j-1]
        4. For the numOfRowsth index append 1

        TC: O(n^2) ; n is num of rows
        SC: O(1)

        */
        Scanner keyboard = new Scanner(System.in);
        int numOfRows = keyboard.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < numOfRows; i++) {
            ArrayList<Integer> aux_list = new ArrayList<>();
            for (Integer j = 0; j < i+1; j++) {
                aux_list.add(1);
            }
            list.add(aux_list);
            for (Integer j = 1; j < i; j++) {
                Integer sum = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                // System.out.println(list.get(i).get(j) + " " + sum);
                list.get(i).set(j, sum);
            }
        }
        for (ArrayList<Integer> arrayList : list) {
            System.out.println(arrayList);
        }
        keyboard.close();
    }

}
