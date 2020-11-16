package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import users.User;

/**
 * An application for managing Todo Items
 */
public class TodoManager {
    private static ArrayList<User> users;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();

        System.out.println("Welcome to Your To-Do Manager");
        System.out.println("-----------------------------");
        System.out.println("Today's Date: " + LocalDate.now().toString());
        System.out.println();

        loadUsers();

        var keyboard = new Scanner(System.in);
        System.out.print("Please enter last name to locate user(s): ");
        String lastName = keyboard.nextLine();
        keyboard.close();

        System.out.println();
        System.out.println("---------------------------------------------------");
        ArrayList<User> foundUsers = findUser(lastName);
        printUsers(foundUsers);

        System.out.println();
    }

    private static ArrayList<User> findUser(String lastName) {
        var foundUsers = new ArrayList<User>();
        for(User user : users) {
            if(user.getLastName().equalsIgnoreCase(lastName.trim())) {
                foundUsers.add(user);
            }
        }
        return foundUsers;
    }

    private static void printUsers(ArrayList<User> foundUsers) {
        if(foundUsers.size() == 0) {
            System.out.printf("No user with the given last name was found.");
            System.out.println();
            return;
        }

        System.out.println("Here are users with the given last name: ");
        for (User user : foundUsers) {
            System.out.println(user);
        }

        System.out.println();
    }

    private static void loadUsers() {
        try {
            users = new ArrayList<>();

            var file = new File("users.todo");
            var reader = new Scanner(file);

            // Skip first line
            reader.nextLine();
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] nameParts = line.split(",");
                var user = new User(nameParts[0], nameParts[1], nameParts[2], nameParts[3]);
                users.add(user);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}