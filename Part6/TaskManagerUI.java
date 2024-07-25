package Part6;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagerUI {

    private TaskManager task;
    private Scanner scanner;
    private ArrayList<String> list;

    public TaskManagerUI(TaskManager task, Scanner scanner) {
        this.task = task;
        this.scanner = scanner;
        this.list = new ArrayList<>();
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

                this.list.add("Added task: " + description);
                                
            } else if (choice.equals("2")) {
                System.out.print("Employee name: ");
                String name = scanner.nextLine();

                System.out.print("Employee ID: ");
                String id = scanner.nextLine();

                task.registerEmployee(name, id);
                System.out.println();

                System.out.println("Employee registered successfully.");
                System.out.println();

                this.list.add("Registerd employee: " + name);

            } else if (choice.equals("3")) {
                System.out.print("Employee ID: ");
                String id = scanner.nextLine();

                System.out.print("Task Description: ");
                String description = scanner.nextLine();

                task.assignTask(id, description);

                System.out.println();
                System.out.println("Task assigned successfully.");
                System.out.println();

                this.list.add("Assigned task: " + description);      

            } else if (choice.equals("4")) {
                System.out.print("Task Description: ");
                String description = scanner.nextLine();

                task.inProgress(description);

                System.out.println();

                System.out.println("Task marked as in progress.");

                this.list.add("Marked task as in progress: " + description);

            } else if (choice.equals("5")) {
                System.out.print("Task Description: ");
                String description = scanner.nextLine();
                
                task.isCompleted(description);

                System.out.println();
                System.out.println("Task marked as completed.");
                System.out.println();

                this.list.add("Marked task as completed: " + description);

            } else if (choice.equals("6")) {
                System.out.print("Employee ID: ");
                String id = scanner.nextLine();

                System.out.println();
                task.view(id);
                System.out.println();
            } else if (choice.equals("7")) {
                System.out.println("Task History: ");

                int i = 1;
                for(String item : this.list) {
                    System.out.println(i+ ". "+ item);
                    i++;
                }
                System.out.println();
            }

        }
    }

}
