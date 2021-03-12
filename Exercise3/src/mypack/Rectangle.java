package mypack;

import java.util.Scanner;

public class Rectangle extends Polygon {
        private Point vertice1;
        private Point vertice2;

        // public Rectangle(int x1, int y1, int x2, int y2) {
        // vertice1 = new Point(x1, y1);
        // vertice2 = new Point(x2, y2);
        // }

        public Rectangle() {
                Scanner sc = new Scanner(System.in);
                System.out.print("x1 = ");
                int x1 = sc.nextInt();
                System.out.print("y1 = ");
                int y1 = sc.nextInt();
                System.out.print("x2 = ");
                int x2 = sc.nextInt();
                System.out.print("y2 = ");
                int y2 = sc.nextInt();
                vertice1 = new Point(x1, y1);
                vertice2 = new Point(x2, y2);
        }

        public double getArea() {
                super.setArea(Math.abs(vertice1.getX() - vertice2.getX())
                                * Math.abs(vertice1.getY() - vertice2.getY()));
                return super.getArea();
        }
}
