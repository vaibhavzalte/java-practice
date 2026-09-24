package com.uv.practice_java.patterns;


public class PatternsSolution {
    public static void main(String[] args) {
        pattern(5);
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

    /*
    ## 6. Reverse Palindrome Number Pyramid
    Input: n = 5
    Output:
    ```text
    123454321
    -1234321
    --12321
    ---121
    ----1
    ```
    */
    public static void pattern6(int n) {
        for (int r = 1; r <= n; r++) {
            // spaces
            for (int i = r - 1; i >= 1; i--) {
                System.out.print(" ");
            }
            // 1 to n-r+1
            for (int i = 1; i <= n - r + 1; i++) {
                System.out.print(i);
            }
            // n-r to 1 printing
            for (int i = n - r; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

/*
## 7. Diamond Number Pattern
Input: n = 5
Output:
```text
----1
---212
--32123
-4321234
543212345
-4321234
--32123
---212
----1
```
*/
    public static void pattern7(int n){
        // Upper half
        for (int r = 1; r <= n; r++) {
            //space n-1 to 0
            for (int i = 1; i <= n-r ; i++) {
                System.out.print(" ");
            }
            // r to 1
            for (int i = r; i >=1 ; i--) {
                System.out.print(i);
            }

            // 1 to r-1
            for (int i = 2; i <= r ; i++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
        for (int r = 1; r < n ; r++) {
            // space 1 to r
            for (int i = 1; i <= r; i++) {
                System.out.print(" ");
            }
            // n-r to 1
            for (int i = n-r; i >=1 ; i--) {
                System.out.print(i);
            }
            // 2 to r
            for (int i = 2; i <=n-r ; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
    ## 8. Hollow Diamond Number Pattern
        Input: n = 5
        Output:
        1
       2 2
      3   3
     4     4
    5       5
     4     4
      3   3
       2 2
        1
     */
    public static void pattern8(int n) {
        for (int r = 1; r <= n; r++) {
            // spaces
            for (int i = n - r; i >= 1; i--) {
                System.out.print(" ");
            }
            // r to 1 print r only other wise space
            for (int i = r; i >= 1; i--) {
                if (r == i)
                    System.out.print(r);
                else
                    System.out.print(" ");
            }
            // print 2 to r and print only r other wise " "
            for (int i = 2; i <= r; i++) {
                if (r == i) System.out.print(r);
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int r = 1; r < n; r++) {
            // spaces
            for (int i = 1; i <= r; i++) {
                System.out.print(" ");
            }
            // n-r to 1 print (n-r) only other wise space
            for (int i = n - r; i >= 1; i--) {
                if (n - r == i)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            // print 2 to r and print only r other wise " "
            for (int i = 2; i <= n - r; i++) {
                if (n - r == i) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
## 9. Number Diamond With Increasing Sequence
Input: n = 5
Output:
----1
---123
--12345
-1234567
123456789
-1234567
--12345
---123
    1
     */
    public static void pattern9(int n) {
        for (int r = 1; r <= n; r++) {
            // spaces
            for (int i = 1; i <= n - r; i++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int i = 1; i <= r; i++) {
                System.out.print(i);
                k++;
            }
            // print r-1 elements
            for (int i = 1; i <= r - 1; i++) {
                System.out.print(k++);
            }
            System.out.println();
        }
        for (int r = 1; r < n; r++) {
            // spaces
            for (int i = 1; i <= r; i++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int i = 1; i <= n - r; i++) {
                System.out.print(i);
                k++;
            }
            // print r-1 elements
            for (int i = 1; i < n - r; i++) {
                System.out.print(k++);
            }
            System.out.println();
        }
    }

    /*
    10. Number Pyramid
        Input: n = 5
        Output:
        1
       222
      33333
     4444444
    555555555
     */
    public static void pattern10(int n) {
        for (int r = 1; r <= n; r++) {
            // spaces
            for (int i = 1; i <= n - r; i++) {
                System.out.print(" ");
            }
            // print 2 rows time + r-1 times
            for (int i = 1; i <= r; i++) {
                System.out.print(r);
            }
            for (int i = 1; i <= r - 1; i++) {
                System.out.print(r);
            }
            System.out.println();
        }
    }

    /*
    ## 11. Reverse Number Pyramid
    Input: n = 5
    Output:
    555555555
    -4444444
    --33333
    ---222
    ----1
     */
    public static void pattern11(int n) {
        for (int r = n; r >= 1; r--) {
            // spaces (r-1)
            for (int i = r; i < n; i++) {
                System.out.print(" ");
            }
            for (int i = r; i >= 1; i--) {
                System.out.print(r);
            }
            for (int i = r; i > 1; i--) {
                System.out.print(r);
            }
            System.out.println();
        }
    }

    public static void pattern(int n) {

    }
}
