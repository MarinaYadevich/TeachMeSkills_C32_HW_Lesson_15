package by.teachmeskills.yadevich.lesson15.task2.figure.triangle;

import by.teachmeskills.yadevich.lesson15.task2.figure.Figure;

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double area = (a + b + c) / 2.0;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public void getInformation() {
        System.out.println("Triangle: a - " + a + ", b - " + b + ", c - " + c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
