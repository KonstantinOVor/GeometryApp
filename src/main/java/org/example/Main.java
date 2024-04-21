package org.example;

import org.example.model.impl.*;

import static org.example.urils.GeometryUtilsImpl.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Triangle triangle = new Triangle(5.0, 4.0, 5.0);
        Cube cube = new Cube(5.0);
        Sphere sphere = new Sphere(5.0);

        System.out.println("Площадь круга: " + circle.findingTheArea());
        System.out.println("Периметр круга: " + circle.findingThePerimeter());

        System.out.println("Площадь прямоугольника: " + rectangle.findingTheArea());
        System.out.println("Периметр прямоугольника: " + rectangle.findingThePerimeter());

        System.out.println("Площадь треугольника: " + triangle.findingTheArea());
        System.out.println("Периметр треугольника: " + triangle.findingThePerimeter());

        System.out.println(compareShapes(circle, rectangle));
        System.out.println(compareShapes(rectangle, rectangle));

        System.out.println(convertUnits(500.0, "cm", "m"));
        System.out.println(convertUnits(5.0, "m", "cm"));

        System.out.println(interactShapes(circle, rectangle));

        System.out.println(cube.findVolume());
        System.out.println(sphere.findVolume());
        System.out.println(cube.findSurfaceArea());
        System.out.println(sphere.findSurfaceArea());

        System.out.println();
    }
}