public abstract class Beverage {
    protected String brand;

    public Beverage(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    abstract public void display();
}
