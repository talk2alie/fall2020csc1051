package people;

/**
 * Maintains information about a student
 */
public class Student {
    private final int id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final byte age;

    public Student(int id, String firstName, String middleName, String lastName, byte age) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getMiddleName() {
        return middleName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public byte getAge() {
        return age;
    }

    public String getCard() {
        String details = "-------------------------------------------\n" +
                         "STUDENT ID\t\t:\t" + id + "\n" +
                         "FIRST NAME\t\t:\t" + firstName + "\n";
        if(middleName != null && middleName.hashCode() != 0) {
            details += "MIDDLE NAME\t\t:\t" + middleName + "\n";
        }

        details += "LAST NAME\t\t:\t" + lastName + "\nAGE\t\t\t:\t" + age + "\n" +
                         "-------------------------------------------\n";
        
        return details;
    }
}