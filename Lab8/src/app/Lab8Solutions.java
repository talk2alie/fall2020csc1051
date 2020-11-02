package app;

import java.util.Random;

/**
 * DoubleArrays
 */
public class Lab8Solutions {
    public static void main(String[] args) {
        System.out.println();

        double[] left = {1, 5, 22, 10, 18};
        double[] right = {99};

        double[] horizontalSums = horizontallySumUp(left, right);
        System.out.println("Horizontal Sums:");
        print(left, right, horizontalSums);

        System.out.println();

        // int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        // System.out.println("Before Shuffle:");
        // print(numbers);
        // System.out.println();
        
        // System.out.println("After Shuffle:");
        // shuffle(numbers);
        // print(numbers);

        // System.out.println();
    }

    private static double[] horizontallySumUp(double[] left, double[] right) {
        int maxLength = left.length >= right.length ? left.length : right.length;
        double[] horizontalSums = new double[maxLength];

        int index = 0;
        while(index < maxLength) {
            double leftNumber = index < left.length ? left[index] : 0;
            double rightNumber = index < right.length ? right[index] : 0;
            horizontalSums[index++] = leftNumber + rightNumber;
        }
        
        return horizontalSums;
    }

    private static void print(double[] left, double[] right, double[] sums) {
        int maxLength = left.length >= right.length ? left.length : right.length;

        int index = 0;
        while (index < maxLength) {
            double leftNumber = index < left.length ? left[index] : 0;
            double rightNumber = index < right.length ? right[index] : 0;
            
            System.out.printf("%10.1f %10s %10.1f %10s %10.1f %n", leftNumber, "+" , rightNumber, "=", sums[index++]);
        }
    }

    private static void shuffle(int[] numbers) {
        var random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int swapIndex = random.nextInt(numbers.length);
            int temporary = numbers[swapIndex];
            numbers[swapIndex] = numbers[i];
            numbers[i] = temporary;
        }
    }

    private static void print(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}