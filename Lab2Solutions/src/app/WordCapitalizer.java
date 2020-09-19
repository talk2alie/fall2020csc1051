package app;

import java.util.Scanner;

public class WordCapitalizer {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Welcome to Mohamed's WORD CAPITALIZER");

        System.out.println();

        System.out.println("Please enter two words, separated by a space, in lowercase\nbelow, and I will capitalize the first letter of each word.");

        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        keyboard.close();

        int locationOfSpace = word.indexOf(" ");

        String firstWord = word.substring(0, locationOfSpace);
        String secondWord = word.substring(locationOfSpace + 1);

        char firstLetterOfFirstWord = firstWord.charAt(0);
        char capitalFirstLetterOfFirstWord = Character.toUpperCase(firstLetterOfFirstWord);

        char firstletterOfSecondWord = secondWord.charAt(0);
        char capitalFirstLetterOfSecondWord = Character.toUpperCase(firstletterOfSecondWord);

        firstWord = capitalFirstLetterOfFirstWord + firstWord.substring(1);
        secondWord = capitalFirstLetterOfSecondWord + secondWord.substring(1);

        word = firstWord + " " + secondWord;

        System.out.println();
        System.out.println("Your properly capitalized words are:");
        System.out.println(word);

        System.out.println();
    }
}
