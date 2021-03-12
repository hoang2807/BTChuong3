package mypack;

import java.util.Scanner;

public abstract class Polygon implements IPolygon {
    private int n;
    private Point[] points;
    private double area;

    public Polygon() {

    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public double getArea() {
        return area;
    }
}
