package APSS.ArrayIndexing;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIndexing_1_Iterate_Array {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // dynamic input

        // ArrayList<Integer> alist = new ArrayList<Integer>();
        // while (keyboard.hasNextInt()) {
        //     alist.add(keyboard.nextInt());
        // }
        // for (Integer integer : alist) {
        //     System.out.println(integer);
        // }

        // static input

        int arrSizze = keyboard.nextInt();
        int[] arr = new int[arrSizze];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = keyboard.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
