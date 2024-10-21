abstract class Shape {
  int length;
  int breadth;

  Shape(int a, int b) {
    length = a;
    breadth = b;
  } // constructor end

  abstract double printArea();
} // class end

class Rectangle extends Shape {
  Rectangle(int a, int b) {
    super(a, b);
  } // constructor end

  double printArea() {
    return length * breadth;
  } // area end
} // rect end

class Triangle extends Shape {
  Triangle(int a, int b) {
    super(a, b);
  } // constructor end

  double printArea() {
    return 0.5 * length * breadth;
  } // area end
} // tri end

class Circle extends Shape {
  Circle(int a) {
    super(a, 0);
  }

  double printArea() {
    return 3.14* length * length;
  } // area end
} // circle end

class Abs {
  public static void main(String args[]) {
    Shape s;
    Rectangle r1 = new Rectangle(10, 20);
    Triangle t1 = new Triangle(30, 5);
    Circle c1 = new Circle(3);

    s = r1;
    System.out.println("Area of Rectangle: " + s.printArea());

    s = t1; // Assign s to the Triangle
    System.out.println("Area of Triangle: " + s.printArea());

    s = c1; // Assign s to the Circle
    System.out.println("Area of Circle: " + s.printArea());
  } // main end
} // class end
