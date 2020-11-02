package app;

public class GoingMathematical {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 0; i <= 10; ++i) {
            double squareOfi = getSquareOf(i);
            System.out.println("The square of " + i + " is " + squareOfi);
        }

        System.out.println();
    }

    private static double getSquareOf(int number) {
        double squareOfNumber = Math.pow(number, 2.0);
        return squareOfNumber;
    }
}
