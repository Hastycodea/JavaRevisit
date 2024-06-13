import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers (or type 'exit' to finish)");

        int totalNumbers = 0;
        int negativeNumbers = 0;
        int positiveNumbers = 0;
        int sumOfNumbers = 0;
        double average = 0;

        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine(); 
            
            if (input.equals("exit")) {
                break;
            }

            // if (input.equalsIgnoreCase("exit")) {
            // break;
            // }

            int number = Integer.valueOf(input); 
            totalNumbers++;
            sumOfNumbers += number;

            if (number < 0) {
                negativeNumbers++;
            } else {
                positiveNumbers++;
            }

            int absoluteValue = Math.abs(number);
            int square = number * number;
            double squareRoot = Math.sqrt(number);

            System.out.println("Square of the number: " + square);
            System.out.println("Square root of the number: " + squareRoot);
            System.out.println("Absolute value of the number: " + absoluteValue);
            System.out.println();

        }
        average = sumOfNumbers * 1.0 / totalNumbers;

        System.out.println("Summary:");
        System.out.println("Total numbers entered: " + totalNumbers);
        System.out.println("Number of negative numbers: " + negativeNumbers);
        System.out.println("Number of positive numbers: " + positiveNumbers);
        System.out.println("Sum of all numbers: " + sumOfNumbers);
        System.out.println("Average of all numbers: " + average);

    }
}