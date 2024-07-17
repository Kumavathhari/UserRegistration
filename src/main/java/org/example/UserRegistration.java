package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        if (isValidFirstName(firstName)) {
            System.out.println("True");
        } else {
            System.out.println("False : The first name must start with a capital letter and have a minimum of 3 characters.");
        }

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        if (isValidLastName(lastName)) {
            System.out.println("True");
        } else {
            System.out.println("False : The last name must start with a capital letter and have a minimum of 3 characters.");
        }

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        if (isValidEmail(email)) {
            System.out.println("True");
        } else {
            System.out.println("False : The email must follow the pattern abc.xyz@bl.co.in");
        }

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();
        if (isValidMobileNumber(mobileNumber)) {
            System.out.println("True");
        } else {
            System.out.println("False : The mobile number must follow the pattern 91 9919819801");
        }

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("True");
        } else {
            System.out.println("False : The password must have a minimum of 8 characters, at least 1 uppercase letter, at least 1 numeric character, and exactly 1 special character.");
        }

        scanner.close();
    }

    public static boolean isValidFirstName(String name) {return name != null && name.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static boolean isValidLastName(String name) {return name != null && name.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[a-zA-Z0-9._%+-]+[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,6}$");
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        return mobileNumber != null && mobileNumber.matches("^[0-9]{2} [0-9]{10}$");
    }

    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[^a-zA-Z0-9].*");
    }


}

