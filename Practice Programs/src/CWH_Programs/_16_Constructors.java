package CWH_Programs;

public class _16_Constructors {
    int a;
    int b;

    _16_Constructors() {
        this(5,6); // Constructor chaining within the class
        System.out.println("This is parent class constructor");
    }

    _16_Constructors(int a, int b) {
        System.out.println("This is parametrised constructor");
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("super class {a : " + a + " | b : " + b + "}");
    }
}

class _Constructors2 extends _16_Constructors {
    int a = 10, b = 20;

    _Constructors2() {
        super(); // super is used to invoke parent class constructor
        // and it has to be executed 1st in child constructor body
        System.out.println("This is child class constructor");
    }

    void show() {
        super.display();    // Calling parent class method using super keyword
        System.out.println("child class {a : " + a + " | b : " + b + "}");
    }

    public static void main(String[] args) {
        _16_Constructors o1 = new _16_Constructors(); // Creating object of parent class
//        _Constructors obj2 = new _Constructors2();
        o1.display();

        _Constructors2 obj1 = new _Constructors2();
        obj1.show();
    }


}
