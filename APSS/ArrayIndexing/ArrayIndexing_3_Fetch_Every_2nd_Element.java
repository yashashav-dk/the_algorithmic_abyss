package APSS.ArrayIndexing;

public class ArrayIndexing_3_Fetch_Every_2nd_Element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5 ,6, 7, 8, 9};
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
