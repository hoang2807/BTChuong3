public class App {
    public static void main(String[] args) throws Exception {
        Wine w = new Wine("Whisky", 20);
        Bottle bot = new Bottle(10, w);
        bot.show(w);

        SoftDrink sd = new SoftDrink("Macallan", 5);
        sd.display();
    }
}
