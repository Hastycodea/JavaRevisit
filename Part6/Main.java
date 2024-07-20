package Part6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager task = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        TaskManagerUI taskManagerUI = new TaskManagerUI(task, scanner);
        taskManagerUI.start();        
    }
}
