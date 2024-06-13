import java.util.Scanner;

public class PartTwoTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
        
        System.out.println(countNumbers(start, end));

    }

    public static int countNumbers(int start, int end) {
        int count = 0;
        for (int i=start; i <= end; i++) {
            count ++;
        }
        return count;
    }
}
