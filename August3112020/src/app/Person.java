package app;

public class Person {
    public String name;
    public static int count; 

    public Person(String name) {
        this.name = name;
        count = count + 1;
    }

    public void greet(String message) {
        System.out.println(message);
    }
}