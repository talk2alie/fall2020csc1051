/**
 * Variables
 */
public class Variables {
    public static void main(String[] args) {

        // byte > short > int > long > float > double

        // Declaration Statement
        byte classSize;
        // Initialization Statement
        short largerClassSize = 30_000;

        // Assignment Statement
        /* 
            Casting converts larger data type value to smaller
           data type value

           Syntax:
           <smaller data type variabe> = (<smaller data type>)<larger data type variable>
        */
        classSize = (byte)largerClassSize;
        // System.out.println(classSize);


        int largerThanLifeClassSize;
        largerThanLifeClassSize = 450_000;

        long numberOfStars = largerThanLifeClassSize;

        // 3.1415926535897932384626433832
        float pi = 3.141F;
        double biggerPi = 200_000_000_000_000_000.1415926535897932384626433832;
// 3.1415927
// 1.99999997E17
        pi = (float)biggerPi;
        System.out.println(pi);
    }
}