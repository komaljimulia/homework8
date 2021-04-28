package homework8;

import java.util.Scanner;

public class ReadingUserInputChallenge1 {//creating method

    public static void addNumbers() {
        Scanner obj = new Scanner(System.in);
        int a = 1;//all are variables
        //String temp;
        int total = 0;
        while (a <= 10) {//to get our result
            System.out.println("Enter number #" + a + ":");
            if (obj.hasNextInt()) {
                total = total + obj.nextInt();
                a++;
            } else {
                System.out.println("Invalid number");//for invalid number
                obj.next();
            }
        }
        System.out.println("Total=" + total);//for sum
    }
    public static void main(String[] args) {
        addNumbers();
    }//calling in main method
}