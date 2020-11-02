package app;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDate;    
public class TodoManager {
    public static void main(String[] args){
        System.out.println();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDate now = LocalDate.now(); 
        
        System.out.println("Welcome to your Todo Manager");
        System.out.println("----------------------------");
        System.out.println("Today's date: " + dtf.format(now));
        System.out.println();

 
    }
}