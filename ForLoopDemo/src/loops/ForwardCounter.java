package loops;

/**
 * ForwardCounter
 */
public class ForwardCounter {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}