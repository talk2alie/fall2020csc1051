package loops;

import java.util.Scanner;

/**
 * ValidatingDataUserInputWithLoops
 */
public class ValidatingDataUserInputWithLoops {

    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter an even number: ");
        int number = keyboard.nextInt();

        while(number % 2 != 0) {
            System.out.print("Please enter an even number: ");
            number = keyboard.nextInt();
        }

        keyboard.close();

        System.out.println("You finally entered the even number, " + number + ".");

        System.out.println();
    }
}