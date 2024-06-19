import java.util.Scanner;

public class PartTwo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Specify line height: ");
        int height = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= height; i++) {
            int width = (2 * i) - 1;
            int space = height - i;

            printSpaces(space);
            printNumber(i, width);

            System.out.println();
        }
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printNumber(int number, int width) {
        for (int i = 0; i < width; i++) {
            System.out.print(number);
        }
    }
}
