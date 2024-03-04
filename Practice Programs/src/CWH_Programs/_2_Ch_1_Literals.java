package CWH_Programs;

import java.util.Scanner;

public class _2_Ch_1_Literals {
    public static void main(String[] args) {
//        byte age = 45;
//        short sh = 4565;
//        char ch = 'A';
//        double d1 = 4.515d;
//        float f1 = 5.5f;
//        boolean a = true;
//        Literals are the constant values assigned to the variables.
//        eg - 45,'A', 4.515d, 5.5F, true, 4565 etc.

//      Student Marks and Percentage Calculator
//      ________________________________________________________________________________________________________________
        System.out.print("Enter total marks of the subject : ");
        Scanner sc1 = new Scanner(System.in);
        float Max_Marks = sc1.nextFloat();
        float []marks = new float[10];
        for(int i=0;i<5;i++){
            System.out.print("Enter your marks in Subject" + (i+1) + " : ");
            Scanner sc = new Scanner(System.in);
            marks[i] = sc.nextInt();
        }
        float T_obt_marks = 0;
        for(int i=0;i<5;i++){
            T_obt_marks = T_obt_marks+marks[i];
        }
        float percentage=((T_obt_marks/(Max_Marks*5)) * 100);
        System.out.println("Total marks obtained out of 500 is : " + T_obt_marks);
        System.out.println("Your percentage is : " + percentage + "%");
//      ----------------------------------------------------------------------------------------------------------------
//      Conversion from Km to miles.
//        System.out.println("Enter a value in km : ");
//        Scanner sc = new Scanner(System.in);
//        float val = sc.nextFloat();
//        float converted_val = val/1.61f;
//        System.out.println("Value in miles : " + converted_val);
//      ----------------------------------------------------------------------------------------------------------------
//        Checking entered number is an integer or not.
//          System.out.println("Enter your number : ");
//          Scanner sc1 = new Scanner(System.in);
//          System.out.println(sc1.hasNextInt());
//      ----------------------------------------------------------------------------------------------------------------





    }
}
