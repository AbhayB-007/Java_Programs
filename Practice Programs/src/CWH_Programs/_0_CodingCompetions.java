package CWH_Programs;

import java.util.Scanner;

public class _0_CodingCompetions {

    private _0_CodingCompetions() {
        System.out.println("Private Constructor");
    }

    public static void main(String[] args) {
    }
}

class Singleton {
    private static Singleton obj;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {
    }

    public void display() {
        System.out.println(this);
    }

    public Singleton getInstance() {
        System.out.println("entered");
        if (obj == null)
            obj = new Singleton();
        return obj;
    }

    public static void main(String[] args) {
        Singleton obj = new Singleton();
        Singleton obj2 = obj.getInstance();
        obj2.display();

    }
}

class Fabric {

    public static void solve(int i) {

        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i = 1;
        while (T > 0) {
            System.out.print("Case #" + i + ": ");
            solve(i);
            i++;
            T--;
        }
    }
}
