package app;

import java.util.Scanner;

/**
 * Conditionals
 */
public class Conditionals {
    public static void main(String[] args) {
        // 1. if statement
        // if-else
        // if-else-if
        // 2. switch
        // 3. Conditional operator
        int number = 99;

        // If number is even, I want to print "Your number is even"
        // Otherwise, I want to print, "Your number is not even"

        // 15 % 2 = 1
        // 10 / 2 = 5

        boolean isEven = number % 2 == 0;
        if (isEven) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is not even.");
        }

        // switch(expression) {
        // case 1:
        // Statements
        // break;
        // case 2:
        // Statements
        // break;
        // default:
        // Statements
        // }
        System.out.println("Please enter a charater");
        Scanner keyboard = new Scanner(System.in);

        char firstLetter = keyboard.nextLine().charAt(0);
        keyboard.close();

        switch (firstLetter) {
            case 'A':
                System.out.println("Vowel A");
                break;
            case 'E':
            case 'e':
                System.out.println("Vowel E");
                break;
            case 'I':
            case 'i':
                System.out.println("Vowel I");
                break;
            case 'O':
            case 'o':
                System.out.println("Vowel O");
                break;
            case 'U':
            case 'u':
                System.out.println("Vowel U");
                break;
            default:
                System.out.println("Not a vowel");
        }

        // if firstLetter is upper case, assign "Upper case letter" to variable otherwise, assign "Or not"

        // 65                                   90
        // |------------------------------------|
        // String upperCaseLetterOrNot = firstLetter >= 65 && firstLetter <= 90 ? "Uppercase letter" : "Is not";
        // System.out.println(upperCaseLetterOrNot);

        char upperA = 'a';
        System.out.println("Character: " + upperA);
        System.out.println("ASCII Number: " + (int)upperA);
    }
}