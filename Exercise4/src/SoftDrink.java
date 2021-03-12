public class SoftDrink extends Beverage {
    private float sugar;

    public SoftDrink(String brand, float sugar) {
        super(brand);
        this.sugar = sugar;
    }

    @Override
    public void display() {
        System.out.println("Brand: " + super.getBrand());
        System.out.println("Sugar: " + sugar);
    }
}
