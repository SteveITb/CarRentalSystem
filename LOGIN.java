
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login.program;

/**
 *
 * @author STUDENT
 */

import java.io.Console;
public class LOGIN {

   
    public static void main(String[] args) {
        // TODO code application logic here
        String correctUser = "admin";
        String correctPass = "1234";
        int attempts = 0;

        Console console = System.console();
        if (console == null) {
            System.out.println("No console available. Run in terminal.");
            return;
        }

        while (attempts < 3) {
            String username = console.readLine("Enter username: ");
            char[] passwordArray = console.readPassword("Enter password: ");
            String password = new String(passwordArray);

            if (username.equals(correctUser) && password.equals(correctPass)) {
                System.out.println("Login successful!");
                return;
            } else {
                System.out.println("Invalid username or password.");
                attempts++;
            }
        }
        System.out.println("Too many attempts. Access denied.");
    }
}



