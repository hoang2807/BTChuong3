package mypack;

import java.util.Scanner;

public class Car extends Vehicle {
    protected int SeatNum;

    public Car() {
        super();
        this.SeatNum = 0;
    }

    public Car(String Brand, int Speed, int Weight, String Color, int SeatNum) {
        super(Brand, Speed, Weight, Color);
        this.SeatNum = SeatNum;
    }

    public void init() {
        super.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("SeatNum:");
        int seatNum = scanner.nextInt();
        this.SeatNum = seatNum;
    }

    public void display() {
        super.display();
        System.out.println("SeatNum: " + SeatNum);
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }
}
