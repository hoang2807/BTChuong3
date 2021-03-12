import mypack.*;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle v = new Car();
        v.init();
        v.display();
        v.start();
        v.run();
        v.stop();
        v.sleep();
    }
}