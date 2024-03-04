package CWH_Programs;

public class _0_Patterns {
    public static void main(String[] args) {
        // Pattern 1:Complete Square
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 2:Hollow Square
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == (n - 1) || j == (n-1)) {
//                    System.out.print("* ");
//                } else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // Pattern 3:Left Sided Half Pyramid
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 3:Half inverted Pyramid
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 5:Right Sided Half Pyramid
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("  ");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 6:Print the given Pattern
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j+1 + " ");
//            }
//            System.out.println();
//        }

        // Pattern 7:Print the given Pattern
        /*
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= n-1-i; j++) {
//                System.out.print(j+1 + " ");
//            }
//            System.out.println();
//        }

        // Pattern 8:Print the given Pattern
        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         */
//        int n = 6;
//        int k = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(++k + " ");
//            }
//            System.out.println();
//        }

        // Pattern 9:Print the given Pattern
        /*
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */

//        int n = 6;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                if ((i + j) % 2 == 0)
//                    System.out.print("1 ");
//                else
//                    System.out.print("0 ");
//            }
//            System.out.println();
//        }

        // Pattern 10:Print the Butterfly Pattern.
//         *             *
//         * *         * *
//         * * *     * * *
//         * * * * * * * *
//         * * * * * * * *
//         * * *     * * *
//         * *         * *
//         *             *

        /*-------------------------------------------------*/

//        int n = 5;
//        int spaceCount = 0;
//        // upper half
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            spaceCount = i;
//            if (spaceCount != n - 1) {
//                System.out.format("%" + (4 * (n - spaceCount - 1)) + "s", "");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // lower half
//        for (int i = 0; i < n; i++) {
//            for (int j = n - 1; j >= i; j--) {
//                System.out.print("* ");
//            }
//            spaceCount = i;
//            if (spaceCount != 0) {
//                System.out.format("%" + 4 * spaceCount + "s", "");
//            }
//            for (int j = n - 1; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 11:Print the solid rhombus Pattern.

//                  * * * * *
//                * * * * *
//              * * * * *
//            * * * * *
//          * * * * *
        /*----------------------------------------------*/
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            if (i != n - 1) {
//                System.out.format("%" + 2 * (n - i - 1) + "s", "");
//            }
//            for (int j = 0; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 12:Print the Number Pyramid Pattern.

        /*
         *      1
         *     2 2
         *    3 3 3
         *   4 4 4 4
         *  5 5 5 5 5
         */
        /*----------------------------------------------*/
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            if (i != n - 1) {
//                System.out.format("%" + (n - i - 1) + "s", "");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(i + 1 + " ");
//            }
//            System.out.println();
//        }

        // Pattern 13:Print the given Pattern.
        /*
                   1
                 2 1 2
               3 2 1 2 3
             4 3 2 1 2 3 4
           5 4 3 2 1 2 3 4 5
        */
        /*----------------------------------------------*/
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            if (i != n - 1) {
//                System.out.format("%" + 2 * (n - i - 1) + "s", "");
//            }
//            for (int j = i; j >= 0; j--) {
//                System.out.print(j + 1 + " ");
//            }
//            for (int j = 1; i != 0 && j <= i; j++) {
//                System.out.print(j + 1 + " ");
//            }
//            System.out.println();
//        }

        // Pattern 14:Print the Diamond Pattern.
        /*
         *
         * * *
         * * * * *
         * * * * * * *
         * * * * * * * * *
         * * * * * * *
         * * * * *
         * * *
         *
         */
        /*----------------------------------------------*/

//        int n = 5;
//        // Upper half
//        for (int i = 0; i < n; i++) {
//            if (i != n - 1) {
//                System.out.format("%" + 2 * (n - i - 1) + "s", "");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; i != 0 && j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // Lower Half
//        for (int i = 0; i < n - 1; i++) {
//            System.out.format("%" + 2 * (i + 1) + "s", "");
//            for (int j = n - 1; j > i; j--) {
//                System.out.print("* ");
//            }
//            for (int j = n - 2; j > i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

                





    }
}



