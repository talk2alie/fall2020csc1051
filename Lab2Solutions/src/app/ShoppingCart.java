package app;

import java.time.LocalDate;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Welcome to Mohamed's Data Collection Center.");
        System.out.println("Please enter the following questions to complete the process.");
        System.out.println("-------------------------------------------------------------");

        System.out.println();
        System.out.print("What is your full name? ");

        Scanner keyboard = new Scanner(System.in);
        String userName = keyboard.nextLine();

        System.out.print("How old are you? ");
        byte userAge = keyboard.nextByte();

        System.out.print("What is your expected graduation year? ");
        short graduationYear = keyboard.nextShort();

        keyboard.nextLine();

        System.out.print("What is your major? ");
        String userMajor = keyboard.nextLine();

        keyboard.close();

        System.out.println();
        System.out.println("===========================================================");

        System.out.println("Here is your information:");
        System.out.println();
        
        System.out.println("Name:\t\t\t" + userName);
        System.out.println("Age\t\t\t" + userAge);
        System.out.println("Graduation Year:\t" + graduationYear);
        System.out.println("Age at graduation:\t" + (userAge + (graduationYear - LocalDate.now().getYear())));
        System.out.println("Major:\t\t\t" + userMajor);

        System.out.println();

        System.out.println("Thanks for your info...");
        System.out.println();
    }
}
