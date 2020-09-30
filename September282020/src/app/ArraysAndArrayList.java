package app;


public class ArraysAndArrayList {
    public static void main(String[] args) {
        String student = "Andrew Manatos";
        student = "De'ana Miller";
        System.out.println(student);

        /*
         * Andrew Manatos 
         * Anna Dunsmoor 
         * Cade Taylor 
         * De'ana Miller 
         * Drew Stackhouse
         * 
         */

        String[] students;
        students = new String[5];
        students[0] = "Andrew Manatos";
        students[1]= "Anna Dunsmoor";
        students[2] = "Cade Taylor";
        students[3] ="De'ana Miller";
        students[4]= "Drew Stackhouse";

        int[] scores = new int[10];
        scores[2] = 21 - 14;
        scores[9] = 50;

        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students.length);

        System.out.println(scores.length);
    }
}
