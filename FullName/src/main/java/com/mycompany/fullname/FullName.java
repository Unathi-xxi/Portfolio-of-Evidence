/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fullname;

/**
 *
 * @author Admin
 */
import java.util.Scanner; //This will enable the user to input values
public class FullName {
 
public static void main(String[] args) {
 
Scanner input= new Scanner(System.in);
 
//The next lines of code will declare all the details
 
String myName, mySurname, myEmail, myContact; 
 
 
//The next lines of code will prompt user to enter their details
 
System.out.println("Please enter your name:");
 
myName= input.next();
 
System.out.println("Please enter your surname:");
 
mySurname= input.next();
 
System.out.println("Please enter your email address:");
 
myEmail= input.next();
 
System.out.println("Please enter your phone number:");
 
myContact= input.next();
 
 
/*The next lines of code will tell the system to print all the information entered by
the user*/
 
System.out.println("Full name: " + myName + " " + mySurname);
 
System.out.println("Email address: " + myEmail);
 
System.out.println("Phone number: " + myContact);
 
}
}


