package Part6;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<String> tasks;
    private ArrayList<Employee> employees;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void registerEmployee(String name, String id) {
        this.employees.add(new Employee(name, id));
    }

    public void assignTask(String id, String task) {
        for(Employee employee : this.employees) {
            if (employee.getId().equals(id)) {
                String name = employee.getName();
            }
        }
    }

}
