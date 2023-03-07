package BackEndCoding.JavaCoding.Class;

import java.util.Scanner;
public class gpt {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String username = "admin";
            String password = "password";

            System.out.print("Enter your username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Welcome, " + inputUsername + "!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }

