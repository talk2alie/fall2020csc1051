package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * This program deteermines if a given user and I have 
 * the same Zodiac sign. I am an Aries (FYI: I do not 
 * subscribe to the Zodiac belief system. This is 
 * just for demonstrative purpose)
 */
public class AriesOrNot {
    public static void main(String[] args) {
        System.out.println();
        
        String datePattern = "MM/dd/yyyy";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(datePattern);

        String ariesStartDateString = "03/21/1900";
        String ariesEndDateString = "04/20/2020";
        LocalDate ariesStartDate = LocalDate.parse(ariesStartDateString, dateFormatter);
        LocalDate ariesEndDate = LocalDate.parse(ariesEndDateString, dateFormatter);

        System.out.println("Hello, welcome to my Ariesanalyzer! I want to see if we have thee same Zodiac sign");
        System.out.println("----------------------------------------------------------------------------------");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = keyboard.nextLine();

        System.out.print("Please enter your birth date in the format, " + datePattern + ": ");
        String userBirthDateString = keyboard.nextLine();

        System.out.println();
        
        LocalDate userBirthDate = LocalDate.parse(userBirthDateString, dateFormatter);
        if(userBirthDate.isAfter(ariesStartDate) && userBirthDate.isBefore(ariesEndDate)) {
            System.out.println("Hi, " + name + ". You are definitely an Aries");
        }
        
        keyboard.close();

        System.out.println();
    }    
}