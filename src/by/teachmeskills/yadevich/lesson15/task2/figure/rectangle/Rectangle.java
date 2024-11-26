package by.teachmeskills.yadevich.lesson15.task2.figure.rectangle;

import by.teachmeskills.yadevich.lesson15.task2.figure.Figure;

public class Rectangle extends Figure {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = length * width;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * (length * width);
        return perimeter;
    }

    @Override
    public void getInformation() {
        System.out.println("Rectangle: length - " + length + ", width - " + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

