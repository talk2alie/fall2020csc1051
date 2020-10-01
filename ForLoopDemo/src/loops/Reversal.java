package loops;

import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.println("Please enter some text:");
        String text = keyboard.nextLine();
        keyboard.close();

        for(int i = text.length() - 1; i >= 0; --i) {
            System.out.print(text.charAt(i));
        }

        System.out.println();
        System.out.println();
    }
}
