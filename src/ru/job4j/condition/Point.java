package ru.job4j.condition;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point another) {
        return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2));
    }

    public static void main(String[] args) {
        Point one = new Point(0, 0);
        Point two = new Point(0, 2);
        double distance = one.distance(two);
        System.out.println(distance);
    }

}
