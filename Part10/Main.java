import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while(true) {
            System.out.println("Enter 'x' to exit");
            System.out.print("Enter a number to add to list: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            int value = Integer.valueOf(input);
            numbers.add(value);
        }

        long count = numbers.stream()
                            .mapToInt(Integer::intValue)
                            .filter(n -> n > 0)
                            .count();

        if (numbers.isEmpty() || count == 0) {
            System.out.println("No valid numbers were entered.");
        } else {
            double result = calculateAverageOfUniquePositiveNumbers(numbers);
            System.out.println("The average of unique positive numbers is "+ result);
        }
        
    }

    public static double calculateAverageOfUniquePositiveNumbers(List<Integer> numbers) {
        
        double average = numbers.stream()
                                .mapToDouble(Integer::intValue)
                                .filter(n -> n > 0)
                                .distinct()
                                .average()
                                .getAsDouble();


        return average;
    }
}