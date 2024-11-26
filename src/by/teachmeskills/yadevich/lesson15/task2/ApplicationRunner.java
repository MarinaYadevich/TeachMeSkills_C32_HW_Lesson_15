package by.teachmeskills.yadevich.lesson15.task2;

import by.teachmeskills.yadevich.lesson15.task2.figure.Figure;
import by.teachmeskills.yadevich.lesson15.task2.figure.circle.Circle;
import by.teachmeskills.yadevich.lesson15.task2.figure.rectangle.Rectangle;
import by.teachmeskills.yadevich.lesson15.task2.figure.triangle.Triangle;

import java.util.ArrayList;

/** Task 2.
 Create a collection of shapes.
 (take the classes for shapes from previous homework)
 Fill the collection with different shapes.
 Loop through the collection and call the method to calculate and display the perimeter
 of each shape.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<>();
        Circle circle = new Circle(20);
        Rectangle rectangle = new Rectangle(5,9);
        Triangle triangle = new Triangle(3,4,3);

        figures.add(circle);
        figures.add(rectangle);
        figures.add(triangle);

        for(Figure figure: figures){
            System.out.println(figure.toString() + " has perimeter: " + figure.calculatePerimeter());
        }
    }
}
