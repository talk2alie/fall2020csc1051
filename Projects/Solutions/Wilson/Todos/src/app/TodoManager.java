package app;

import java.time.LocalDate;

public class TodoManager {
    public static void main(String[] args) {

        LocalDate todaysDate = LocalDate.now();

        System.out.println();
        System.out.println("Welcome to Your To-Do Manager");
        System.out.println("-----------------------------");
        System.out.println("Today's Date: " + todaysDate);
        System.out.println();

    }
}
