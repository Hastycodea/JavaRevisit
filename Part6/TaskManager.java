package Part6;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;
    private ArrayList<Employee> employees;
    private ArrayList<String> taskHistory;


    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.taskHistory = new ArrayList<>();
    }

    public void addTask(String description, String deadline, int priority) {
        this.tasks.add(new Task(description, deadline, priority));
        this.taskHistory.add("Added task: " + description);

    }

    public void registerEmployee(String name, String id) {
        this.employees.add(new Employee(name, id));
        this.taskHistory.add("Registered employee: " + name);
    }

    public void assignTask(String id, String description) {
        
        Task task = getTaskByDescription(description);

        if (task != null) {
            task.assignTo(id);
            this.taskHistory.add("Assigned task: " + description +" to "+ id);
        }

    }

    public void markInProgress(String description) {
        Task task = getTaskByDescription(description);

        if (task != null) {
            task.inProgress(description);
            this.taskHistory.add("Marked task as in progress: " + description);            
        }
    }

    public void markAsCompleted(String description) {
        Task task = getTaskByDescription(description);

        if (task != null) {
            task.isCompleted(description);
            this.taskHistory.add("Marked task as completed: " + description);            
        }
    }

    public ArrayList<Task> viewTasks(String id) {
        ArrayList<Task> result = new ArrayList<>();

        for(Task task : tasks) {
            if (id.equals(task.getAssignedTo())) {
                result.add(task);
            }
        }
        return result;
    }

    public ArrayList<String> viewHistory() {
        return this.taskHistory;
    }

    public Task getTaskByDescription(String description) {
        for(Task task : tasks) {
            if (task.getDescription().equals(description)) {
                return task;
            }
        } 
        return null;
    }


}
