package app;

public class Unboxing {
    public static void main(String[] args) {
        Boolean isOn = true;

        boolean isOff = isOn;

        Integer number = 1;
        addOne(number);
        System.out.println(number);
    }

    private static void addOne(Integer a) {
        a += 1;
    }

    // private static void addOne(int a) {
    //     a += 1;
    // }
}
