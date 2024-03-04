package CWH_Programs;

public class _12_Methods {

    enum colour {
        Blue, GREEN, RED;
    }

    ////Methods---------------------------------------------------------------------------------------------------------
    static float avg(int a, int b) {
        return (float) (a + b) / 2;
    }

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    /*
    return 5 * fact(4) => 120
    return 4 * fact(3) => 24
    return 3 * fact(2) => 6
    return 2 * fact(1) => 2 {fact(1) = 1}
    */

    static double cel_To_Far(double temp) {
        return (temp * (9 / 5f)) + 32;
    }

    static double far_To_Cel(double temp) {
        return (temp - 32) / (9 / 5f);
    }

    static void pattern_3(int n){
        int dec, val;
        for (int i = 0; i < n; i++) {
            val = i + 1;
            dec = n - 1;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(val + " ");
                val += dec;
                dec--;
            }
            System.out.println();
        }
    }
    static void pattern_4(int n){
        int x = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                x = 0;
                for (int k = 0; k < j; k++) {
                    x += n - k;
                }
                if (j % 2 == 0)
                    System.out.print(x + i + 1 - j + " ");
                else
                    System.out.print(x + n - i + " ");
            }
            System.out.println();
        }
    }



//// Method Overloading---------------------------------------------------------------------------------------------

    /* NOTE
     * if u define method with same number of parameter but changed the return
     * type then it will not work and throw errors, its only possible if all
     * the methods have different parameters.
     */
    static void foo() {
        System.out.println("Good Morning");
    }

    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " " + b);
    }

    static int foo(int a, int b, int c) {
        System.out.println("Good Morning " + a + " " + b + " " + c);
        return 0;
    }

    static int foo(int a, float b) {
        System.out.println("Good Morning " + a + " " + b);
        return 0;
    }

    static int change(int[] arr) {
        arr[0] = 50;
        return 0;
    }

    static int change(int arr) {
        arr = 50;
        return 0;
    }

    //// Recursion------------------------------------------------------------------------------------------------------
    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        int nth = fibonacci(n - 1) + fibonacci(n - 2);
        return nth;
    }

    static int sumNaturalNo(int n) {
        if (n == 1)
            return 1;
        return n + sumNaturalNo(n - 1);
    }

    static void pattern_1(int n) {
        if (n > 0) {
            pattern_1(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
            pattern_2(n - 1);
        }
    }

//    Explanation
    /*
     * Factorial------------|
     * 5
     * 4 // n = 120
     * 3 // n = 30
     * 2 // n = 10
     * 1 // n = 5
     * 0 //
     * fibonacci------------|
     * nth = (n-1) + (n-2)
     */

    //// Driver Code--------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
//--------ENUM
//        colour c1 = colour.RED;
//        colour c2 = colour.Blue;
//        colour c3 = colour.GREEN;
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);

//--------Methods
//        int a = 10;
//        int b = 50;
//        int c = logic(a, b);
//        System.out.printf("c : %d\n", c);
//        System.out.println("Average = " + avg(a, b));
//        System.out.println(cel_To_Far(37) + " F");
//        System.out.println(far_To_Cel(98.6) + " C");
//        pattern_3(5);
//        pattern_4(5);


//--------Method Overloading
//        foo();
//        foo(5,10);
//        foo(5,10,15);
//        foo(5,3.14f);

//        int[] arr = {52, 73, 77, 89, 98, 94};
//        change(arr);
//        System.out.println("The value of arr[0] after running the change function is : " + arr[0]);


//--------Recursion
//        System.out.println(fact(7));
//        System.out.println("nth term is : " + fibonacci(5));
//        System.out.println(sumNaturalNo(10));

//        pattern_1(5);
//        System.out.println();
//        pattern_2(5);

    }
}

/*
Patterns
--------
row = 4
col = 4
   0_1_2_3
0| 1
1| 2 5
2| 3 6 8
3| 4 7 9 10
    3 2 1
------------------------------------------
row = 5
col = 5
   0_1_2__3__4
0| 1            |last digit of column difference
                |1 2 3 4 |{Columns}
1| 2 9          |4
2| 3 8 10       |3 1
3| 4 7 11 14    |2 2 2
4| 5 6 12 13 15 |1 3 1 2

*/
