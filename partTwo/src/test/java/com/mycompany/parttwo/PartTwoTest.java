/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.parttwo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class PartTwoTest {

    private Task task1, task2;

    // Test data
    @Before
    public void setUp() {
        task1 = new Task("Login Feature", 1, "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        task2 = new Task("Add Task Feature", 2, "Create Add Task feature to add task users", "Mike Smith", 10, "Doing");
    }

    // Test 1: Task Description Length
    @Test
    public void testDescriptionLength() {
        // Test a valid description length
        assertTrue("Task description within limit", task1.checkTaskDescription());
        assertEquals("Task successfully captured", task1.checkTaskDescription(), true);

        // Test an invalid description
        Task invalidTask = new Task("Feature", 1, "This description is way too long for the task, more than 50 characters", "Developer", 5, "To Do");
        assertFalse("Task description exceeds 50 characters", invalidTask.checkTaskDescription());
        assertEquals("Please enter a task description of less than 50 characters", invalidTask.checkTaskDescription(), false);
    }

    // Test 2: Task ID Generation
    @Test
    public void testTaskIDGeneration() {
        String expectedTaskID1 = "LO:1:HAR"; // Task ID: LO:1:HAR
        assertEquals("Correct Task ID generated for task1", expectedTaskID1, task1.createTaskID());

        String expectedTaskID2 = "AD:2:SMI"; // Task ID: AD:2:SMI
        assertEquals("Correct Task ID generated for task2", expectedTaskID2, task2.createTaskID());
    }

    // Test 3: Total Hours Calculation
    @Test
    public void testTotalHours() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);

        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.returnTotalHours();
        }

        assertEquals("Total hours should be 18", 18, totalHours);
    }

    // Test 4: Looped TaskID Test
    @Test
    public void testLoopedTaskID() {
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Admin Feature", 1, "Admin functionality", "Byron Scott", 10, "Done"));
        taskList.add(new Task("Create Report", 0, "Generate reports", "Ike Johnson", 12, "To Do"));

        String expectedTaskID1 = "AD:1:BYR"; // AD:1:BYR
        String expectedTaskID2 = "CR:0:IKE"; // CR:0:IKE

        assertEquals("Correct Task ID for first task in loop", expectedTaskID1, taskList.get(0).createTaskID());
        assertEquals("Correct Task ID for second task in loop", expectedTaskID2, taskList.get(1).createTaskID());
    }

    // Additional test for loop of tasks with durations
    @Test
    public void testLoopedTaskHours() {
        int[] taskDurations = {10, 12, 55, 11, 1}; // Task durations
        int totalHours = 0;

        for (int duration : taskDurations) {
            totalHours += duration;
        }

        assertEquals("Total hours for looped tasks should be 89", 89, totalHours);
    }
}