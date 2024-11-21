/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part3;

/**
 *
 * @author Admin
 */

public class Task {
   
    //The name of the developer
    private final String developerName;
    
    //The name of the task.
    private final String taskName;
    
    //The duration of the task in some hours
    private final int taskDuration;
    
    //The current status of the task (e.g., "To Do", "Doing", "Done") 
    private final String taskStatus;

     /*
     Constructs a new Task object
     developerName- the name of the developer assigned to the task
     taskName- the name of the task
     taskDuration- the estimated duration of the task
     taskStatus- the current status of the task
     */
    public Task(String developerName, String taskName, int taskDuration, String taskStatus) {
        this.developerName = developerName;
        this.taskName = taskName;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
    }

    //Returns the name of the developer assigned to the task
    public String getDeveloperName() {
        return developerName;
    }

    //Returns the name of the task
    public String getTaskName() {
        return taskName;
    }

    //Returns the duration of the task
    public int getTaskDuration() {
        return taskDuration;
    }

    //Returns the current status of the task
    public String getTaskStatus() {
        return taskStatus;
    }

    //Returns a string representation of the task, including its developer, name, duration, and status
    @Override
    public String toString() {
        return "Developer: " + developerName + ", Task Name: " + taskName + ", Task Duration: " + taskDuration + ", Task Status: " + taskStatus;
    }
}
