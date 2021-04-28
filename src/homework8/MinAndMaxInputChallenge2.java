package homework8;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxInputChallenge2 {
    public static void getMinMaxNumbers() {//create method
        Scanner obj = new Scanner(System.in);//create object for scanner
        int i = 0;//all are variables
        int userInput;
        int maxNumber = 0;
        int minNumber = 0;

        while (true) {//condition
            System.out.println("Enter Number:");
            if (obj.hasNextInt()) {
                userInput = obj.nextInt();
                if (i == 0) {//this part is totally copy and paste.i dont understand anything
                    minNumber = userInput;
                    maxNumber = userInput;
                } else {
                    if (userInput < minNumber) {
                        minNumber = userInput;
                    }
                    if (userInput > maxNumber) {
                        maxNumber = userInput;
                    }
                }
                i++;
            } else {
                System.out.println("Invalid Number.");//message for invalid number
                obj.next();
                break;//we used break bcoz we want to stop when user enter the invalid number
            }
        }
        System.out.println("Minimum Number is:" + minNumber);//print the minimum number
        System.out.println("Maximum Number is:" + maxNumber);//print the maxnumber
    }

    public static void main(String[] args) {//in main method we are calling our static method
        getMinMaxNumbers();

    }


}
