package APSS.ArrayIndexing;

import java.util.Scanner;



public class ArrayIndexing_5_Finding_Prime {
    public static Boolean solution(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for(int i = 3; i < n - 1; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        /*
         * 
         * Find the First Prime Number in an Array
        Iterate over an array and find the first prime number. Stop the iteration once you find it.
         */

         // Simple Approach 
         /*
          Q. Understand what is a prime number?
          Prime number is a number who has only two factors i.e. 1 and the number it self
          Example -> 13
          13 has only 1 and the number it self as it's divisor
        
          Consider now - that 1 can't be prime
          2 can be prime and also happens to be even
          3 is also prime
          4 isn't because it's an even number (3 factors - 1, 2 and 4)
          So we can observe that a prime number is a number i.e. 
          1. It is not 1
          2. It is not even (other than 2)
          3. It doesn't not have any divisors other than 1 and it self
          */

          Scanner scan = new Scanner(System.in);
          int arrSize = scan.nextInt();

          int[] arr = new int[arrSize];

          for (int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
          }

          // algo
          /*
           * 1. check if it is 1 - return false
           * 2. check if it is 2 - return true
           * 3. check if it is even (n % 2 == 0) - return false
           * 4. Run a loop from 3 as i until n - 1 and check if n % i == 0 - return false
           * 5. If the code can still be reached then return true
           */
        
        boolean found = false;
        int indexAt = -1;

        for (int i = 0; i < arrSize; i++) {
            found = solution(arr[i]);
            if (found) {
                
                indexAt = i;
                break;
            }
        }

        if (found) {
            System.out.println("Prime number found at index: " + indexAt);
        } else {
            System.out.println("No prime number found in the array");
        }

        scan.close();


        
    }
}
