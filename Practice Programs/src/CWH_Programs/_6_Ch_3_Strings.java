package CWH_Programs;

import java.util.*;

public class _6_Ch_3_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String _name = "Abhay";
        float b = 6.654123987f;

        /*
        *
        *
        * */

//        System.out.printf("Your name is %s \n", _name);
//        System.out.printf("%15s\n", _name);     // Right Align
//        System.out.printf("%-15s\n", _name);    // Left Align
//        System.out.printf("the value of character is %s\n",ch);
//        System.out.printf("the value of float is : %.1f", b);
//
////        String Methods
        String name = "Harry";
        String name_1 = "HARRY";
////     Length of String
//        int len = name.length();
//        System.out.println("Length of the string : " + len);
//        System.out.println("Length of the string : " + name.length());


////     Upper and Lower case
//        System.out.println(name.toUpperCase());
//        System.out.println(name_1.toLowerCase());

////    valueOf
//        int a = 50;
//        String s1 = String.valueOf(a);
//        System.out.println(s1);

////     Trim
//        String str = "          abhay            ";
//        System.out.println(str);
//        System.out.println(str.trim());

////     Substring
//        System.out.println(name.substring(4));
//        System.out.println(name.substring(1,4));
//
////      replace
//         System.out.println(name.replace('r', 'p'));
//         System.out.println(name.replace("Harry", "Abhay"));
//         System.out.println(name);

////      startsWith and endsWith
//         System.out.println(name.startsWith("Har"));
//         System.out.println(name.endsWith("ry"));

////      (charAt) Returns the character for the corresponding Index
//         System.out.println(name.charAt(0));

////      Index Of
        String name1 = "harryrryrry";
//       System.out.println(name1.indexOf("rry",3 ));
//         System.out.println(name1.lastIndexOf("r"));
//         System.out.println(name1.indexOf("r"));

////      Comparing two strings
        String name2 = "harry";
//         System.out.println(name.equals(name1)); // case Sensitive
//         System.out.println(name.equalsIgnoreCase("HARRY")); //It ignores the Case(Upper/Lower)

//
////      Escape sequence character
//        System.out.println("hello world \n \t I m \"abhay\" ");

//----------------------------------------------------------------------------------------------------------------------

        ////    StringBuffer____________!!
//        1). Used in Multithreading
//        2). used to create mutable strings i.e memory allocated
//        to a string is not fixed, it can change.
//        3). It is synchronous in nature i.e Thread Safe

        StringBuffer s = new StringBuffer("Happy Learning");
        StringBuffer s_1 = new StringBuffer("abhay");
        StringBuffer s_2 = new StringBuffer(""); // 0 characters

        ////    Append
//        System.out.println("Before Append : " + s);
//        s.append("!!!");    // But we cannot do this in case of String
//        System.out.println("After Append : " + s);

        ////    Delete
//        System.out.println("Before Delete : " + s_1);
//        s_1.delete(0, 3);
//        System.out.println("After Delete : " + s_1);

        ////    Replace
//        System.out.println("Before Replace : " + s_1);
//        s_1.replace(0,1,"Abhilash");
//        System.out.println("After Replace : " + s_1);

        ////    Reverse
//        System.out.println("Reversing StringBuffer : " + s.reverse());
//        System.out.println("It effects the original StringBuffer also : " + s);
//        System.out.println("Reversing the reversed StringBuffer : " + s.reverse());
//        System.out.println("It effects the original StringBuffer also : " + s);

        ////    length()
//        System.out.println(s_2.length());

        ////    capacity
        ////    -> StringBuffer has capacity of 32 bytes or
        ////    16 character(i.e each of 2 Bytes) when we create
        ////    its object and when we initialize StringBuffer
        ////    its size = 16 + (no of char in StringBuffer or its length).
//        System.out.println(s.capacity());
//        System.out.println(s_2.capacity());

//----------------------------------------------------------------------------------------------------------------------

        ////      StringBuilder____________!!!
//        1). Used to create mutable strings
//        2). It is Non-synchronized in nature i.e it is not Thread Safe,
//        Therefore it is faster.

        StringBuilder sb = new StringBuilder("Happy");
//        System.out.println(sb);

        ////    Append
//        sb.append(" Learning");
//        System.out.println("After append : " + sb);

        ////    Reverse
//        System.out.println(sb.reverse());

        ////    Insert
//        System.out.println(sb.insert(1," Abhay "));

        ////    Delete
//        System.out.println(sb.delete(1,4));



//  _________________________________________________________________
//      Practice Set
//  _________________________________________________________________
        String text = "TO UPPER CASE";
//1.-----------------------------------------------------------------
//        System.out.println(text.toLowerCase());
//2.-----------------------------------------------------------------
//        System.out.println(text.replace(" ", "_"));
//3.-----------------------------------------------------------------
//        String letter = "Dear <|name|>, Thanks a lot";
//        System.out.println(letter.replace("name", "abhay"));
//4.-----------------------------------------------------------------
        String myStr = "This is  my   string    .";
//        System.out.println(myStr.indexOf(" "));
//        System.out.println(myStr.indexOf("  "));
//        System.out.println(myStr.indexOf("   "));
//        System.out.println(myStr.indexOf("    "));
//        System.out.println(myStr.lastIndexOf(5));
//5.-----------------------------------------------------------------
//        myStr = "Dear abhay, \n\tThis is my string. \n\tthanks";
//        System.out.println(myStr);


    }
}

