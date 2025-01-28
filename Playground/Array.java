// package Playground;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Take an array as input form the user . Search for a given number x and print
        // the index at which it occurs.

        System.out.print("Enter the size for array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Array of size " + arr.length + " is created successfully");

        System.out.println("Enter the elements of the array as asked below ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search :");
        int elementToSearch = sc.nextInt();

        // searching the element in the array
        for (int i = 0; i < size; i++) {
            if (arr[i] == elementToSearch) {
                System.out.println(elementToSearch + " is found on index : " + i);

            }
        }

        sc.close();

    }

}
