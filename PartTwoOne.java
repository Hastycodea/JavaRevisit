import java.util.Scanner;

public class PartTwoOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            System.out.print("Enter a number (or type 'exit' to finish): ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            int number = Integer.valueOf(input);

            double square = number * number;
            double sqrt = Math.sqrt(number);
            int abs = Math.abs(number);


            totalNumbers++;
            if (number > 0) {
                positiveNumbers++;
            } else {
                negativeNumbers++;
            }

            sum += number;
            average = sum * 1.0 / totalNumbers;

            System.out.println("Square: " + square);
            System.out.println("Square root: " + sqrt);
            System.out.println("Absolute value: " + abs);
            System.out.println();
        }
        System.out.println("Summary:");
        System.out.println("Total numbers entered: " + totalNumbers);
        System.out.println("Positive numbers: " + positiveNumbers);
        System.out.println("Negative numbers: " + negativeNumbers);
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);

    }
}
