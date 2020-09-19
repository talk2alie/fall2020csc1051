package app;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // 1. Print out a padding
        System.out.println();
        // 2. Print out a message that welcomes the user to your app
        System.out.println("Hello!  Welcome to my Calculator App.");
        // 3. Print out a message that describes your app
              // This is a calculator that knows how to add any two numbers
        System.out.println("This is a calculator that knows how to add any two numbers");
        // 4. Ask the user for her first number
        System.out.print("Please enter your first number: ");
        // 5. Store the user's first number in a variable
        Scanner keyboard = new Scanner(System.in);
        double firstNumber = keyboard.nextDouble();
        // 6. Ask the user for her second number
        System.out.println();
        System.out.print("Please enter your seconnd number: ");
        // 7. Store the user's second number in a variable
        double secondNumber = keyboard.nextDouble();
        keyboard.close();
        // 8. Create a new variable and assign it the sum of the user's numbers
        double sum = firstNumber + secondNumber;
        // 9. Print a message that says to the user: "I have added your numbers. The sum of <firstNumber> and <secondNumber> is <sum>."
        System.out.println("I have added your numbers. The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
        // 10 Print out a padding
        System.out.println();

        // 10001 10011 1010 \n
    }
}