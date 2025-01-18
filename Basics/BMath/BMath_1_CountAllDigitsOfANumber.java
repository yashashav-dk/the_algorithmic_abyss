package Basics.BMath;

import java.util.Scanner;

public class BMath_1_CountAllDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + count);
        scanner.close();
    }

    private static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}