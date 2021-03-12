public class Bottle {
    private Beverage beverage;
    private float volume;

    public Bottle(float volume, Beverage beverage) {
        this.beverage = beverage;
        this.volume = volume;
    }

    public void show(Beverage beverage) {
        beverage.display();
        System.out.println("Volume: " + volume);
    }
}
