
class Box {
    void test() {
        System.out.println("parameter less method");
    }
    void test(int a, int b) {
        System.out.println("values of a is: " + a + " and b is: " + b);
    }

    void test(int a, int b, int c) {
        System.out.println("values of a is: " + a + " and b is: " + b + " and c is: " + c);
    }
    void test(double a)
    {
        System.out.println("value od a is: "+a);
    }
}
public class overload_demo {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        mybox1.test();
        mybox1.test(10, 40);
        mybox1.test(10, 20, 30);
        mybox1.test(3.14);
    }
}
