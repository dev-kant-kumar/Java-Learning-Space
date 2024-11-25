import java.util.Scanner;

public class welcome {

    public static void main(String[] args) {
        System.out.println("Welcome to the world of  Java");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String fullName = sc.nextLine();
        System.out.println("Hello " + fullName + " !");

        sc.close();

    }

}
