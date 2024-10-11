
class Box {

    double width;
    double height;
    double length;

    Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;

    }

    double volume() {
        return width * height * length;
    }
}

class this_operator {

    public static void main(String[] args) {
        Box mybox1 = new Box(2.0, 4.6, 23.6);
        Box mybox2 = new Box(20.0, 43.6, 2.6);
        System.out.println("the volume of box 1 is: " + mybox1.volume());
        System.out.println("the volume of box 1 is: " + mybox2.volume());

    }

}
