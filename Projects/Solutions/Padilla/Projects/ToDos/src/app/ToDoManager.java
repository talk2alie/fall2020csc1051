package app;

import java.time.LocalDate;

public class ToDoManager {
    public static void main(String [] args){
        //Determine today's date and save as todaysDate variable
        LocalDate todaysDate = LocalDate.now();

        //Print out welcome message that includes today's date
        System.out.println();
        System.out.println("Welcome to your To-Do Manager");
        System.out.println("-----------------------------");
        System.out.println("Today's Date: "+ todaysDate);
        System.out.println();
    }
}