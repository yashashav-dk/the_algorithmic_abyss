package APSS.ArrayIndexing;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIndexing_2_Iterate_Array_Reverse {
    public static void main(String[] args) {
        // static input 
        Scanner scan = new Scanner(System.in);
        // int arrSize = scan.nextInt();
        // int[] arr = new int[arrSize];

        // for (int i = 0; i < arrSize; i++) {
        //     arr[i] = scan.nextInt();
        // }
        // // printing it in the reverse order
        // for (int i = arrSize - 1; i > -1; i--) {
        //     System.out.print(arr[i] + " ");
        // }


        // dynamic input
        ArrayList<Integer> al = new ArrayList<>();
        while(scan.hasNextInt()) {
            al.add(scan.nextInt());
        }

        for (int i = al.size() - 1; i > -1; i--) {
            System.out.print(al.get(i) + " ");
        }
    }
}
