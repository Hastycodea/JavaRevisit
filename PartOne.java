import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        // System.out.println();
        int firstInteger = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the second integer: ");
        int secondInteger = Integer.valueOf(scanner.nextLine());

        int sum = firstInteger + secondInteger;
        int difference = firstInteger - secondInteger;
        int product = firstInteger * secondInteger;
        double quotient = firstInteger * 1.0 / secondInteger;
        int remainder = firstInteger % secondInteger;
        System.out.println();

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println();
        System.out.println();

        if (firstInteger % secondInteger == 0) {
            System.out.println(firstInteger + " is divisible by " + secondInteger);                        
        } else {
            System.out.println(firstInteger + " is not divisible by " + secondInteger);
        }
        System.out.println();
        // ternary operator
       // if (firstInteger % secondInteger == 0) ? (firstInteger + " is divisible by " + secondInteger) : (firstInteger + " is not divisible by " + secondInteger);

        if (firstInteger % 2 == 0) {
            System.out.println(firstInteger + " is even");            
        } else {
            System.out.println(firstInteger + " is odd");
        }

        if (secondInteger % 2 == 0) {
            System.out.println(secondInteger + " is even");            
        } else {
            System.out.println(secondInteger + " is odd");
        }
        System.out.println();

        if (firstInteger > secondInteger) {
            System.out.println("Comparison: " + firstInteger + " is greater than " + secondInteger);            
        } else if (firstInteger == secondInteger) {
            System.out.println("Comparison: " + firstInteger + " is equal to " + secondInteger);
        } else {
            System.out.println("Comparison: " + firstInteger + " is less than " + secondInteger);
        }
        System.out.println();

        if (sum < 10) {
            System.out.println("The sum of the numbers is small");            
        } else if (sum <= 100) {
            System.out.println("The sum of the numbers is medium");
        } else {
            System.out.println("The sum of the numbers is large");
        }

        if (quotient > 10) {
            System.out.println("The quotient is quite large");            
        }
    }

}
