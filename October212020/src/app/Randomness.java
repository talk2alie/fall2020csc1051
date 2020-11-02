package app;

import java.util.Random;

/**
 * Randomness
 */
public class Randomness {
    public static void main(String[] args) {
        System.out.println();

        // 1. Instantiate a Random object
        Random random = new Random();

        // 2. Call one of the next methods
        int randomNumber = random.nextInt(22) + 1;
        System.out.println(randomNumber);


        System.out.println();
    }
}