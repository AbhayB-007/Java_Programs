package CWH_Programs;

class _14_0_OOPs {
    int instanceVar;
//    int a;
    static int b;

    // Default Constructor
//    OOPs() {
//        this(5, 10, 20); //  Constructor Chaining
//        System.out.println("Default Constructor is called and object is created & initialized");
//    }

    // Parameterised Constructor
    _14_0_OOPs(int a) {
        instanceVar = a;
        System.out.println("Constructor 2 is called and object is created & initialized");
    }

//    OOPs(int a, int b, int... c) {
//        this(a);
//        this.a = a; // This is used here to refer the instance variable 'a' is belongs to the
//        current object and the another variable is just used as argument.
//        OOPs.b = b; // As its an instance variable. So we can call it using class name or 'this'.
//        int[] cat = c;
//        System.out.println("Constructor 3 is called and object is created & initialized");
//    }

    void add(int val, int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum is : " + (sum + val));
    }

    void display() {
        System.out.println("This is display function");
        System.out.println(this.instanceVar + " " + b);
    }

    public static void main(String[] args) {
        _14_0_OOPs o1 = new _14_0_OOPs(5);
//        OOPs o2 = new OOPs(50);
//        OOPs o3 = new OOPs();
        o1.display();
//        o2.display();
//        o3.display();



    }
}

