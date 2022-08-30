import com.calculator.Circle;
import com.calculator.Rectangle;
import com.calculator.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(14);
        c.setRadius(10);
        System.out.println(c.area());
        Rectangle r = new Rectangle(10, 5);
        r.setLength(10);
        System.out.println(r.area());
        Triangle t = new Triangle(20, 10);
        t.setWidth(10);
        System.out.println(t.area());
    }
}