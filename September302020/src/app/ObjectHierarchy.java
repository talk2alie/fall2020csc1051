package app;

public class ObjectHierarchy {
    public static void main(String[] args) {
        String name = "John";

        Object something;
        something = 1;
        something = "John";
        something = 5.5F;

        something = name;

        Person steven = new Person(); 

        


        System.out.println(name);
    }
}
