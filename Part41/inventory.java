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

        int sumQuantity = 0;
        int sumTotalRevenue = 0;

        try(Scanner scan = new Scanner(Paths.get(fileInput))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");

                String productName = parts[0];
                String category = parts[1];
                int quantity = Integer.valueOf(parts[2]);
                int totalRevenue = Integer.valueOf(parts[3]);

                if (category.equals(categoryInput)) {
                    sumQuantity += quantity;
                    sumTotalRevenue += totalRevenue;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        double average = sumTotalRevenue * 1.0 / sumQuantity;

        System.out.println("Products Sold: " + sumQuantity);
        System.out.println("Total Revenue: " + sumTotalRevenue);
        System.out.println("Average Revenue per Product: " + average);
    }
}
