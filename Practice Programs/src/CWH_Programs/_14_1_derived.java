package CWH_Programs;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Employee Ravi = new Employee();
//        Ravi.salary = 50000;
//        System.out.println(Ravi.getSalary());
//        Ravi.setName("Ravi");
//        System.out.println(Ravi.getName());
    }
}

class Square {
    int side;

    public void setSide(int s) {
        side = s;
    }

    public int perimeter() {
        return 4 * side;
    }

    public int area() {
        return side * side;
    }

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSide(5);
        System.out.println("Perimeter is : " + s1.perimeter());
        System.out.println("Area is : " + s1.area());
    }
}

class Rectangle {
    int length;
    int width;

    public void setSide(int l, int w) {
        length = l;
        width = w;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public int area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setSide(10,5);
        System.out.println("Perimeter is : " + r1.perimeter());
        System.out.println("Area is : " + r1.area());
    }
}


public class _14_1_derived extends _14_0_OOPs {
    _14_1_derived(int c) {
        super(c);
        System.out.println("i m constructor of derived class");
    }

    public static void main(String[] args) {
        _14_1_derived integers = new _14_1_derived(20);
        integers.add(4);
        _14_0_OOPs natural_num = new _14_0_OOPs(10);
        natural_num.add(4, 5, 6);
    }
}

