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
    private final String developerName;
    private final String taskName;
    private final int taskDuration;
    private final String taskStatus;

    // Constructor
    public Task(String developerName, String taskName, int taskDuration, String taskStatus) {
        this.developerName = developerName;
        this.taskName = taskName;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
    }

    // Getters
    public String getDeveloperName() {
        return developerName;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    // Override toString for display
    @Override
    public String toString() {
        return "Developer: " + developerName + ", Task: " + taskName + ", Duration: " + taskDuration + ", Status: " + taskStatus;
    }
}
