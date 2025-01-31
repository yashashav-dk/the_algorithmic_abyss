package APSS.ArrayIndexing;

import java.util.Scanner;

public class ArrayIndexing_3_Fetch_Every_2nd_Element {
    public static void main(String[] args) {
        // stick to static array from now
        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];

        for(int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }

        // fetching every 2nd element
        for(int i = 0; i < arrSize; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
