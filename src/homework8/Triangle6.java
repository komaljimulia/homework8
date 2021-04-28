package homework8;

import java.util.Scanner;

public class Triangle6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numbers;//variable for entering numbers
        System.out.println("Enter the number in rows");//message for user
        numbers = obj.nextInt();//allow program to enter value

        for (int i = 1; i <= numbers; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);//if we give println then it will give value in rows like 1,2,3,4,5

            }
            System.out.println("");
        }
    }
}