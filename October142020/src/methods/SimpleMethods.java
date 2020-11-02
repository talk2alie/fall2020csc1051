package methods;

import java.util.Scanner;

/**
 * SimpleMethods
 */
public class SimpleMethods {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = keyboard.nextLine();

        System.out.print("Please enter your birth date: ");
        String userBirthDate = keyboard.nextLine();

        System.out.print("Please enter your major: ");
        String userMajor = keyboard.nextLine();

        System.out.print("Please enter your minor: ");
        String userMinor = keyboard.nextLine();

        keyboard.close();

        System.out.println("-----------------------------------------");
        System.out.println("Name:\t\t\t" + userName);
        System.out.println("Birth Date:\t\t" + userBirthDate);
        System.out.println("Major:\t\t\t" + userMajor);
        System.out.println("Minor:\t\t\t" + userMinor);
        System.out.println("-----------------------------------------");
        
        System.out.println();
    }  
}