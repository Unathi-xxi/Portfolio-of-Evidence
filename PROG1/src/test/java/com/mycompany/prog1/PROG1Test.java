/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog1;

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class PROG1Test {
    
    public PROG1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class PROG1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PROG1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class PROG1.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Scanner scanner = null;
        String firstName = "";
        String lastName = "";
        String expResult = "";
        String result = PROG1.registerUser(scanner, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPassword method, of class PROG1.
     */
    @Test
    public void testCreatePassword() {
        System.out.println("createPassword");
        Scanner scanner = null;
        String expResult = "";
        String result = PROG1.createPassword(scanner);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class PROG1.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        boolean expResult = false;
        boolean result = PROG1.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwordComplexity method, of class PROG1.
     */
    @Test
    public void testPasswordComplexity() {
        System.out.println("passwordComplexity");
        String password = "";
        boolean expResult = false;
        boolean result = PROG1.passwordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsUpperCase method, of class PROG1.
     */
    @Test
    public void testContainsUpperCase() {
        System.out.println("containsUpperCase");
        String password = "";
        boolean expResult = false;
        boolean result = PROG1.containsUpperCase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsNumber method, of class PROG1.
     */
    @Test
    public void testContainsNumber() {
        System.out.println("containsNumber");
        String password = "";
        boolean expResult = false;
        boolean result = PROG1.containsNumber(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsSpecialCharacter method, of class PROG1.
     */
    @Test
    public void testContainsSpecialCharacter() {
        System.out.println("containsSpecialCharacter");
        String password = "";
        boolean expResult = false;
        boolean result = PROG1.containsSpecialCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performLogin method, of class PROG1.
     */
    @Test
    public void testPerformLogin() {
        System.out.println("performLogin");
        Scanner scanner = null;
        String userName = "";
        String passWord = "";
        boolean expResult = false;
        boolean result = PROG1.performLogin(scanner, userName, passWord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class PROG1.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String loginUsername = "";
        String loginPassword = "";
        String storedUsername = "";
        String storedPassword = "";
        boolean expResult = false;
        boolean result = PROG1.loginUser(loginUsername, loginPassword, storedUsername, storedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
