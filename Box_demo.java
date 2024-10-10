class Box {
    double height;
    double width;
    double length;
}
public class Boxdemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        mybox1.height = 10.4;
        mybox1.width = 20.3;
        mybox1.length = 30.4;
        System.out.println("The value of length is: " + mybox1.length);
        System.out.println("The value of width is: " + mybox1.width);
        System.out.println("The value of lengths is: " + mybox1.height);
    }

}
