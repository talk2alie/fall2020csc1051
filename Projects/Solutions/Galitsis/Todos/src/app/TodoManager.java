package src.app;

import java.time.LocalDate;
import java.time.Month;

public class TodoManager {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println("\nWelcome to Your To-Do Manager");
        System.out.println("------------------------------");
        System.out.println("Today's Date: " + year + "-" + month + "-" + day + "\n\n");

    }
}
