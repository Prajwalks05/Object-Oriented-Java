class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String args[]) {
        Gen<Integer> iob1 = new Gen<>(88);
        iob1.showType();
        int v = iob1.getOb();
        System.out.println("Auto unboxed value is: " + v);

        Gen<Double> iob2 = new Gen<Double>(10.4);
        double v2 = iob2.getOb();
        System.out.println("Unboxed value v2: " + v2);

        Gen<Float> iob3 = new Gen<Float>(10.36f);
        float v3 = iob3.getOb();
        System.out.println("Unboxed value v3: " + v3);
    }
}
