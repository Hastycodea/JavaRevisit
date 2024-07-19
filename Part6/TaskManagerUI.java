package Part6;

import java.util.Scanner;

public class TaskManagerUI {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            TaskManager taskManager = new TaskManager();
            System.out.println("1. Add Task\r\n" + //
                    "2. Register Employee\r\n" + //
                    "3. Assign Task\r\n" + //
                    "4. Mark Task In Progress\r\n" + //
                    "5. Mark Task Completed\r\n" + //
                    "6. View Tasks by \r\n" + //
                    "Employee\r\n" + //
                    "7. View Task History\r\n" + //
                    "8. Exit");
            System.out.println("Enter choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("x")) {
                break;
            } else if (choice.equals("1")) {
                System.out.print("Description: ");
                String task = scanner.nextLine();
                
            } else if (choice.equals("2")) {

            } else if (choice.equals("3")) {

            } else if (choice.equals("4")) {

            } else if (choice.equals("5")) {

            } else if (choice.equals("6")) {

            }

        }
    }

}
