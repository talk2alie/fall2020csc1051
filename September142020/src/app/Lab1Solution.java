package app;

import java.util.Scanner;

public class Lab1Solution {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Hi. Please enter three numbers separated by space on the same line");

        Scanner keyboard = new Scanner(System.in);

        String firstToken = keyboard.next();
        String secondToken = keyboard.next();
        String thirdToken = keyboard.next();

        keyboard.close();

        double firstNnumber = Double.parseDouble(firstToken);
        double secondNumber = Double.parseDouble(secondToken);
        double thirdNumber = Double.parseDouble(thirdToken);

        double sum = firstNnumber + secondNumber + thirdNumber;

        System.out.println(sum);
    }
}
