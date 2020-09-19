package app;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        double firstNumber = keyboard.nextDouble();

        System.out.print("Please enter second number: ");
        double secondNumber = keyboard.nextDouble();

        System.out.println("The sum is " + (firstNumber + secondNumber));
    }
}
