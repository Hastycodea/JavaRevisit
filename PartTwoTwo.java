import java.util.Scanner;

public class PartTwoTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("START must be smaller than END");
        int start;
        int end;
        while (true) {
            System.out.print("Enter the start number: ");
            start = Integer.valueOf(scanner.nextLine());

            System.out.print("Enter the end number: ");
            end = Integer.valueOf(scanner.nextLine());

            if (start > end) {
               System.out.println("Kindly re-enter the values. " + start + " is greater than " + end);                                 
            } else if (start == end) {
                System.out.println("Kindly re-enter the values. " + start + " is equal to " + end);
            } else {
                break;
            }

        }
        
        System.out.println("Count of numbers: " + countNumbers(start, end));
        System.out.println("Sum of numbers: " + sumNumbers(start, end));
        System.out.println("Factorial of the sum: " + calculateFactorial(sumNumbers(start, end)));

    }

    public static int countNumbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            count ++; //count = count + 1;
        }
        return count;
    }

    public static int sumNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static long calculateFactorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
