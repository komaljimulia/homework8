package homework8;

import java.util.Scanner;

public class Alphabet3 {
    public static void alphabetMethod() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any one alphabet");
        String input = obj.next().toLowerCase();//it except borh uppercase and lowercase
        if (input.length() > 1) {
            System.out.println("Invalid alphabet");
        } else if (input.charAt(0) >= 'a' && input.charAt(0) <= 'z') {
            if (input.equals("a") || input.equals("e") || input.equals("i")//for vowels
                    || input.equals("o") || input.equals("u")) {
                System.out.println("This alphabet is vowel");

            } else
                System.out.println("This alphabet is consonant");


        } else
            System.out.println("Invalid alphabet");


    }

    public static void main(String[] args) {
        alphabetMethod();
    }

}
