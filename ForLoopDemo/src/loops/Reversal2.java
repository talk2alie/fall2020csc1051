package loops;

import java.util.Scanner;

public class Reversal2 {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.println("Please enter some text:");
        String text = keyboard.nextLine();
        keyboard.close();

        String reversedText = "";
        for(int i = text.length() - 1; i >= 0; --i) {
            reversedText += text.charAt(i);
        }

        System.out.println(reversedText);
        System.out.println();
    }
}
