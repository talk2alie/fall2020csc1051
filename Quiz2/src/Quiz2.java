public class Quiz2 {
    private static String[] names = new String[5];
    private static int count = 0;

    /**
     * Do not modify this method. Use it only to test your code.
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            push("name" + (i + 1));
        }

        printNames();
    }

    /**
     * Question 2: Write the body of this method to add the given name to the names
     * field above. If the field is full, double its size and then add the given
     * name
     * 
     * @param name - The name to add to the names field array
     */
    private static void push(String name) {

    }

    /**
     * Question 1: Write the body of this method to double the size of the names
     * field array and move all the names to the larger array
     */
    private static void moveNamesToLargerArray() {

    }

    /**
     * Prints the names in the names field array in their natural order
     */
    private static void printNames() {
        System.out.println();

        for (int i = 0; i < names.length; ++i) {
            System.out.printf("%5d: \"%s\" %n", i, names[i]);
        }

        System.out.println();
    }
}
