// import java.util.*;

// public class condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Age : ");
//         int age = sc.nextInt();
//         if (age >= 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("Not Adult");
//         }
//         sc.close();
//     }

// }

// import java.util.*;

// public class condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number 1 : ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter Number 2 : ");
//         int num2 = sc.nextInt();
//         if (num1 == num2) {
//             System.out.println("Both numbers are Equal");
//         } else if (num1 > num2) {
//             System.out.println("number 1 is greater than number 2");
//         } else {
//             System.out.println("number 2 is greater than number 1");
//         }
//         sc.close();
//     }

// }

import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Button : ");
        int Button = sc.nextInt();

        if (Button == 1) {
            System.out.println("Hello");
        } else if (Button == 2) {
            System.out.println("Namaste");
        } else if (Button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}