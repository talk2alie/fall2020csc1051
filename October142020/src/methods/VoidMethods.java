package methods;
public class VoidMethods {
    public static void main(String[] args) {
        System.out.println();

        helloWorld();

        greet("Geetha");
        greet("Geetha", "spanish");

        System.out.println();
    }

    private static void helloWorld() {
        System.out.println("Hello, World!");
    }

    private static void greet(String userName) {
        System.out.println("Hello, " + userName);
    }

    private static void greet(String userName, String language) {
        if (language.equalsIgnoreCase("arabic")) {
            System.out.println("Salam! " + userName);
        }

        if (language.equalsIgnoreCase("english")) {
            System.out.println("Hello, " + userName);
        }

        if (language.equalsIgnoreCase("spanish")) {
            System.out.println("Hola!, " + userName);
        }
    }
}
