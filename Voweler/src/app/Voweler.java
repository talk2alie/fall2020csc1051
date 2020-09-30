package src.app;

import java.util.Scanner;

public class Voweler {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, what is your name?");
        Scanner keyboard = new Scanner(System.in);
        String userName = keyboard.nextLine();
        userName = userName.toUpperCase();
        keyboard.close();
        char userNameFirstLetter = userName.charAt(0);

        boolean isVowel = userNameFirstLetter == 'A' || userNameFirstLetter == 'E' || userNameFirstLetter == 'I'
                || userNameFirstLetter == 'O' || userNameFirstLetter == 'U'; // || userNameFirstLetter == 'a' ||
                                                                             // userNameFirstLetter == 'e' ||
                                                                             // userNameFirstLetter
                                                                             // =='i'||userNameFirstLetter =='o'||
                                                                             // userNameFirstLetter == 'u';
        if (isVowel) {
            System.out.println("Your name begins with a vowel.");
            if(userName.length() > 5) {
                System.out.println("Wow, your name is long"); 
            } else {
                System.out.println("your name is not long");
            }
        } else {
            System.out.println("Your name does not begin with a vowel");
            System.out.println("Please try another name.");
        } 

        

        // Syntax
        /*
         * if (<BooleanExpression>) { Statements you want executed when the
         * BooleanExpression evaluates to true }
         * 
         * if (<BooleanExpression) { Statements you want executed when the
         * BooleeanExpression evaluates to true } else { Statements you want executed
         * when the BooleanExpression evaluates to false }
         * 
         * Conditional Operator
         * 
         * 
         */

        System.out.println();
        
    }
}
