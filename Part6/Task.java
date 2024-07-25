package Part6;

public class Task {
    private String description;
    private String deadline;
    private int priority;
    private String status;
    private String assignedTo;


    public Task(String description, String deadline, int priority) {
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.status = "not assigned";
        this.assignedTo = null;
    }

    public void assignTo(String id) {
        this.assignedTo = id;
        this.status = "Assigned";
    }

    public void inProgress(String description) {
        this.status = "in progress";
    }

    public void isCompleted(String description) {
        this.status = "completed";
    }

    public String getDescription() {
        return description;
    }


    public String getAssignedTo() {
        return assignedTo;
    }

    public String getStatus() {
        return status;
    }

    
}
