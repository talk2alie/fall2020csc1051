package users;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    // FirstName,LastName,Gender,DateOfBirth
    private final String firstName;
    private final String lastName;
    private String gender;
    private final LocalDate dateOfBirth;

    public User(String theUsersFirstName, String theUsersLastName, String theUserGender, String theUsersDateOfBirth) {
        firstName = theUsersFirstName;
        lastName = theUsersLastName;
        gender = theUserGender;

        var dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        dateOfBirth = LocalDate.parse(theUsersDateOfBirth, dateTimeFormatter);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String theNewGender) {
        gender = theNewGender;
    }

    public byte getAge() {
        var localDate = LocalDate.now();
        int thisMonth = localDate.getMonthValue();
        int today = localDate.getDayOfMonth();
        int thisYear = localDate.getYear();

        byte age = (byte)(thisYear - dateOfBirth.getYear());
        int birthMonth = dateOfBirth.getMonthValue();
        int birthDayOfTheMonth = dateOfBirth.getDayOfMonth();

        if (birthMonth > thisMonth) {
            age--;
            return age;
        }

        if (birthMonth == thisMonth && birthDayOfTheMonth > today) {
            age--;
        }
        return age;
    }

    @Override
    public String toString() {
        int age = getAge();
        return firstName + " " + lastName + "; a " + gender + ", is " + (age > 1 ? age : 0)  + " years old.";
    }
}
