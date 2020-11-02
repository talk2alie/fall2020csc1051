package src.app;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDate;    

public class ToDoManager {
    public static void main(String[] args) { 
        System.out.println();
        System.out.println("Welcome to your To-Do Manager");
        System.out.println("-----------------------------");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDate rightNow = LocalDate.now();  
        System.out.println("Today's date: " + date.format(rightNow));
        System.out.println();
    }
}
