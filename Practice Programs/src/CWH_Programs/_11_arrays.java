package CWH_Programs;

import java.util.*;

public class _11_arrays {

    public static int[] m1(int size) {
        // returning  array
        int[] m2 = new int[size];
        for (int i = 0; i < m2.length; i++) {
            m2[i] = i+1;
        }
        return m2;
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
/*
        * Arrays are used to store elements of same type collectively.
        * If you want to store the marks of 500 students.
        * You have 2 options :
        * 1). Declare and initialise 500 hundred variables.
        * 2). Create an Array of size 500 and store the marks of all students. (recommended)
*/

//        1. Declare and memory allocation
//        int []marks =  new int[5];
//        Initialize
//        marks[0] = 98;
//        marks[1] = 86;
//        marks[2] = 68;
////
//        2. Declare and after then memory allocation
//        int [] marks;
//        marks = new int[5];
//        Initialize
//        marks[0] = 98;
//        marks[1] = 68;
//
//        3. Declare, memory allocation and Initialise all together
//        int [] marks = {45,54,65};
//
//        .length is used to get the length of the array
//        int [] marks = {45,54,65};
//        System.out.println(marks.length);
//        float []marks = {95.5f, 64.5f, 51.2f};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);

////        Using For-each loop to display the array
//        String []array ={"Ron", "Harry", "Hermine"};
//        for(String i : array)
//        {
//            System.out.println(i);
//        }

//        float []marks = {95.5f, 64.5f, 51.2f};
//        for(float elements : marks)
//        {
//            System.out.println(elements);
//        }

////        Multi-Dimensional Arrays

//        int [] marks = new int[5];
//        int [][]flats = new int[2][3];
//        int [][][]arr_3D = new int[3][3][3];
//        for (int i =0;i<3;i++)
//        {
//            for (int j=0;j<3;j++)
//            {
//                for (int k=0;k<3;k++)
//                {
//                    arr_3D[i][j][k] = j+i+k;
//                }
//            }
//        }
//
//        for (int i =0;i<3;i++)
//        {
//            for (int j=0;j<3;j++)
//            {
//                for (int k=0;k<3;k++)
//                {
//                    System.out.printf("[%d %d %d] : %d    ", i, j, k, arr_3D[i][j][k]);
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


//      2D and Jagged Arrays
//        int[][] d = {{1, 2, 3, 4},
//                {5, 6, 7, 8, 9, 20, 30},
//                {9, 10, 11}
//        };
//        int[][] c = {{1, 2, 3, 4},
//                {5, 6, 8},
//                {9, 10, 11, 12, 13}
//        };
//
////        Enhanced For loop
//        for (int[] ints : c) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
////        Normal For loop
//        for (int i = 0; i < d.length; i++) {
//            for (int j = 0; j < d[i].length; j++) {
//                System.out.print(d[i][j] + " ");
//            }
//            System.out.println();
//        }

////      Initialising Arrays using Methods

//        int arr[] = m1(10);
//
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");

////      Copying Array into another array

        int[] a = {1, 8, 7};
        int[] b;
        b = new int[a.length];
//        b=a;  // Assigns a reference of a to b, therefore
//        if any change made to b then will also be
//        reflected in a.(So its not an appropriate method)

//      Appropriate Methods to copy an array elements to another array.
        b = a.clone();    //Assigns the clone of a into b
//        System.arraycopy(a,0,b,0,3);
//        b = Arrays.copyOf(a,3);
//        b = Arrays.copyOfRange(a,1,3);

        b[0]++;
        System.out.print("a : ");
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.print("\nb : ");
        for (int e : b) {
            System.out.print(e + " ");
        }
//----------------------------------------------------------------------------------------------------------------------
//        Practice Set
// Q1.
//        float []arr = {45.5f,54.2f,4.21f,112.5f,78.51f};
//        float sum=0;
//        for(float temp : arr)
//        {
//            sum+=temp;
//        }
//        System.out.println("Sum : " + sum);


// Q2. Check whether given input is present in an array.

//        float []arr = {45.5f,54.2f,4.21f,112.5f,78.51f};
////        float num = scan.nextFloat();
//        float num = 45.5f;
//        boolean isInArray = false;
//        for (float element:arr)
//        {
//            if(num==element)
//            {
//                System.out.println("Hello");
//                isInArray = true;
//                break;
//            }
//        }
//
//        if(isInArray)
//        {
//            System.out.println("Given Input is present in the array.");
//        }
//        else
//        {
//            System.out.println("Given Input is not present in the array.");
//        }

// Q3. Calculate avg of all elements of array using for-each loop.

//        float []marks = {45.5f,54.2f,4.21f,112.5f,78.51f};
//        float sum=0, avg;
//        for(float elements : marks) {
//            sum += elements;
//        }
//        System.out.println("Average : " + sum/marks.length);


// Q4. Add 2 matrices of size (2 X 3)

//        int [][] mat1 = {{1, 2, 3},
//                         {4, 5, 6}};
//        int [][] mat2 = {{1, 2, 3},
//                         {4, 5, 6}};
//        int [][] result = new int[2][3];
//////  For Loop
//        for(int i=0;i<2;i++){
//            for (int j=0;j<3;j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }

// Q5. Write a program to reverse an array.

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int temp, l = arr.length;
//        int n = Math.floorDiv(l, 2); // Assigns the floor value i.e before the decimal pt.
//
//        System.out.print("Original Array : ");
//        for (int i=0;i<l;i++){
//            System.out.print(arr[i] + " ");
//        }
//
//        for(int i = 0;i<n ;i++)
//        {
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//
//        System.out.print("\nReverse Array : ");
//
//        for (int i=0;i<l;i++){
//            System.out.print(arr[i] + " ");
//        }

// Q6. Program to find the max number in an array.

//        int [] arr = {12, 31, 45, 78, 65, 98, 25};
//        int max_num = arr[0];
//        for(int element:arr)
//        {
//            if(element>max_num){
//                max_num=element;
//            }
//        }
//        System.out.println("Max element of array is : " + max_num);

// Q7. Program to find the lowest number in an array.`

//        int [] arr = {12, 31, 45, 78, 65, 98, 25, 1};
//        int min_num = arr[0];
//        for(int element:arr)
//        {
//            if(element<min_num){
//                min_num=element;
//            }
//        }
//        System.out.println("Min element of array is : " + min_num);

// Q8. Check whether an array is sorted.
//        int []arr = {12, 31, 45, 78, 65, 98, 25, 1};
//        int []arr = {1, 31, 45, 78, 86, 98, 125, 1001};
//        boolean IsSorted = true;
//        for(int i=0;i<arr.length - 1;i++)
//        {
//            if(arr[i]>arr[i+1])
//            {
//                IsSorted = false;
//                break;
//            }
//
//        }
//
//        if(IsSorted)
//        {
//            System.out.println("The Array is Sorted.");
//        }
//        else
//        {
//            System.out.println("The Array is not Sorted.");
//        }


    }
}

