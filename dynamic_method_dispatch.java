class figure {
    double dim1,dim2;
    figure(double i,double j) {
        dim1=i;
        dim2=j;
    }
    double area() {
        return 0;
    }
}
class rect extends figure {
    rect(double i,double j) {
        super(i,j);
    }
    double area() {
        return dim1*dim2;
    }
}
class tri extends figure {
    tri(double i,double j) {
        super(i,j);
    }
    double area() {
        return 0.5*dim1*dim2;
    }
}
public class demo {
    public static void main(String args[]) {
        figure f=new figure(10,20);
        rect r=new rect(30,40);
        tri t=new tri(10,20);

        figure f1;
        f1=f;
        System.out.println("area:"+f1.area());
        f1=r;
        System.out.println("area:"+f1.area());
        f1=t;
        System.out.println("area:"+f1.area());

    }
}
