package loops;

public class BackwardCounter {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
            if(i % 10 == 1) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
