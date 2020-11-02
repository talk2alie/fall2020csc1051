package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * An application for managing Todo Items
 */
public class TodoManager {
    private static ArrayList<String> users;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();

        System.out.println("Welcome to Your To-Do Manager");
        System.out.println("-----------------------------");
        System.out.println("Today's Date: " + LocalDate.now().toString());
        System.out.println();

        loadUsers();

        System.out.println("Here are the current users in our system:");
        System.out.println("_________________________________________");
        System.out.println();
        printUsers();

        System.out.println();
    }

    private static void printUsers() {
        for (String user : users) {
            System.out.println(user);
        }
    }

    private static void loadUsers() {
        try {
            users = new ArrayList<>();

            var file = new File("users.todo");
            var reader = new Scanner(file);

            // Skip first line
            reader.nextLine();
            while(reader.hasNextLine()) {
                users.add(reader.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}