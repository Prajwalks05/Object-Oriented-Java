
class Box {

    double width;
    double height;
    double length;

    Box(double w, double l, double h) {
        width = w;
        length = l;
        height = h;

    }

    double volume() {
        return width * height * length;
    }
}

public class Constructor_demo {

    public static void main(String[] args) {

        Box mybox1 = new Box(20.0,10.0,2.0);
        double vol = mybox1.volume();
        System.out.println("volume: " + vol);
    }
}
