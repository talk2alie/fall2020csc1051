package app;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class TodoManager {
    public static void main(String[] args) {
        System.out.println();
        
        System.out.println("Welcome to Your To-Do Manager");
        System.out.println("-----------------------------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Today's Date: " + dtf.format(now));
    }
}