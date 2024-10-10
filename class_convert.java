
public class Class_convertJava {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.221;
        System.out.println("conversion of int to byte");
        b = (byte) i;
        System.out.println("i and b are " + i + " and " + b);
        i = (int) d;
        System.out.println("i and d are " + i + " and " + d);
        b = (byte) d;
        System.out.println("b and d are " + b + " and " + d);
    }
}
