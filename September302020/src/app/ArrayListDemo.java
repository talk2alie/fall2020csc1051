package app;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>(2);
        names.add("Kathleen");
        names.add("Justin");
        names.add("Geetha");

        names.set(0, "Eric");

        System.out.println(names.get(2));

        
        Object[] students = new Object[2];
        students[0] = "Kathleen";
        students[1] = "Justin";

        students[0] = null;

        System.out.println(students[2]);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        int a = numbers.get(0);
    }
}
