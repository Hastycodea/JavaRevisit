package Part6;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    private ArrayList<Task> tasks;
    private ArrayList<Employee> employees;
    private HashMap<String, String> assign;
    public int priority;


    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.assign = new HashMap<>();
    }

    public void addTask(String description, String deadline, int priority) {
        this.tasks.add(new Task(description, deadline, priority));
    }

    public void registerEmployee(String name, String id) {
        this.employees.add(new Employee(name, id));
    }

    public void assignTask(String id, String task) {
        this.assign.put(id, task);
    }

    public boolean inProgress(String task) {
        return true;
    }

    public boolean isCompleted(String task) {
        return true;
    }

    public void view(String id) {
        String name = "";
        String status = "";

        
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                name = employee.getName();                
            }
        }

        ArrayList<String> items = new ArrayList<>();

        for(String identity : this.assign.keySet()) {
            String task = this.assign.get(identity);
            items.add(task);


        }
        System.out.println("Tasks assigned to " +name+ ":");

        int i = 1;
        for(String item : items) {

            if (inProgress(item)) {
                status = "in Progress";
            } 
            
            if ((isCompleted(item) && inProgress(item)) || isCompleted(item)) {
                status = "Completed";            
            }

            System.out.print(i + ". ");
            System.out.println(item + " - " + status);

            i++;

        }

    }

}
