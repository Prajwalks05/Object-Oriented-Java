class test {
    int i, j;

    test(int a, int b) {
        i = a;
        j = b;
    }

    boolean equal(test ob) {
        return ob.i == i && ob.j == j;
    }
}

public class testDemo {
    public static void main(String args[]) {
        test ob1 = new test(10, 20);
        test ob2 = new test(10, 20);
        test ob3 = new test(1, 2);

        boolean flag1 = ob1.equal(ob2);
        boolean flag2 = ob2.equal(ob3);

        System.out.println("The value of ob1 and ob2 is: " + flag1);
        System.out.println("The value of ob2 and ob3 is: " + flag2);
    }
}
