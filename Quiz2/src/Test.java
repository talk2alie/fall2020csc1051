import java.util.ArrayList;

public class Test {
    private static ArrayList<String> names;
    private static String name = "Albert";

    public static void main(String[] args) {
        names = new ArrayList<>();
        System.out.println(names.size());
        System.out.println(name);

        clearNames();
    }

    private static void clearNames() {
        names = new ArrayList<>();
    }
}
