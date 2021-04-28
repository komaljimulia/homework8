package homework8;

import java.lang.Math;

public class PalinNumber5 {
    public static boolean isPalindrome(int number) {
        int lastDigit;
        int temp;
        int reverse = 0;
        boolean result;
        int absNumber  = Math.abs(number); //Converting number to positive (Absolute)
        temp = absNumber;
        result = true;
        while (temp > 0) {
            lastDigit = temp % 10;  //getting remainder
            reverse = (reverse * 10) + lastDigit;
            temp = temp / 10;
        }
        if (absNumber == reverse) {
            result = true;
        } else
            result = false;

        return result;

    }


    public static void main(String[] args) {
        boolean res = isPalindrome(987);
        if (res == true)
            System.out.println("The number is Palindrome");
        else
            System.out.println("The number is not Palindrome");

    }
}



