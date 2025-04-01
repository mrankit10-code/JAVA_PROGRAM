import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Use nextLine() to read the full line
        System.out.println("Hello, " + name + "!");
        sc.close(); // Close the Scanner to avoid resource leaks
    }
}