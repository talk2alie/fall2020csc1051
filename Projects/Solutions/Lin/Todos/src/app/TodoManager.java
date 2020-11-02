package app;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDate;

public class TodoManager {
    public static void main(String[] args) {

    //#1
        System.out.println();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDate now = LocalDate.now(); 
        
        System.out.println("Welcome to Your To-Do Manager");
        System.out.println("----------------------------");
        System.out.println("Today's Date: " + time.format(now));
        System.out.println();

   
        
                
    

    }
}