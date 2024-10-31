package desafiocontrolefluxo;

import java.util.Scanner;

/**
 * This class contains the main method to execute a counting logic based on user input.
 */
public class Counter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first parameter:");
        int firstParameter = scanner.nextInt();
        
        System.out.println("Enter the second parameter:");
        int secondParameter = scanner.nextInt();
        
        try {
            // Calling the counting method
            count(firstParameter, secondParameter);
        
        } catch (InvalidParametersException exception) {
            // Print the message: The second parameter must be greater than the first
            System.out.println(exception.getMessage());
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    }
    
    /**
     * This method performs the counting based on the difference between the two parameters.
     * It throws an InvalidParametersException if the first parameter is greater than the second.
     * 
     * @param firstParameter The starting integer for the counting range.
     * @param secondParameter The ending integer for the counting range.
     * @throws InvalidParametersException if the first parameter is greater than the second.
     */
    static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        // Validate that firstParameter is less than secondParameter; throw exception if not
        if (firstParameter > secondParameter) {
            throw new InvalidParametersException("The second parameter must be greater than the first");
        }
        
        // Calculate the number of iterations based on the difference between parameters
        int count = secondParameter - firstParameter;
        
        // Loop through the count variable and print each number
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
