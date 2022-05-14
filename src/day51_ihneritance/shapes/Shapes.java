package day51_ihneritance.shapes;

public abstract class Shapes {
    String name;
    public Shapes(String name){
        this.name=name;
    }
    public abstract double area();
    public  double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                '}';
    }
}
