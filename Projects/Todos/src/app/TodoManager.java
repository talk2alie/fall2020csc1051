package app;

import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 * An application for managing Todo Items
 */
public class TodoManager {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();

        System.out.println("Welcome to Your To-Do Manager");
        System.out.println("-----------------------------");
        System.out.println("Today's Date: " + LocalDate.now().toString());
        System.out.println();

        System.out.println();
    }    
}