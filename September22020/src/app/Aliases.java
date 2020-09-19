package app;

public class Aliases {
    public static void main(String[] args) {

        System.out.println();

        Person feven = new Person("Feven", "Debelo", "12/14/1994");
        Person emma = new Person("Emma", "Gudino", "06/13/1991");

        System.out.println("Before:");
        System.out.println("Feven's Info: " + feven.getFirstName() + " " + feven.getLastName());
        System.out.println("Emma's Info: " + emma.getFirstName() + " " + emma.getLastName());
        
        System.out.println();

        System.out.println("After:");
        feven = emma;
        System.out.println("Feven's Info: " + feven.getFirstName() + " " + feven.getLastName());
        System.out.println("Emma's Info: " + emma.getFirstName() + " " + emma.getLastName());

        System.out.println();
        feven.setFirstName("Feven");
        System.out.println("Feven's Info: " + feven.getFirstName() + " " + feven.getLastName());
        System.out.println("Emma's Info: " + emma.getFirstName() + " " + emma.getLastName());

        System.out.println();
    }
}
