package app;

/**
 * ForLoop
 */
public class ForLoop {
    public static void main(String[] args) {
        int arrayNumber = 5;
        Object[] students = new Object[arrayNumber];
        students[0] = "Kathleen";
        students[1] = "Justin";
        students[2] = "Steven";
        students[3] = "Mary";



        for(int counter = 0; counter < students.length; counter++) {
            System.out.println(students[counter]);
        }
    }
}