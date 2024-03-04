package CWH_Programs;

import java.util.Scanner;

public class _7_Ch_4_Conditionals {
    public static void main(String[] args) {
//        IF_ELSE STATEMENT
//        System.out.print("Enter your age : ");
//        Scanner scan = new Scanner(System.in);
//        int age = scan.nextInt();
//        if(age<18){
//            System.out.println("You are under 18.");
//        }
//        else if(age==18){
//            System.out.println("You are of 18.");
//        }
//        else {
//            System.out.println("You are above 18.");
//        }

//        SWITCH CASE

        int age;
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("you are of age 18");
                System.out.println("you are of age 18");
                break;

            case 19:
                System.out.println("You are of age 19");
                break;
            case 21:
                System.out.println("You are of age 21");
                break;
            default:
                System.out.println("Not available");
                break;
        }

//        Practice set
//----------------------------------------------------------------------------------------------------------------------
// Q1 :-  int a = 10;
//        if (a=11) //---> It gives Error '=' is used for assignment.
//        {
//            System.out.println( "you are 11");
//        }
//        else
//        {
//            System.out.println( "you are not 11");
//        }
//----------------------------------------------------------------------------------------------------------------------
// Q2:-
//        float eng, math, sst, total, t_percentage;
//        System.out.print("Enter the Maximum Marks :");
//        Scanner sc = new Scanner(System.in);
//        total = sc.nextFloat();
//
//        System.out.print("Enter your obtained marks in English :");
//        Scanner sc1 = new Scanner(System.in);
//        eng = sc1.nextFloat();
//
//        System.out.print("Enter your obtained marks in Maths :");
//        Scanner sc2 = new Scanner(System.in);
//        math = sc2.nextFloat();
//
//        System.out.print("Enter your obtained marks in SST :");
//        Scanner sc3 = new Scanner(System.in);
//        sst = sc3.nextFloat();
//
//
//        t_percentage = (((eng + math + sst) / (total*3)) * 100);
//
//        if(((eng/total)*100)>=33 && ((math/total)*100) >= 33 && ((sst/total)*100) >= 33 && 40<=t_percentage)
//        {
//            System.out.println("Your percentage is : " + t_percentage + "%");
//            System.out.println("You are passed");
//        }
//        else
//        {
//            System.out.println("Your percentage is : " + t_percentage);
//            System.out.println("You are Fail");
//        }
//----------------------------------------------------------------------------------------------------------------------
// Q3:-
//        float income, tax = 0;
//        System.out.print("Enter your annual income in lakhs : ");
//        Scanner sc = new Scanner(System.in);
//        income = sc.nextFloat();
//
//        if(income <= 2.5f)
//        {
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income<=5f)
//        {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income<=10f)
//        {
//            tax = tax + 0.05f * (5f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else
//        {
//            tax = tax + 0.05f * (5f - 2.5f);
//            tax = tax + 0.2f * (10f - 5f);
//            tax = tax + 0.3f * (income - 10f);
//        }
//        System.out.println("Tax to be paid is : " + tax + " L");
//----------------------------------------------------------------------------------------------------------------------
// Q4:-
//        int year;
//        System.out.print("Enter year to check its a leap year or not : ");
//        Scanner scan = new Scanner(System.in);
//        year = scan.nextInt();
//
//        if(year%100==0 && year%400==0 && year%4==0)
//        {
//            System.out.println("'" + year + "' is a leap year");
//        }
//        else
//        {
//            System.out.println("'" + year + "' is not a leap year");
//        }

    }
}
