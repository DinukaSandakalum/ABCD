import com.calculator.Circle;
import com.calculator.Rectangle;
import com.calculator.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(14);
        System.out.println("Area of the Circle = "+c.area());
        c.setRadius(10);
        System.out.println("Area of the Circle = "+c.area());
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area of the Rectangle = "+r.area());
        r.setLength(15);
        System.out.println("Area of the Rectangle = "+r.area());
        Triangle t = new Triangle(20, 10);
        System.out.println("Area of the Triangle = "+t.area());
        t.setWidth(8);
        System.out.println("Area of the Triangle = "+t.area());
    }
}