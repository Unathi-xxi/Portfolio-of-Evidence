/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part3;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Part3 {
    private static final ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        initializeTestData(); //Fills in the information with sample data.

        boolean isProgramRunning = true;
        while (isProgramRunning) {
            //The following are all the option in the menu that the user can choose from
            String userOptions = """
                          Select an option:
                          1. Display All Tasks
                          2. Display Longest Task
                          3. Search Task by Name
                          4. Search Tasks by Developer
                          5. Delete Task by Name
                          6. Display Full Report
                          7. Exit""";
            String userChoice = JOptionPane.showInputDialog(userOptions);

            switch (userChoice) {
                case "1" -> displayAllTasks();
                case "2" -> displayLongestTask();
                case "3" -> searchTaskByName();
                case "4" -> searchTasksByDeveloper();
                case "5" -> deleteTaskByName();
                case "6" -> displayFullReport();
                case "7" -> {
                    isProgramRunning = false;
                    JOptionPane.showMessageDialog(null, "Exiting application.");
                }
                default -> JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            }
        }
    }

    //Creates sample data
    private static void initializeTestData() {
        tasks.add(new Task("Mike Smith", "Create Login", 5, "To Do"));
        tasks.add(new Task("Edward Harrison", "Create Add Features", 8, "Doing"));
        tasks.add(new Task("Samantha Paulson", "Create Reports", 2, "Done"));
        tasks.add(new Task("Glenda Oberholzer", "Add Arrays", 11, "To Do"));
    }

    //The first option displays all tasks to the user
    private static void displayAllTasks() {
        StringBuilder taskList = new StringBuilder("All Tasks:\n");
        for (Task task : tasks) {
            taskList.append(task.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, taskList.toString());
    }

    //The second option displays longest task to the user
    private static void displayLongestTask() {
        Task longestTask = tasks.get(0);
        for (Task task : tasks) {
            if (task.getTaskDuration() > longestTask.getTaskDuration()) {
                longestTask = task;
            }
        }
        JOptionPane.showMessageDialog(null, "Longest Task:\n" + longestTask.toString());
    }

    //The third option allows user to search task by name
    private static void searchTaskByName() {
        String taskName = JOptionPane.showInputDialog("Enter the task name to search:");
        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                JOptionPane.showMessageDialog(null, "Task Found:\n" + task.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    //The fourth option allows user to search tasks by developer
    private static void searchTasksByDeveloper() {
        String developerName = JOptionPane.showInputDialog("Enter the developer name to search:");
        StringBuilder developerTasks = new StringBuilder("Tasks by " + developerName + ":\n");
        boolean found = false;

        for (Task task : tasks) {
            if (task.getDeveloperName().equalsIgnoreCase(developerName)) {
                developerTasks.append(task.toString()).append("\n");
                found = true;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(null, developerTasks.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found for this developer.");
        }
    }

    // The fifth option allows user to delete a task by name
    private static void deleteTaskByName() {
        String taskName = JOptionPane.showInputDialog("Enter the task name to delete:");
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskName().equalsIgnoreCase(taskName)) {
                tasks.remove(i);
                JOptionPane.showMessageDialog(null, "Task successfully deleted.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    //The sixth option displays the full report to the user
    private static void displayFullReport() {
        StringBuilder report = new StringBuilder("Full Task Report:\n");
        for (Task task : tasks) {
            report.append(task.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, report.toString());
    }
}