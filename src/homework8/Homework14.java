package homework8;

import java.util.Scanner;

public class Homework14 {
    static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, num_rows;
        System.out.println("Type in the number of rows");
        num_rows = obj.nextInt();
        int space = num_rows - 1;
        for (i = 0; i <= num_rows; i++) {
            for (j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (i = num_rows - 1; i >= 1; i--) {
             for(j=1; j<=space;j++){
          //  for(j=num_rows - 1; j>=1;j++){
                System.out.print(" ");
            }
        space++;
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}