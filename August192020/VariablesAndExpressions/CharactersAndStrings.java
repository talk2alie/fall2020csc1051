public class CharactersAndStrings {
    public static void main(String[] args) {
        char letterGrade = 'B';
        char a = 'A';
        char plus = '+';
        // 108
        // System.out.println(a + plus);

       

        // String concatenation
        /*
            Using the + operator to combine a string value
            with other values
        */

        String firstName = "Talia ";
        // String space = " ";
        String lastName = "Martini";
        String fullName = firstName + lastName;
        // System.out.println(fullName);

        int largeAge = 22;
        String smallAge = "18";
        // System.out.println("I have $" + (largeAge + smallAge) + ".00 in the bank"); // 2218 I have $1111.00 in the bank
        
        // TaliaMartini Talia Martini Talia Martini

        // Arithmetic Operators
        /*
            +   Adds operands
            -   Subtracts
            /   Division
            *   Multiplication
            %   Modulus
        */

        float numerator = 5;
        int denominator = 2;
        double quotient = (((-numerator / denominator) * 4) + 5); // 0.7142857313156128
        System.out.println(quotient); // 2.5

        // Operator Precedence
        /*
        + -  (unary)
        / * %
        + -
        =
        */
    }
}