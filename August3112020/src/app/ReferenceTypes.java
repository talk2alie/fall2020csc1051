package app;

public class ReferenceTypes {
    public static void main(String[] args) {
        // int population;
        // population = 2_500_000;
        // System.out.println(population);
         
        Person drew = new Person("Drew");
        Person taylor = new Person("Taylor");
        Person anna = new Person("Anna");
        System.out.println(Person.count);
    }    
}