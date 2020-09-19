package app;

public class StringClassDemo {
    public static void main(String[] args) {
        String name = "Eric";
        name = name.toUpperCase();
        name = name.toLowerCase();

        String nonesense = "jhdfguhnllawwruku238uwerthsaefkjshoih";
        int length = nonesense.length();
        
        System.out.println(nonesense + " has " + length + " characters in it.");
    }
}
