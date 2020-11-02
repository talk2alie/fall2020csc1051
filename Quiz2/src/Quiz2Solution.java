public class Quiz2Solution {
    private static String[] names = new String[5];
    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            push("name" + (i + 1));
        }

        printNames();
    }

    private static void push(String name) {
        if(count == names.length) {
            moveNamesToLargerArray();
        }

        for(int i = count; i > 0; --i) {
            names[i] = names[i - 1];
        }

        names[0] = name;
        count++;
    }

    private static void moveNamesToLargerArray() {
        String[] largerArray = new String[count * 2];
        for (int i = 0; i < names.length; i++) {
            largerArray[i] = names[i];
        }
        names = largerArray;
    }

    private static void printNames() {
        System.out.println();

        for (int i = 0; i < names.length; ++i) {
            System.out.printf("%5d: \"%s\" %n", i, names[i]);
        }

        System.out.println();
    }
}