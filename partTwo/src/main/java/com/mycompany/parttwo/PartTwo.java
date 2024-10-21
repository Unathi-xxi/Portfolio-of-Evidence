/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parttwo;

/**
 *
 * @author Admin
 */

//improved 3rd try
import javax.swing.*;
import java.util.ArrayList;

public class PartTwo {

    static ArrayList<Task> tasks = new ArrayList<>();
    static int totalHours = 0;

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            String choice = JOptionPane.showInputDialog(null,
                    "Select an option:\n1. Add Task\n2. Show Report\n3. Quit", "Task Menu", JOptionPane.QUESTION_MESSAGE);

            switch (choice) {
                case "1":
                    addTasks(); // Call method to add tasks
                    break;

                case "2":
                    showReport(); // Call method to show report
                    break;

                case "3":
                    running = false; // Quit the application
                    JOptionPane.showMessageDialog(null, "Total hours for all tasks: " + totalHours + " hours");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }

    // Method to add tasks
    private static void addTasks() {
        try {
            String numTasksStr = JOptionPane.showInputDialog("How many tasks would you like to add?");
            int numTasks = Integer.parseInt(numTasksStr);

            for (int i = 0; i < numTasks; i++) {
                String taskName = JOptionPane.showInputDialog("Enter task name:");

                String taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
                if (taskDescription.length() > 50) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
                    i--; // Let user re-enter task
                    continue;
                } else {
                    JOptionPane.showMessageDialog(null, "Task successfully captured.");
                }

                String developerDetails = JOptionPane.showInputDialog("Enter developer's full name:");

                String taskDurationStr = JOptionPane.showInputDialog("Enter task duration (hours):");
                int taskDuration = Integer.parseInt(taskDurationStr);

                // Manual input for task status
                String taskStatus = JOptionPane.showInputDialog(null,
                        "Enter task status:\n1. To Do\n2. Doing\n3. Done", "Task Status", JOptionPane.QUESTION_MESSAGE);

                switch (taskStatus) {
                    case "1":
                        taskStatus = "To Do";
                        break;
                    case "2":
                        taskStatus = "Doing";
                        break;
                    case "3":
                        taskStatus = "Done";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid status. Defaulting to 'To Do'.");
                        taskStatus = "To Do";
                        break;
                }

                // Create Task object
                Task task = new Task(taskName, i + 1, taskDescription, developerDetails, taskDuration, taskStatus);
                tasks.add(task);

                // Add duration to total hours
                totalHours += task.returnTotalHours();

                // Show task details after entry
                JOptionPane.showMessageDialog(null, task.printTaskDetails());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    // Method to show report 
    private static void showReport() {
        JOptionPane.showMessageDialog(null, "Report feature coming soon.");
    }
}

// Task class
class Task {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskStatus;
    private String taskID;

    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
    }

    // Method 1 Checks the task description length
    public boolean checkTaskDescription() {
        return this.taskDescription.length() <= 50;
    }

    // Method 2 Creates the Task ID
    public String createTaskID() {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(0, 3).toUpperCase();
    }

    // Method 3 Prints the task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Task Duration: " + taskDuration + " hours\n";
    }

    // Method 4 Returns the total hours
    public int returnTotalHours() {
        return this.taskDuration;
    }
}