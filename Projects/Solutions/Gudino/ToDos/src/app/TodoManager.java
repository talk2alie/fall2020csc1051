package app;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class TodoManager
{
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println();
        System.out.println("Welcome to Your ToDo Manager");
        System.out.println("----------------------------");

        LocalDate date = LocalDate.now();
        System.out.println("Today's Date: " + date);
        System.out.println();

    }

}
