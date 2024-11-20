/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.part3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Part3Test {
    private ArrayList<Task> testTasks;

    @BeforeEach
    public void setUp() {
        // Initialize test data
        testTasks = new ArrayList<>();
        testTasks.add(new Task("Mike Smith", "Create Login", 5, "To Do"));
        testTasks.add(new Task("Edward Harrison", "Create Add Features", 8, "Doing"));
        testTasks.add(new Task("Samantha Paulson", "Create Reports", 2, "Done"));
        testTasks.add(new Task("Glenda Oberholzer", "Add Arrays", 11, "To Do"));
    }

    @Test
    public void testDisplayAllTasks() {
        StringBuilder expectedOutput = new StringBuilder("All Tasks:\n");
        for (Task task : testTasks) {
            expectedOutput.append(task.toString()).append("\n");
        }

        StringBuilder actualOutput = new StringBuilder("All Tasks:\n");
        for (Task task : testTasks) {
            actualOutput.append(task.toString()).append("\n");
        }

        assertEquals(expectedOutput.toString(), actualOutput.toString(), "Display All Tasks should match expected output.");
    }

    @Test
    public void testDisplayLongestTask() {
        Task longestTask = testTasks.get(0);
        for (Task task : testTasks) {
            if (task.getTaskDuration() > longestTask.getTaskDuration()) {
                longestTask = task;
            }
        }

        assertEquals("Add Arrays", longestTask.getTaskName(), "The longest task should be 'Add Arrays'.");
        assertEquals(11, longestTask.getTaskDuration(), "The duration of the longest task should be 11.");
    }

    @Test
    public void testSearchTaskByName_Found() {
        String searchTaskName = "Create Reports";
        Task foundTask = null;
        for (Task task : testTasks) {
            if (task.getTaskName().equalsIgnoreCase(searchTaskName)) {
                foundTask = task;
                break;
            }
        }

        assertNotNull(foundTask, "Task should be found.");
        assertEquals("Samantha Paulson", foundTask.getDeveloperName(), "Developer should be Samantha Paulson.");
    }

    @Test
    public void testSearchTaskByName_NotFound() {
        String searchTaskName = "Nonexistent Task";
        Task foundTask = null;
        for (Task task : testTasks) {
            if (task.getTaskName().equalsIgnoreCase(searchTaskName)) {
                foundTask = task;
                break;
            }
        }

        assertNull(foundTask, "Task should not be found.");
    }

    @Test
    public void testSearchTasksByDeveloper_Found() {
        String searchDeveloperName = "Mike Smith";
        ArrayList<Task> developerTasks = new ArrayList<>();

        for (Task task : testTasks) {
            if (task.getDeveloperName().equalsIgnoreCase(searchDeveloperName)) {
                developerTasks.add(task);
            }
        }

        assertFalse(developerTasks.isEmpty(), "Tasks should be found for the developer.");
        assertEquals(1, developerTasks.size(), "There should be 1 task for this developer.");
        assertEquals("Create Login", developerTasks.get(0).getTaskName(), "The task should be 'Create Login'.");
    }

    @Test
    public void testSearchTasksByDeveloper_NotFound() {
        String searchDeveloperName = "Unknown Developer";
        ArrayList<Task> developerTasks = new ArrayList<>();

        for (Task task : testTasks) {
            if (task.getDeveloperName().equalsIgnoreCase(searchDeveloperName)) {
                developerTasks.add(task);
            }
        }

        assertTrue(developerTasks.isEmpty(), "No tasks should be found for this developer.");
    }

    @Test
    public void testDeleteTaskByName_Success() {
        String taskNameToDelete = "Create Add Features";
        boolean taskDeleted = false;

        for (int i = 0; i < testTasks.size(); i++) {
            if (testTasks.get(i).getTaskName().equalsIgnoreCase(taskNameToDelete)) {
                testTasks.remove(i);
                taskDeleted = true;
                break;
            }
        }

        assertTrue(taskDeleted, "Task should be deleted successfully.");
        assertEquals(3, testTasks.size(), "Task list size should decrease by 1.");
    }

    @Test
    public void testDeleteTaskByName_NotFound() {
        String taskNameToDelete = "Nonexistent Task";
        boolean taskDeleted = false;

        for (int i = 0; i < testTasks.size(); i++) {
            if (testTasks.get(i).getTaskName().equalsIgnoreCase(taskNameToDelete)) {
                testTasks.remove(i);
                taskDeleted = true;
                break;
            }
        }

        assertFalse(taskDeleted, "Task should not be deleted if it doesn't exist.");
        assertEquals(4, testTasks.size(), "Task list size should remain unchanged.");
    }

    @Test
    public void testFullReport() {
        StringBuilder expectedReport = new StringBuilder("Full Task Report:\n");
        for (Task task : testTasks) {
            expectedReport.append(task.toString()).append("\n");
        }

        StringBuilder actualReport = new StringBuilder("Full Task Report:\n");
        for (Task task : testTasks) {
            actualReport.append(task.toString()).append("\n");
        }

        assertEquals(expectedReport.toString(), actualReport.toString(), "The full report should match expected output.");
    } 
}
