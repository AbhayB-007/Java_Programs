package CWH_Programs;

public class _13_varargs {

    //    Varargs is used to pass more than 1 parameter as argument
    static int sum(int... arr) {
        int result = 0;
        for (int e : arr) {
            result += e;
        }
        return result;
    }

//    Atleast 1 element is Compulsory
//    static int sum(int x, int... arr) {
//        int result = x;
//        for (int e : arr){
//            result += e;
//        }
//            return result;
//    }

    static float avg(int...x) {
        float sum = 0f;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return (sum / (float) x.length);
    }

    public static void main(String[] args) {
        System.out.println("Sum is : " + sum(10) + " and average is : " + avg(10));
        System.out.println("Sum is : " + sum(1, 2) + " and average is : " + avg(1, 2));
        System.out.println("Sum is : " + sum(1, 4, 6) + " and average is : " + avg(1, 4, 6));
        System.out.println("Sum is : " + sum(1, 3, 5, 7, 9) + " and average is : " + avg(1, 3, 5, 7, 9));
    }
}
