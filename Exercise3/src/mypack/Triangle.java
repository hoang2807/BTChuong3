package mypack;

import java.util.Scanner;

public class Triangle extends Polygon {
    private Point vertice1;
    private Point vertice2;
    private Point vertice3;

    public Triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1 = ");
        int y1 = sc.nextInt();
        System.out.print("x2 = ");
        int x2 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 = sc.nextInt();
        System.out.print("x3 = ");
        int x3 = sc.nextInt();
        System.out.print("y3 = ");
        int y3 = sc.nextInt();
        vertice1 = new Point(x1, y1);
        vertice2 = new Point(x2, y2);
        vertice3 = new Point(x3, y3);

    }

    public double getArea() {
        double d1 = Math
                .sqrt(Math.pow(vertice1.getX() - vertice2.getX(), 2) + Math.pow(vertice1.getY() - vertice2.getY(), 2));
        double d2 = Math
                .sqrt(Math.pow(vertice2.getX() - vertice3.getX(), 2) + Math.pow(vertice2.getY() - vertice3.getY(), 2));
        double d3 = Math
                .sqrt(Math.pow(vertice3.getX() - vertice1.getX(), 2) + Math.pow(vertice3.getY() - vertice1.getY(), 2));
        double p = (d1 + d2 + d3) / 2;
        double area = Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
        super.setArea(area);
        return super.getArea();
    }
}
