// this program of java show the use of conditional statements.

import java.util.*;

public class Conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name : ");
        // String name = sc.next();
        // System.out.println("Hi " + name + "!");

        // System.out.print("Enter your age : ");
        // int age = sc.nextInt();
        // if (age < 18) {
        // System.out.println("You are not allowed to vote");
        // } else if (age > 18) {
        // System.out.println("You are allowed to vote");

        // } else {
        // System.out.println("Enter valid input!");
        // }

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Option 1 is selected");
                break;
            case 2:
                System.out.println("You have selected option 2");
                break;
            default:
                System.out.println("Enter valid input only!");
        }

        sc.close();

    }
}
