package loops;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import people.Student;

public class StudentLookup {
    public static void main(String[] args) {
        System.out.println();

        ArrayList<Student> students = new ArrayList<>();

        try {
            var reader = new Scanner(new File("students.csv"));
            reader.nextLine();

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] studentProperties = line.split(",");

                int id = Integer.parseInt(studentProperties[0]);
                String firstName = studentProperties[1];
                String middleName = studentProperties[2];
                String lastName = studentProperties[3];
                byte age = Byte.parseByte(studentProperties[4]);

                Student currentStudent = new Student(id, firstName, middleName, lastName, age);
                students.add(currentStudent);
            }

            System.out.print("What is the ID of the student you want to look up? ");
            
            var keyboard = new Scanner(System.in);
            int studentId = keyboard.nextInt();
            keyboard.close();

            Student student = null;
            for (int i = 0; i < students.size(); i++) {
                Student foundStudent = students.get(i);
                if (foundStudent.getId() == studentId) {
                    student = foundStudent;
                }
            }

            String studentDetails = student.getCard();
            System.out.println(studentDetails);
        } catch (Exception error) {
            System.err.println("There was an error.");
            System.err.println(error.getMessage());
        }

        System.out.println();
    }
}
