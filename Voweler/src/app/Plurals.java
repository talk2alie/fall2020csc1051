package src.app;

import java.util.Scanner;

public class Plurals {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many pets do you have? ");
        int petsCount = keyboard.nextInt();
        keyboard.close();

        // String petsPluralization = petsCount < 0 ? "invalid pets" : petsCount != 1 ? "pets" : "pet";
        String petsPluralization = "";
        if (petsCount < 0) {
            petsPluralization = "invalid pets";
        } else if (petsCount != 1) {
            petsPluralization = "pets";
        } else {
            petsPluralization = "pet";
        }

        /**
         * Consitional Operator
         * 
         * <data type> <variable name> = <BooleanExpression> ? <value when BooleanExpression is true> : <value when BooleanExpression is false>;
         */

        System.out.println("Thank you. We welcome our users with " + petsCount + " " + petsPluralization);


        System.out.println();
    }
}
