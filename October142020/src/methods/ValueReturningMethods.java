package methods;

public class ValueReturningMethods {
    public static void main(String[] args) {
        String firstName = "Mason";
        String lastName = "Greenwood";
        String fullName = createFullName(firstName, null, lastName);
        System.out.println(fullName);

        String userFirstName = "Mohamed";
        String userMiddleName = "Abubakr";
        String userLastName = "Obaid";
        String userFullName = createFullName(userFirstName, userMiddleName, userLastName);
        System.out.println(userFullName);
    }

    private static String createFullName(String firstName, String middleName, String lastName) {
        String fullName = firstName + " ";
        if (middleName != null && middleName.length() > 0) {
            fullName += middleName + " ";
        }

        fullName += lastName;

        return fullName;
    }
}
