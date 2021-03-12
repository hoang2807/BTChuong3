import mypack.*;

public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle();
        System.out.println("Dien tich tam giac: " + triangle.getArea());
        Rectangle rectangle = new Rectangle();
        System.out.println("Dien tich chu nhat: " + rectangle.getArea());
    }
}
