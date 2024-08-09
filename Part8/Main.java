package Part8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        startContainer(); 
        
    }

    public static void startContainer() {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.print(
                "Welcome to the Liquid Container Registry!\n" + //
                "1. Add a Liquid Container\n" + //
                "2. Calculate the Average Volume\n" + //
                "3. Retrieve a Container's Volume\n" + //
                "4. Generate Nicknames\n" + //
                "5. Print All Containers\n" + //
                "6. Compare Container Volumes\n" + //
                "7. Exit\n" + //
                "Please select an option:"
            );

            String option = scanner.nextLine();
        }
    }


}
