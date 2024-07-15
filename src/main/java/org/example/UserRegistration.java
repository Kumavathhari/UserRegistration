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
    }
    }

