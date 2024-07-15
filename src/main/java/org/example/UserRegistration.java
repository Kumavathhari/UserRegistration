package org.example;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        if (firstName != null && firstName.matches("^[A-Z][a-zA-Z]{2,}$")) {
            System.out.println("First name " + firstName + " is valid.");
        } else {
            System.out.println("First name " + firstName + " is invalid. The first name must start with a capital letter and have a minimum of 3 characters.");
        }

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        if (lastName != null && lastName.matches("^[A-Z][a-zA-Z]{2,}$")) {
            System.out.println("Last name " + lastName + " is valid.");
        } else {
            System.out.println("Last name " + lastName + " is invalid. The last name must start with a capital letter and have a minimum of 3 characters.");
        }

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        String emailPattern = "^[a-zA-Z0-9._%+-]+[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,6}$";
        if (email != null && email.matches(emailPattern)) {
            System.out.println("Email " + email + " is valid.");
        } else {
            System.out.println("Email " + email + " is invalid. The email must follow the pattern abc.xyz@bl.co.in");
        }
    }
    }

