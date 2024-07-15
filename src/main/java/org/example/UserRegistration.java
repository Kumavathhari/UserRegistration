package org.example;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        if (lastName != null && lastName.matches("^[A-Z][a-zA-Z]{2,}$")) {
            System.out.println("Last name " + lastName + " is valid.");
        } else {
            System.out.println("Last name " + lastName + " is invalid. The last name must start with a capital letter and have a minimum of 3 characters.");
        }
    }
    }

