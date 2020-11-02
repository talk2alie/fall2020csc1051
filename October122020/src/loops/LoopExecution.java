package loops;

import java.util.Scanner;

/**
 * LoopExecution
 */
public class LoopExecution {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        double[] numbers = new double[1000];
        int i = 0;
        do {
            System.out.println("Enter a positive integer: ");
            userInput = keyboard.nextInt();
            if(userInput > 0){
                numbers[i]= userInput; 
            }
            i++;
        } while (userInput > 0);
        keyboard.close();
        int counter = 0;
        while (counter < numbers.length){
            if(numbers[counter]>0){
                System.out.println(numbers[counter++]);
            }
            else{
                break;
            }            
            System.out.println("This code will only run if the number above is not even");
        }        
    } 
}