package loops;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import people.Student;

public class StudentLookup {
    public static void main(String[] args) {
        System.out.println();

        /*
         * We want to create a collection to hold information about all the students in
         * the students.csv file.
         * 
         * Because we do not know how many students might be in the file, we will create
         * an array list object that can grow
         */
        ArrayList<Student> students = new ArrayList<>();

        /*
         * Question 1: Write code below here that reads the content of the students
         * file. Your code should skip the first line in the file since it is only the
         * table header.
         * 
         * For each subseqent line in the file, do the following:
         * 
         * a. Read the line as a string b. Use the String class' split() method to split
         * the line by the comma c. With the data in the resulting array from spliting
         * the line, instantiate a new Student object and it to the array list above
         * 
         * For e.g. Consider this line from the file: 10,Austin,Johanna,Taylor,32 If
         * that line were stored in a string variable called line, I could split it and
         * use the values as follows:
         * 
         * String[] studentProperties = line.split(","); (The split method divides each
         * value by the comma and stores the individual elements in the array) So after
         * line.split(",") runs, the studentProperties array will now have the following
         * values:
         * 
         * Index Value Meaning ------------------------------------- 0 "10" id 1
         * "Austin" First Name 2 "Johanna" Middle Name 3 "Taylor" Last Name 4 "32" Age
         * 
         * // Note that the Student class a constructor that expects details about a
         * student. // So, I can create a Student object with those values as follows:
         * int id = Integer.parseInt(studentProperties[0]); String firstName =
         * studentProperties[1]; String middleName = studentProperties[2]; String
         * lastName = studentProperties[3]; byte age =
         * Byte.parseByte(studentProperties[4]); Student student = new Student(id,
         * firstName, middleName, lastName, age);
         * 
         * // Then I can add the student to the array list as follows:
         * students.add(student);
         */
        try {
            var reader = new Scanner(new File("students.csv"));
            reader.nextLine(); // Skip the first line

            while (reader.hasNextLine()) {
                // Read the current line
                String line = reader.nextLine();

                // Split the line to get individual student properties
                String[] studentProperties = line.split(",");

                // Create a new student object for the current line

                // Note that we have to change the data type for the id and the age, using
                // the wrapper classes for int and byte, respectively
                int id = Integer.parseInt(studentProperties[0]);
                String firstName = studentProperties[1];
                String middleName = studentProperties[2];
                String lastName = studentProperties[3];
                byte age = Byte.parseByte(studentProperties[4]);

                // Create a new student object from the information above
                Student currentStudent = new Student(id, firstName, middleName, lastName, age);

                // Add the current student to the array list
                students.add(currentStudent);
            }

            // Question 2: Ask the user to enter an integer number for a student's name to
            // look up
            var keyboard = new Scanner(System.in);
            System.out.print("What is the ID of the student you want to look up? ");
            int studentId = keyboard.nextInt();

            // Close the keyboard screen
            keyboard.close();

            // Question 3: Use a for-loop to search for the student with the ID the user provided
            Student student = null;
            for (int i = 0; i < students.size(); i++) {
                Student foundStudent = students.get(i);
                if (foundStudent.getId() == studentId) {
                    student = foundStudent;
                }
            }

            /*
             * Question 4: Call the getCard() method on the student's object to get the
             * student's details. Store the value the getCard() method returns in a variable
             * called studentDetails
             */
            String studentDetails = student.getCard();

            /*
             * Question 5: Print the value int the studentDetails variable
             */
            System.err.println(studentDetails);
        } catch (Exception error) {
            System.out.println("There was an error.");
            System.out.println(error.getMessage());
        }

        System.out.println();
    }
}
