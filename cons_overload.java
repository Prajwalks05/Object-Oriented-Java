
class Box {

    double width;
    double height;
    double length;

    Box() {
        width = 10.0;
        height = 20.0;
        length = 2.0;
    }

    Box(double w, double h, double l) {
        width = w;
        length = l;
        height = h;
    }

    Box(double a) {
        width = length = height = a;
    }

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        length = ob.length;
    }

    double volume() {
        return width * length * height;
    }
}

public class cons_overload {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(10.0, 20.0, 30.0);
        Box mybox3 = new Box(3.0);
        Box mybox4 = new Box(mybox1);
        System.out.println("the value of Box1 is: " + mybox1.volume());
        System.out.println("the value of Box2 is: " + mybox2.volume());
        System.out.println("the value of Box3 is: " + mybox3.volume());
        System.out.println("the value of Box3 is: " + mybox4.volume());

    }

}
