package com.uv.practice_java.patterns;


public class PatternsSolution {
    public static void main(String[] args) {
        pattern5(5);
    }

    //     Input: n = 5
//
// Output:
//        1
//        12
//        123
//        1234
//        12345
    public static void pattern1(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //    2. Decreasing Number Triangle
//
//    Input: n = 5
//
//    Output:
//
//            12345
//            1234
//            123
//            12
//            1
    public static void pattern2(int n) {
        for (int r = n; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //3. Reverse Number Triangle
//
//    Input: n = 5
//    Output:
//
//            54321
//            4321
//            321
//            21
//            1
    public static void pattern3(int n) {
        for (int r = n; r >= 1; r--) {
            for (int c = r; c >= 1; c--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //4. Increasing Continuous Number Triangle
//
//    Input: n = 5
//
//    Output:
//            1
//            2 3
//            4 5 6
//            7 8 9 10
//            11 12 13 14 15
    public static void pattern4(int n) {
        int k = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    //## 5. Palindrome Number Pyramid
//    Input: n = 5
//    Output:
/*
----1
---121
--12321
-1234321
123454321
 */
    public static void pattern5(int n) {
        for (int r = 1; r <= n; r++) {
            for (int i = n - r; i >= 1; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= r; i++) {
                System.out.print(i);
            }
            for (int i = r - 1; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
