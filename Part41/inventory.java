package Part41;

import java.nio.file.Paths;
import java.util.Scanner;


public class inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File: ");
        String fileInput = scanner.nextLine();

        System.out.print("Category: ");
        String categoryInput = scanner.nextLine();

        int sum = 0;

        try(Scanner scan = new Scanner(Paths.get(fileInput))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");

                String category = parts[1];
                int quantity = Integer.valueOf(parts[2]);

                if (category.equals(categoryInput)) {
                    sum += quantity;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: ");
        }

        System.out.println("Products Sold: " + sum);
    }
}
