package Part8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        startContainer(); 
        
    }

    public static void startContainer() {
        
        Scanner scanner = new Scanner(System.in);
        ContainerInfo container = new ContainerInfo();

        while(true) {


            System.out.print(
                "Welcome to the Liquid Container Registry!\n" + //
                "1. Add a Liquid Container\n" + //
                "2. Calculate the Average Volume\n" + //
                "3. Retrieve a Container's Volume\n" + //
                "4. Generate Nicknames\n" + //
                "5. Print All Containers\n" + //
                "6. Compare Container Volumes\n" + //
                "7. Exit\n" + //
                "Please select an option: "
            );

            int choice = Integer.valueOf(scanner.nextLine());
            System.out.println();

            if (choice == 7) {
                break;                
            } else if (choice == 1) {
                System.out.print("Enter container name: ");
                String name = scanner.nextLine();
                System.out.print("Enter volume: ");
                int volume = Integer.parseInt(scanner.nextLine());

                container.addLiquid(name, volume);
                System.out.println();

            } else if (choice == 2) {
                container.averageVolume();

            } else if (choice == 3) {
                System.out.print("Enter container name: ");
                String name = scanner.nextLine();
                container.getContainerVolume(name);
                System.out.println();

            } else if (choice == 4) {
                System.out.print("Enter container name: ");
                String name = scanner.nextLine();

                System.out.print("Enter container nickname: ");
                String nickName = scanner.nextLine();

                container.addNickName(name, nickName);
                System.out.println();

            } else if (choice == 5) {

            } else if (choice == 6) {

            } else {
                System.out.println("Invalid input, try again");
                System.out.println();
            }

        }
    }


}
