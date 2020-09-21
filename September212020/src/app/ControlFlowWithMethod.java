package app;

import java.util.Scanner;

public class ControlFlowWithMethod {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Please enter three numbers to get sum...");
        System.out.println();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter 1st number: ");
        double firstNumber = keyboard.nextDouble();

        System.out.print("Please enter 2nd number: ");
        double secondNumber = keyboard.nextDouble();

        System.out.print("Please enter 3rd number: ");
        double thirdNumber = keyboard.nextDouble();

        keyboard.close();

        double sum = getSum(firstNumber, secondNumber, thirdNumber);

        System.out.println("The sum of your numbers is " + sum);
    }

    private static double getSum(double firstNumber, double secondNumber, double thirdNumber) {
        double sum = firstNumber + secondNumber + thirdNumber;
        return sum;
    }
}
