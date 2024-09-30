/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog1;

/*import java.util.Scanner;

public class PROG1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // Registration process
        System.out.println("\nRegister your Account into the system");

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String userName = registerUser(scanner, firstName, lastName);

        String passWord = createPassword(scanner);

        // Login process
        System.out.println("\nLog into your account");
        boolean loggedIn = performLogin(scanner, userName, passWord);

        if (loggedIn) {
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again!");
        }
        else {
            System.out.println("Username or password incorrect,try again.");
            loggedIn = performLogin(scanner, userName, passWord); // Allow user to re-enter login details
            if (loggedIn) {
                System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again!");
            }
        }
    }

    private static String registerUser(Scanner scanner, String firstName, String lastName) {
        String userName;
        while (true) {
            System.out.println("Enter your username (must contain an underscore and be no more than 5 characters): ");
            userName = scanner.nextLine();

            if (checkUserName(userName)) {
                System.out.println("Username successfully captured");
                break;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore '_' and is no more than 5 characters in length.");
            }
        }
        return userName;
    }

    private static String createPassword(Scanner scanner) {
        String passWord;
        while (true) {
            System.out.println("Enter your password (must be at least 8 characters long, contain a capital letter, a number, and a special character): ");
            passWord = scanner.nextLine();

            if (passwordComplexity(passWord)) {
                System.out.println("Password successfully captured");
                break;
            } else {
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            }
        }
        return passWord;
    }

    private static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    private static boolean passwordComplexity(String password) {
        return password.length() >= 8 &&
                containsUpperCase(password) &&
                containsNumber(password) &&
                containsSpecialCharacter(password);
    }

    private static boolean containsUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean performLogin(Scanner scanner, String userName, String passWord) {
        System.out.print("Enter your username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String loginPassword = scanner.nextLine();

        return loginUser(loginUsername, loginPassword, userName, passWord);
    }

    private static boolean loginUser(String loginUsername, String loginPassword, String storedUsername, String storedPassword) {
        return storedUsername.equals(loginUsername) && storedPassword.equals(loginPassword);
    }
}*/

import java.util.Scanner;

public class PROG1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        // Registration process
        System.out.println("\nRegister your Account into the system");

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String userName = registerUser(scanner, firstName, lastName);

        String passWord = createPassword(scanner);

        // Login process
        System.out.println("\nLog into your account");
        boolean loggedIn = performLogin(scanner, userName, passWord);

        if (loggedIn) {
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again!");
        }
        else {
            System.out.println("Username or password incorrect, try again.");
            loggedIn = performLogin(scanner, userName, passWord); // Allow user to re-enter login details
            if (loggedIn) {
                System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again!");
            }
        }
    }

    public static String registerUser(Scanner scanner, String firstName, String lastName) {
        String userName;
        while (true) {
            System.out.println("Enter your username (must contain an underscore and be no more than 5 characters): ");
            userName = scanner.nextLine();

            if (checkUserName(userName)) {
                System.out.println("Username successfully captured");
                break;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore '_' and is no more than 5 characters in length.");
            }
        }
        return userName;
    }

    public static String createPassword(Scanner scanner) {
        String passWord;
        while (true) {
            System.out.println("Enter your password (must be at least 8 characters long, contain a capital letter, a number, and a special character): ");
            passWord = scanner.nextLine();

            if (passwordComplexity(passWord)) {
                System.out.println("Password successfully captured");
                break;
            } else {
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            }
        }
        return passWord;
    }

    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean passwordComplexity(String password) {
        return password.length() >= 8 &&
                containsUpperCase(password) &&
                containsNumber(password) &&
                containsSpecialCharacter(password);
    }

    public static boolean containsUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean performLogin(Scanner scanner, String userName, String passWord) {
        System.out.print("Enter your username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String loginPassword = scanner.nextLine();

        return loginUser(loginUsername, loginPassword, userName, passWord);
    }

    public static boolean loginUser(String loginUsername, String loginPassword, String storedUsername, String storedPassword) {
        return storedUsername.equals(loginUsername) && storedPassword.equals(loginPassword);
    }
}
