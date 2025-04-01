import java.util.Scanner;

public class Functions {
    public static void printMyData(String name, int age, int roll_no) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no.: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Use sc.nextLine() if you need full name

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your Roll no.: ");
        int roll_no = sc.nextInt();

        printMyData(name, age, roll_no); // Correct function call

        sc.close(); // Close Scanner to avoid resource leaks
    }
}
