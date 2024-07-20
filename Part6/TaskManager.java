package Part6;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;
    private ArrayList<Employee> employees;
    public int priority;


    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addTask(String description, String deadline, int priority) {
        this.tasks.add(new Task(description, deadline, priority));
    }

    public void registerEmployee(String name, String id) {
        this.employees.add(new Employee(name, id));
    }

    public void assignTask(String id, String task) {
        for (Employee employee : this.employees) {
            if (employee.getId().equals(id)) {
                String name = employee.getName();
            }
        }
    }

    public void inProgress(String task) {
        
    }

}
