package day51_ihneritance.shapes;

public class AllShapes {
    public static void main(String[] args) {
        Square square= new Square(4.5);

        System.out.println(square);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        Circle obj2= new Circle(0.5);
        System.out.println(obj2);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());
    }
}
