package homework8;

public class Homework11 {
    public static int getEvenDigitSum(int number) {
        int reminder = 0, sum = 0;//variables
        if (number >= 0) {//condition to enter more than 0 number
            while (number > 0) {
                reminder = number % 10;//to get the last digit
                if (reminder % 2 == 0) {//to check if digit is even
                    sum = sum + reminder;//add even digits
                }
                number = number / 10;//to get rest of the number
            }
            return sum;

        }
        else
            return -1;//for negative values
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println( getEvenDigitSum(252));
        System.out.println( getEvenDigitSum(-22));


    }
}