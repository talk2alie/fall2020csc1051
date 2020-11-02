package app;

import java.time.LocalDate;

public class TodoManager{
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Welcome to your To-Do Manager");
        System.out.println("-----------------------------");
        LocalDate todaysDate = LocalDate.now();
        System.out.println("Today's Date:" + " " + todaysDate);

        System.out.println();
    }
}