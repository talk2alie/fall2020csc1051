package loops;

import java.util.Scanner;

/**
 * WhileLoopDemo
 */
public class WhileLoopDemo {

    public static void main(String[] args) {
        System.out.println();

        int currentNumber = 101;
        while(currentNumber <= 100) {
            System.out.print(currentNumber + " ");
            if(currentNumber % 10 == 0) {
                System.out.println();
            }
            currentNumber++;
        }

        System.out.println("Loop Ended");

        System.out.println();
    }
}