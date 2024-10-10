
class Box {

    double width;
    double height;
    double length;

    Box() {
        width = 5.0;
        length = 5.0;
        height = 5.0;

    }

    double volume() {
        return width * height * length;
    }
}

public class Constructor_demo {

    public static void main(String[] args) {

        Box mybox1 = new Box();
        double vol = mybox1.volume();
        System.out.println("volume: "+vol);
    }
}
