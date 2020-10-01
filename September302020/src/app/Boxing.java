package app;

/**
 * Boxing occurs when the compiler converts a primitive value to its
 * corresponding object Wrapper class
 */
public class Boxing {
    public static void main(String[] args) {
        // Primitives and their Wrapper classes
        /*
         * Primitive type   Wrapper class 
         * ------------------------------
         * boolean    ->    Boolean 
         * byte       ->    Byte 
         * char       ->    Character 
         * Float      ->    Float 
         * int        ->    Integer 
         * long       ->    Long 
         * short      ->    Short 
         * double     ->    Double
         */

         // Boxing can happen implicitly
         // E.g.
         Boolean isOn = true; 
         
         // Line 25 shows the primittive value; true, being assigned to a variable of type, Boolean (an object class)
         // For the compiler to make this assignment, it first has to implicitly convert the primitive value to its
         // Wrapper object class

         // Boxing can happen explicitly
         boolean isOffPrimitve = false;
         Boolean isOff = (Boolean)isOffPrimitve;
         
         // Here we are explicitly converting the primitive value in isOffPrimitive to its wrapper object class, Boolean

         // Boxing can elevate primitive types to objects so that you can take dvantage of the properties and methods the wrapper classes offer.
         // For e.g.
         char letter = 'a';

         // As a primitive, the a varaible has no associated properteis oor methods, but we can box it to give it some super powers
         Character letterObject = letter;
         String letterString = letterObject.toString();



         Boolean isValid = true;


    }
}