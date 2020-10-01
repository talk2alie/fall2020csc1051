package loops;

import java.util.Scanner;

public class EvensInRange {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter starting number: ");
        int startingNumber = keyboard.nextInt();

        System.out.print("Please enter ending number: ");
        int endingNumber = keyboard.nextInt();
        keyboard.close();

        for (; startingNumber <= endingNumber; startingNumber++) {
            if(startingNumber % 2 == 0) {
                System.out.print(startingNumber + " ");
            }
        }

        System.out.println();
        System.out.println();
    }
}
