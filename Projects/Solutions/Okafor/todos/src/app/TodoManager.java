package app;
import java.time.LocalDate;

public class TodoManager{
    public static void main(String[]args){

        System.out.println("Welcome to Your To-Do Manager");
        System.out.println("-----------------------------");
        
        LocalDate date =LocalDate.now();
        System.out.print("Todays date: "+ date);
    }
}