package day51_ihneritance.shapes;

public class Square extends Shapes {
    double side ;

   public Square(double side){
       super("Square");
       this.side=side;
   }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter(){
       return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                '}';
    }
}
