/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parttwo;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */





//improved 3rd try
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
                case "1" -> addTasks(); // Call method to add tasks

                case "2" -> showReport(); // Call method to show report

                case "3" -> {
                    running = false; // Quit the application
                    JOptionPane.showMessageDialog(null, "Total hours for all tasks: " + totalHours + " hours");
                }

                default -> JOptionPane.showMessageDialog(null, "Invalid option. Please enter 1, 2, or 3.");
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
                    case "1" -> taskStatus = "To Do";
                    case "2" -> taskStatus = "Doing";
                    case "3" -> taskStatus = "Done";
                    default -> {
                        JOptionPane.showMessageDialog(null, "Invalid status. Defaulting to 'To Do'.");
                        taskStatus = "To Do";
                    }
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
