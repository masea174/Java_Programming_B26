package day51_ihneritance.shapes;

import day49_inheritance.Dog;

public class Circle extends Shapes {
    double radius;
    public Circle(double radius){
        super("Circle");
        this.radius=radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 *Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
