// Input - Output , Variable and Data Types

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from Java!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Your name is : " + name);

        // calculate the area of rectangle ask user for the length and width
        System.out.print("Enter length of the rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter width of the rectangle : ");
        float width = sc.nextFloat();

        float area = length * width;
        System.out.println("Area of the rectangle is " + area);

        sc.close();

    }
}