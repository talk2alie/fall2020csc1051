package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();

        File file = new File("Students.txt");
        Scanner reader = new Scanner(file);
        // String firstName = reader.next();
        // String secondName = reader.next();
        // String thirdName = reader.next();
        // System.out.println(firstName);
        // System.out.println(secondName);
        // System.out.println(thirdName);

        String firstToken = reader.next();
        String secondToken = reader.next();
        // int wrapper class is called Integer
        int sum = Integer.parseInt(firstToken) + Integer.parseInt(secondToken);
        
        System.out.println("Sum is: " + sum);
        reader.close();

        System.out.println();
    }
}
