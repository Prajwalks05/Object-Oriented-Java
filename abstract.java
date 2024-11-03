abstract class A {
    abstract void callme();
    void callmetoo() {
        System.out.println("Class \"a\" concrete method");
    }
}
class B extends A {
    void callme() {
        System.out.println("abstract method implemented in subclasss");
    }
}
public class demo {
    public static void main(String args[]) {
        B b=new B();
        b.callme();
        b.callmetoo();
    }
}
