package loops;

import java.util.Scanner;

public class EveryOtherLetter {
    public static void main(String[] args) {
        System.out.println();
        
        var keyboard = new Scanner(System.in);
        System.out.println("Please enter some text:");
        String text = keyboard.nextLine();
        keyboard.close();

        String everyOtherText = "";
        for(int i = 0; i < text.length(); i += 2) {
            everyOtherText += text.charAt(i);
        }

        System.out.println(everyOtherText);
        System.out.println();
    }
}
