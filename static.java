class static_demo {
    static int a=10;
    static int b=20;
    static void callme() {
        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);
    }
}
public class staticdemo1 {
    public static void main(String args[]) {
        //static_demo.callme();
        System.out.println("The value of a is :"+static_demo.a);
        System.out.println("The value of b is :"+static_demo.b);
    }
}
