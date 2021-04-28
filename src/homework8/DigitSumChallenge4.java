package homework8;

import java.util.Scanner;

public class DigitSumChallenge4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number (>=10):");
        int num = obj.nextInt();
        System.out.println("sum of digits is:"+sumDigits(num));
    }
    public static int sumDigits(int number) {
        if (number >= 10) {//condition to enter more than 10 number
            int reminder = 0;
            int sum = 0;
            //456
            while (number > 0) {
                reminder = number % 10;//6
                sum = sum + reminder;//0+6
                number = number / 10;//45
            }
            return sum;

        }
        else
            return -1;
    }
}