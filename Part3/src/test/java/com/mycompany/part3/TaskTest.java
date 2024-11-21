/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.part3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testConstructor() {
        Task task = new Task("John Doe", "Task 1", 5, "To Do");

        assertEquals("John Doe", task.getDeveloperName());
        assertEquals("Task 1", task.getTaskName());
        assertEquals(5, task.getTaskDuration());
        assertEquals("To Do", task.getTaskStatus());
    }

    @Test
    public void testToString() {
        Task task = new Task("Jane Smith", "Task 2", 10, "In Progress");

        String expectedString = "Developer: Jane Smith, Task Name: Task 2, Task Duration: 10, Task Status: In Progress";
        assertEquals(expectedString, task.toString());
    }
}
