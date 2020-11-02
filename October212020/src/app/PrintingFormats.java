package app;

public class PrintingFormats {
    public static void main(String[] args) {
        System.out.println();

        // long first = 1;
        // double second = 0.9;
        // System.out.printf("I have 2 numbers: first = %d and second = %.5f", first, second);
        String steven = "Steven Niccolai";
        String justin = "Justin Donner";
        String geetha = "Geetha Soundrarajan";
        String bill = "Bill Acchione";
        System.out.printf("%-19s%n%-19s%n%-19s%n%-19s%n", steven, justin, geetha, bill);

        System.out.println();
    }
}
