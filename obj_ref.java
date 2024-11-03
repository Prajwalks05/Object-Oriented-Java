class test {
    int i, j;

    test(int a, int b) {
        i = a;
        j = b;
    }
    void method(test ob) {
        ob.i=ob.i*2;
        ob.j=ob.j*3;
    }
}

public class testDemo {
    public static void main(String args[]) {
        test ob1 = new test(10, 20);
        ob1.method(ob1);
        System.out.println("the value of ob1: "+ob1.i+" ob1.j: "+ob1.j);
    }
}
