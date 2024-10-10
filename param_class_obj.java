class Box 
{
    double width;
    double height;
    double length;

    void set_dim(double w, double h, double l) {//parameterised funtion
	
        width = w;
        length = l;
        height = h;
    }

    double volume() {
        return width * height * length;
    }
}

public class param_class_obj {

    public static void main(String[] args) {
        Box mybox1 = new Box();//object creation
        Box mybox2 = new Box();
        mybox1.set_dim(10.0, 20.0, 30.0);
        mybox2.set_dim(20.0, 5.0, 3.0);
        System.out.println("volume of box 1 is : " + mybox1.volume());
        System.out.println("volume of box 2 is : " + mybox2.volume());
        Box mybox3 = new Box();
        mybox3 = mybox2;//copy object mybox3 points to values of mybox2
        System.out.println("volume of box 3 is : " + mybox3.volume());
    }

}
