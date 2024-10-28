class Gen<T, V> {
    T tob;
    V vob;

    Gen(T t, V v) {
        this.tob = t;
        this.vob = v;
    }

    T get_Tob() {
        return tob;
    }

    V get_Vob() {
        return vob;
    }

    void showType() {
        System.out.println("Type of T is: " + tob.getClass().getName());
        System.out.println("Type of V is: " + vob.getClass().getName());
    }
}

class Gen2Demo {
    public static void main(String args[]) {
        Gen<Integer, Double> tgob;
        tgob = new Gen<>(88, 3.14);
        tgob.showType();
        
        int v1 = tgob.get_Tob(); // Integer to int auto-unboxing
        System.out.println("Auto unboxed value is: " + v1);
        
        double v2 = tgob.get_Vob(); // Double to double auto-unboxing
        System.out.println("Auto unboxed value is: " + v2);
    }
}
