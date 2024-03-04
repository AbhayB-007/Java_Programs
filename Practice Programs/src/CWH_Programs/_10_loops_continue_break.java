package CWH_Programs;
import java.util.Scanner;

public class _10_loops_continue_break {
    public static void main(String[] args) {
////      For loop
//        for (int i = 0; i < 10; i++)
//            {
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2)
//            {
//                System.out.println("ending the loop");
////                break;
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//        }

//        Enhanced For Loop
//        String []array ={"Ron", "Harry", "Hermoine"};
//        for(String i : array)
//        {
//            System.out.println(i);
//        }

////      while loop
//        int i=0;
//        while(i<10)
//        {
//            i++;
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2)
//            {
//                System.out.println("ending the loop");
////                break;
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//        }

////      do-while loop
//        do
//        {
//            i++;
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2)
//            {
//                System.out.println("ending the loop");
////                break;
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//        }while(i<10);
////--------------------------------------------------------------------------------------------------------------------
//        Practice Set
// Q1. draw a pattern like this?
// *****
// ****
// ***
// **
// *

//        int i, j=0;
//        System.out.print("Enter the number of rows : ");
//        Scanner scan = new Scanner(System.in);
//        i = scan.nextInt();

////        solve by For loop
//      for(int k=0;k<i;k++)
//      {
//          for (j=i;j>k;j--)
//          {
//              System.out.print("*");
//          }
//          System.out.println();
//      }

////        solve by while loop
//        j=0;
//        while(i>0)
//        {
//            while(j<i)
//            {
//                System.out.print("*");
//                j++;
//            }
//            j=0;
//            System.out.println();
//            i--;
//        }

//// Q2. sum of first n even numbers using while loop?

//        int i = 0, n, sum = 0;
//        System.out.print("Enter how many first even numbers you want to add : ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        while(n>0){
//            sum+=(i*2);
//            i++;
//            n--;
//        }
//        System.out.println("Sum : " + sum);

//// Q3. Print Multiplication table of a given number?

//        int n;
//        System.out.print("Enter the number to get its Multiplication Table : ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for(int i = 0;i<10;i++){
//            System.out.printf("%d X %d = %d \n",n,i+1,n*(i+1));
//        }

//// Q4. Print Multiply table in reverse order?

//        int n;
//        System.out.print("Enter the number to get its Multiplication Table in reverse order : ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for(int i = 10;i>0;i--){
//            System.out.printf("%d X %d = %d \n",n,i,n*(i));
//        }

//// Q5. Find factorial of a given number?

//        int n, temp, fact = 1;
//        System.out.print("Enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        temp = n;

//// Using For Loop
//        for(int i = 0;i<n;i++){
//            fact = (n-i)*fact;
//        }

// Q6. Now using While Loop.
//        while(n>0){
//            fact = fact*n;
//            n--;
//        }
//        System.out.printf("Factorial of %d : %d\n",temp,fact);

////Q7 Sum of the numbers in a multiplication table.

//        int n, sum=0;
//        System.out.print("Enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for(int i = 1;i<=10;i++){
//            sum +=(i*n);
//        }
//        System.out.printf("Sum is : %d",sum);

    }
}