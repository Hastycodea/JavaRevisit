import java.util.Scanner;

public class PartTwo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Specify line height: ");
        int height = Integer.valueOf(scanner.nextLine());

        for(int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printNumber(i);
            System.out.println();
        }
    }

    public static void printSpaces(int number) {
        for(int i = 0; i < number; i++ ) {
            System.out.print(" ");
        }
    }

    public static void printNumber(int number) {
        for(int i = 1; i <= number; i++) {
            System.out.print(i);
        }
    }
}
