package com.company.geeksforgeeks.utility;

import java.util.Objects;

public class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static Point p1 = new Point(20, 10);
    public static Point p2 = new Point(10, 20);
    public static Point p3 = new Point(20, 20);
    public static Point p4 = new Point(10, 10);

    public static int distance(Point p, Point q) {
        return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
    }

    public static boolean isSameSide(Point p, Point q) {
        return p.x == q.y;
    }



};