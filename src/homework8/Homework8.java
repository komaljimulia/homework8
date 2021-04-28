package homework8;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=1;i<=n;i++)//outer loop for nested
        {
            for(j=1;j<=i;j++)//inner loop for nested
                System.out.print("@");//it will only print

            System.out.println("");
        }
    }
}
