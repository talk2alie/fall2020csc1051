package src.app;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Hello, what is your name?");
        Scanner keyboard = new Scanner(System.in);
        String userName = keyboard.nextLine();
        userName = userName.toUpperCase();
        keyboard.close();
        char userNameFirstLetter = userName.charAt(0);

        String message = "Your name begins with a vowel";
        switch (userNameFirstLetter) {
            case 'A':
                System.out.println(message);
                System.out.println("You name began with A");
                break;
            case 'E':
                System.out.println(message);
                System.out.println("You name began with E");
                break;
            case 'I':
                System.out.println(message);
                System.out.println("You name began with I");
                break;
            case 'O':
                System.out.println(message);
                System.out.println("You name began with O");
                break;
            case 'U':
                System.out.println(message);
                System.out.println("You name began with U");
                break;
            default:
                System.out.println("Your name does not begin with a vowel");
        }

        /**
         * Switch Statement Syntax
         * 
         * <Expression> must be String, char, byte, int, short, long
         * switch (<Expression>) {
         *      case <TestExpression1> :
         *             Statements when TestExpression1 matches Expression
         *             break;
         *      case <TestExpression2> :
         *              Statements when TestExpression2 matches Expression
         *              break;
         *      default :
         *          Statements when no TextExpression matches Expression         * 
         * }
         */

        System.out.println();
    }
}
