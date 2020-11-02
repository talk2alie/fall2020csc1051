package app;

import java.util.Random;
import java.util.Scanner;

/**
 * Quiz2
 */
public class Quiz2 {
    public static void main(String[] args) {
        System.out.println();

        int[] numbers = { 22, 15, 10, 45, 10, 88, 7, 10 };
        int sum = sum(numbers);
        System.out.printf("The sum of the numbers in the array is: %d%n", sum);

        System.out.println();

        String[] highPerformingPlayers = { "Tobin Heath", "Crystal Dunn", "Mallory Pugh", "Mason Greenwood",
                "Anthony Martial" };
        String playerOfTheMonth = randomlyPickPlayerOfTheMonth(highPerformingPlayers);
        System.out.printf("The player of the month is: %s%n", playerOfTheMonth);

        System.out.println();
    }

    /**
     * Question 1: Write the body of this method. ==========> The method should sum
     * up all the numbers in the given array ==========> The method should return
     * the calculated sum HINT: You need a loop
     *
     * @param numbers - The numbers to sum up
     * @return The sum of all the numbers in the array
     */
    private static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    /**
     * Question 2: Write the body of this method. ==========> The method should
     * randomly select one element from the array and return it HINT: You need to
     * use the Random class
     *
     * @param highPerformingPlayers - The players from which to pick a player at
     *                              random
     * @return The name of the randomly selected player
     */
    private static String randomlyPickPlayerOfTheMonth(String[] highPerformingPlayers) {
        Random random = new Random();
        int index = random.nextInt(highPerformingPlayers.length);
        return highPerformingPlayers[index];
    }
}