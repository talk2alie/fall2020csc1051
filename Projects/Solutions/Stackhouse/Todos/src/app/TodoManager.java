package app;

import java.time.LocalDate;

public class TodoManager {
    public static void main(String[] args) {
        System.out.println("Welcome to Your To-Do Manager");
        System.out.println("-----------------------------");
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
        System.out.println();
    }
}