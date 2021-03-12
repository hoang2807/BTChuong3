package mypack;

import java.util.Scanner;

public abstract class Vehicle implements Movement {
    protected String Brand;
    protected int Speed;
    protected int Weight;
    protected String Color;

    public Vehicle() {
        this.Brand = "";
        this.Speed = 0;
        this.Weight = 0;
        this.Color = "";
    }

    public Vehicle(String Brand, int Speed, int Weight, String Color) {
        this.Brand = Brand;
        this.Speed = Speed;
        this.Weight = Weight;
        this.Color = Color;
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Brand:");
        String brand = scanner.nextLine();
        this.Brand = brand;
        System.out.println("Speed:");
        int speed = scanner.nextInt();
        this.Speed = speed;
        System.out.println("Weight:");
        int weight = scanner.nextInt();
        this.Weight = weight;
        scanner.nextLine();
        System.out.println("Color:");
        String color = scanner.nextLine();
        this.Color = color;
    }

    public void display() {
        System.out.println("Brand: " + Brand);
        System.out.println("Speed: " + Speed);
        System.out.println("Weight: " + Weight);
        System.out.println("Color: " + Color);
    }
}