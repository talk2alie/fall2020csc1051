import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner keyboard = new Scanner(System.in);

		double firstNumber = keyboard.nextDouble();

		System.out.print("Enter second number:");
		double secondNumber = keyboard.nextDouble();

		double sum = firstNumber + secondNumber;

		System.out.println("The sum of your numbers is: " + sum);
	}
}