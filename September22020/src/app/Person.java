package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * A class that represents a real world person
 * Don't worry about how to create a class right now. 
 * We are only focused on how to use one
 */
public class Person {

    /*
        These arre fields. They represent some information 
        about any person object created from this class
    */
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final int birthMonth;
    private final String birthDayOfTheWeek;
    private final int birthDay;
    private final int birthYear;

    /**
     * Creates a new person object with the given information
     * @param firstName the person's first name
     * @param lastNamme the person's last name
     * @param birthDate the person's birth date in the format MM/dd/yyyy
     */
    public Person(String firstName, String lastNamme, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastNamme;
        this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        birthMonth = this.birthDate.getMonthValue();
        birthDayOfTheWeek = this.birthDate.getDayOfWeek().toString();
        birthDay = this.birthDate.getDayOfMonth();
        birthYear = this.birthDate.getYear();
    }
    
    /**
     * Gets the person's first name
     * @return the person's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Gets the person's first name
     * @return the person's first name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Gets the person's age
     * @return the person's age
     */
    public int getAge() {
        var localDate = LocalDate.now();
        int thisMonth = localDate.getMonthValue();
        int today = localDate.getDayOfMonth();
        int thisYear = localDate.getYear();

        int age = thisYear - birthYear;
        if(birthMonth > thisMonth) {
            age--;
            return age;
        }

        if(birthMonth == thisMonth && birthDay > today) {
            age--;
        }
        return age;
    }

    /**
     * Returns a value that indicates whether this person is older than 
     * the other person
     * @param other the other person
     * @return true if this peron's age is larger than the other person's age;
     *         false, otherwise
     */
    public boolean isOlderThan(Person other) {
        return getAge() > other.getAge();
    }

    /**
     * Gets the week day on which this person was born
     * @return Thee week day this person wass born
     */
    public String getBirthDayOfTheWeek() {
        return this.birthDayOfTheWeek;
    }
}