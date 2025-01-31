package APSS.ArrayIndexing;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIndexing_4_Fetching_Target_Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        int target = scan.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }

        // search for targer in arr
        int indexAt = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                indexAt = i;
            }
        }

        if(found) {
            System.out.println(indexAt + 1);
        } else {
            System.out.println(-1);
        }

    }
}
