// public class Arrays {
//     public static void main(String[] args) {
//         // Square bracket aage bhi lagya jaa sakta or baad mei bhi lagya jaa sakta hai
//         int marksResult[] = new int[3]; // Defining an array (1st type)
//         // int[] marksResult = new int[3]; 
//         // int marksResult[] = {97, 95, 89};

//         marksResult[0] = 90; // phy
//         marksResult[1] = 95; // math
//         marksResult[2] = 89; // chem

//         // System.out.println("PHYSICS : " + marksResult[0]);
//         // System.out.println("MATH : " + marksResult[1]);
//         // System.out.println("CHEMISTRY : " + marksResult[2]);

//         for (int i = 0; i < 3; i++) {
//             System.out.println(marksResult[i]); // using loop for print marks
//         }
//     }
// }

// import java.util.Scanner;

// public class Arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt(); // use for taking size of array(input)

//         int numbers[] = new int[size];
//         for (int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt(); // use for value input in index
//         }
//         for (int i = 0; i < size; i++) {
//             System.out.println(numbers[i]); // use for runt until array size

//         }
//     }
// }

// Take an array as input from the user.Search for a given number X and print
// the index at which it occurs.

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("X found at index : " + i);
            }
        }
    }
}