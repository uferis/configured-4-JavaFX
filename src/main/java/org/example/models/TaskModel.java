package org.example.models;

public class TaskModel {
    private String taskTitle;
    private String dueDate;
    private String priority;

    public TaskModel (String taskTitle, String dueDate, String priority) {
        this.taskTitle = taskTitle;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
