package methods;


public class PassByValue {
    public static void main(String[] args) {
        Person nicole = new Person("Nicole", "Padilla");
        changeValue(nicole);
        System.out.println("First Name: " + nicole.getFirstName() + "| LastName: " + nicole.getLastName());

        int[] orderedNumbers = {1, 2, 3};
        swap(orderedNumbers);
    }

    private static void changeValue(Person person) {
        person.setFirstName("Grant");
        person.setLastName("Lincoln");
    }

    private static int sum(int first, int second) {
        return first + second;
    }

    private static void changeValue(int number) {
        number = 15;
    }

    private static void swap(int[] numbers) {
        int temporary = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temporary;
    }
}
