package app;

public class ObjectCreationDemo {
    public static void main(String[] args) {
        // Declare a reference variable
        // int age;

        // Person feven;

        // // Assigning value to a reference type
        // age = 21;

        // feven =  new Person("Feven", "Debelo", "12/14/1983");
        // Person emma = new Person("Emma", "Gudino", "12/14/1994");
        // String birthWeekDay = feven.getBirthDayOfTheWeek();
        // System.out.println(feven.isOlderThan(emma));

        int populationOfNewYork = 23_000_000;
        int populationOfPhiladelphia = 22_500_000;

        System.out.println();

        System.out.println("Before:");
        System.out.println("Population of New York is: " + populationOfNewYork);
        System.out.println("Population of Philladelphia is: " + populationOfPhiladelphia);

        System.out.println();

        System.out.println("After:");
        populationOfNewYork = populationOfPhiladelphia;
        System.out.println("Population of New York is: " + populationOfNewYork);
        System.out.println("Population of Philladelphia is: " + populationOfPhiladelphia);

        populationOfPhiladelphia = 12_000;

        System.out.println();
        System.out.println("Population of New York is: " + populationOfNewYork);
        System.out.println("Population of Philladelphia is: " + populationOfPhiladelphia);

        System.out.println();
    }
}
