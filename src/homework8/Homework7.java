package homework8;

public class Homework7 {
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1; //checking boundary conditions

        }
        else if(number==0){
            return 0;
        }
        else{
            int lastDigit=number%10; // to extract last significant digit
            while(number>=10){
                number=number/10;
            }
            int firstDigit=number;
            return (lastDigit+firstDigit);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }



}



