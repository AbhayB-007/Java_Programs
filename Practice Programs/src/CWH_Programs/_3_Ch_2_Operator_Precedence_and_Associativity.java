package CWH_Programs;

public class _3_Ch_2_Operator_Precedence_and_Associativity {
    public static void main(String[] args) {
//        int a = 6*5-34/2;
//        Operator Precedence
//         1. /, *, %
//         2. +, -
//         3. =
//        operator having highest precedence will evaluate first.
//        and if the precedence of 2 operators is same then we evaluate the term using associativity.
//        Like in case of * and / and associativity in this case will be left to right.

        int b=1;
        int c=4;
        int a=5;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

//      Explanation
//      => 1 - (80/10)
//      => 1 - 8
//      => -7

    }
}
