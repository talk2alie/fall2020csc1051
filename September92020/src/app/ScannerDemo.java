package app;

import java.util.*;

public class ScannerDemo {
    public static void main(String[] args) {
        // 1. Greet the user
        // 2. Ask the user for their name
        // 3. Store the user's name in a variable
        // 4. Output text that tells the user how many characters are in 
        //    their name
        System.out.println();
        // Step 1.
        System.out.println("Hi there! Welcome!");
        System.out.println("------------------");
        
        System.out.println();
        
        // Step 2.
        System.out.print("I am Sid. What is your name? ");
        
        // Step 3.
        Scanner keyboard = new Scanner(System.in);
        String userName = keyboard.nextLine();

        // Step 4.
        int userNameLength = userName.length();
        System.out.println("Hi, " + userName + ". You have " + userNameLength + " characters in your name");

        System.out.println();

        keyboard.close();
    }
}
