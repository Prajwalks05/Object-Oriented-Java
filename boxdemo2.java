
class Box {

    double height;
    double width;
    double length;
    double volume()
    {
        return width*height*length;
    }
}

public class boxdemo2 {

    public static void main(String[] args) {Box mybox1 = new Box();
        mybox1.height = 10.0;
        mybox1.width = 20.0;
        mybox1.length = 30.0;
        System.out.println("The value of length is: " + mybox1.length);
        System.out.println("The value of width is: " + mybox1.width);
        System.out.println("The value of lengths is: " + mybox1.height);
                System.out.println("The volume of box is: " + mybox1.volume());

    }

}
