package io.angelwing.model;

public class Task {

    private String userName;

    private String taskTitle;

    private String description;

    public Task(){
        //NOOP
    }

    public Task(String userName , String taskTitle , String description){
        this.userName = userName;
        this.taskTitle = taskTitle;
        this.description = description;
    }


    public String getUserName() {
        return userName;
    }


    public String getTaskTitle() {
        return taskTitle;
    }


    public String getDescription() {
        return description;
    }

}
