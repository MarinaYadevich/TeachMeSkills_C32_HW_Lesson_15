package by.teachmeskills.yadevich.lesson15.task2.figure.circle;

import by.teachmeskills.yadevich.lesson15.task2.figure.Figure;

public class Circle extends Figure {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public void getInformation() {
        System.out.println("Radius circle: " + radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

