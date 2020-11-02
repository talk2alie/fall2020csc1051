package app;

import java.util.Random;
import java.util.Scanner;

public class Lab7Solution {
    public static void main(String[] args) {
        System.out.println();

        int theBound = getBound();
        printTenRandomNumbersUpTo(theBound);

        System.out.println();
    }

    private static int getBound() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a bound for the random number generator: ");
        int theBound = keyboard.nextInt();
        keyboard.close();
        return theBound;
    }

    private static void printTenRandomNumbersUpTo(int theBound) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(theBound);
            System.out.printf("Random number %d is: %d %n", i + 1, randomNumber);
        }
    }
}
