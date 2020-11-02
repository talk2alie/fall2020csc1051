package methods;

public class Lab6Solutions {
    public static void main(String[] args) {
        System.out.println();

        // double sum = add(5.5, 10);
        // System.out.println(sum);

        // System.out.println();

        // String text = "I am the king of the jungle!";
        // char lastCharacter = getLastCharacter(text);
        // System.out.println(lastCharacter);

        int[] numbers = {10, 99, 8};
        System.out.println("Numbers before swap: ");
        print(numbers);

        System.out.println(numbers);

        swapFirstAndThird(numbers);
        System.out.println("Numbers after swap: ");
        print(numbers);

        System.out.println();
    }

    private static double add(double first, double second) {
        return first + second;
    }

    private static char getLastCharacter(String text) {
        return text.charAt(text.length() - 1);
    }

    private static void swapFirstAndThird(int[] numbers) {
        int temporary = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temporary;
    }

    private static void print(int[] numbers) {
        for(int i = 0; i < numbers.length; ++i) {
            System.out.println(numbers[i]);
        }
    }
}
