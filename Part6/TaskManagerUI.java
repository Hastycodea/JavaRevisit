package Part6;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagerUI {

    private TaskManager task;
    private Scanner scanner;

    public TaskManagerUI(TaskManager task, Scanner scanner) {
        this.task = task;
        this.scanner = scanner;
    }
    

    public void start() {
        while (true) {
            System.out.println("1. Add Task\r\n" + //
                    "2. Register Employee\r\n" + //
                    "3. Assign Task\r\n" + //
                    "4. Mark Task In Progress\r\n" + //
                    "5. Mark Task Completed\r\n" + //
                    "6. View Tasks by Employee\r\n" + //
                    "7. View Task History\r\n" + //
                    "8. Exit");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            System.out.println();

            if (choice.equals("8")) {
                break;
            } else if (choice.equals("1")) {
                System.out.print("Description: ");
                String description = scanner.nextLine();

                System.out.print("Deadline: ");
                String deadline = scanner.nextLine();

                System.out.print("Priority: ");
                int priority = Integer.valueOf(scanner.nextLine());

                task.addTask(description, deadline, priority);
                System.out.println();

                System.out.println("Task added successfully.");
                System.out.println();

                                
            } else if (choice.equals("2")) {
                System.out.print("Employee name: ");
                String name = scanner.nextLine();

                System.out.print("Employee ID: ");
                String id = scanner.nextLine();

                task.registerEmployee(name, id);
                System.out.println();

                System.out.println("Employee registered successfully.");
                System.out.println();

            } else if (choice.equals("3")) {
                System.out.print("Employee ID: ");
                String id = scanner.nextLine();

                System.out.print("Task Description: ");
                String description = scanner.nextLine();

                task.assignTask(id, description);

                System.out.println();
                System.out.println("Task assigned successfully.");
                System.out.println();

            } else if (choice.equals("4")) {
                System.out.print("Task Description: ");
                String description = scanner.nextLine();

                task.markInProgress(description);

                System.out.println();

                System.out.println("Task marked as in progress.");


            } else if (choice.equals("5")) {
                System.out.print("Task Description: ");
                String description = scanner.nextLine();

                task.markAsCompleted(description);
                
                System.out.println();
                System.out.println("Task marked as completed.");
                System.out.println();

            } else if (choice.equals("6")) {
                System.out.print("Employee ID: ");
                String id = scanner.nextLine();

                System.out.println();

                int i = 1;
                ArrayList<Task> tasks = task.viewTasks(id);
                for(Task task : tasks) {
                    System.out.println(i + ". "+task);
                    i++;
                }
                System.out.println();

            } else if (choice.equals("7")) {
                System.out.println("Task History: ");
                
                int i = 1;
                ArrayList<String> items = task.viewHistory();
                for(String item : items) {
                    System.out.println(i +". " + item);
                    i++;
                }
                
                System.out.println();
            }

        }
    }

}
