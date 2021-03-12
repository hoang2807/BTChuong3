public class Wine extends Beverage {
    private float ABV;

    public Wine(String Brand, float ABV) {
        super(Brand);
        this.ABV = ABV;
    }

    @Override
    public void display() {
        System.out.println("Brand: " + super.getBrand());
        System.out.println("ABV: " + ABV);
    }
}
