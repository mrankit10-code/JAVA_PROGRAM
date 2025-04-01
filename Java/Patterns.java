// Solid Rectangle
// *****
// *****
// *****
// *****
// class Patterns {
// public static void main(String[] args) {

// for (int i = 1; i <= 4; i++) {
// for (int j = 1; j <= 5; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// Hollow Rectangle
// * * * *
// * *
// * *
// * *
// * * * *

// class Patterns {
// public static void main(String[] args) {
// int n = 5;
// int m = 4;

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= m; j++) {
// if (i == 1 || j == 1 || i == n || j == m) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// Half Pyramid
// *
// * *
// * * *
// * * * *

// class Patterns {
// public static void main(String[] args) {
// int n = 4;

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }
// System.out.println();
// }
// }
// }

// Inverted half Pyramid
// * * * *
// * * *
// * *
// *

// class Patterns {
// public static void main(String[] args) {
// int n = 4;

// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }
// System.out.println();
// }
// }
// }

// Inverted Half Pyramid (rotated by 180 degree)
// *
// * *
// * * *
// * * * *

// class Patterns {
// public static void main(String[] args) {
// int n = 4;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print(" *");
// }
// System.out.println();
// }
// }
// }

// Half Pyramid with Number
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// class Patterns {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// Inverted Half Pyramid with number
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// class Patterns {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// Floyd's Triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// class Patterns {
// public static void main(String[] args) {
// int n = 5;
// int number = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(number + " ");
// number++; //number = number + 1
// }
// System.out.println();
// }
// }
// }

// 0-1 triangle
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// class Patterns {

// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// int sum = i + j;
// if (sum % 2 == 0) {
// System.out.print("1 ");
// } else {
// System.out.print("0 ");
// }
// }
// System.out.println();
// }
// }
// }

// Butterfly Pattern
// * *
// ** **
// *** ***
// **** ****
// **********
// **********
// **** ****
// *** ***
// ** **
// * *
// class Patterns {

// public static void main(String[] args) {
// int n = 5;
// // upper Hlaf
// for (int i = 1; i <= n; i++) {
// // 1st part(*)
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// // Space(" ")
// int spaces = 2 * (n - i);
// for (int j = 1; j <= spaces; j++) {
// System.out.print(" ");
// }
// // 2nd part
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// // lower Hlaf
// for (int i = n; i >= 1; i--) {
// // 1st part(*)
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// // Space(" ")
// int spaces = 2 * (n - i);
// for (int j = 1; j <= spaces; j++) {
// System.out.print(" ");
// }
// // 2nd part
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// solid rohombus

// ____*****
// ___*****
// __*****
// _*****
// *****

// public class Patterns {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print("_");
// }
// for (int j = 1; j <= 5; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

//Number Pyramid
// ____1_
// ___2_2_
// __3_3_3_
// _4_4_4_4_
// 5_5_5_5_5_

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("_");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + "_");
//             }
//             System.out.println();
//         }
//     }
// }

//Palindromic pattern
// ________1_
// ______2_1_2_
// ____3_2_1_2_3_
// __4_3_2_1_2_3_4_
// 5_4_3_2_1_2_3_4_5_

// public class Patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("__");
//             }
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j + "_");
//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j + "_");
//             }
//             System.out.println();
//         }
//     }
// }

//Diamond Pattern
// ___*
// __***
// _*****
// *******
// *******
// _*****
// __***
// ___*

public class Patterns {
    public static void main(String[] args) {
        int n = 4;

        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_");
            }
            // Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_");
            }
            // Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
