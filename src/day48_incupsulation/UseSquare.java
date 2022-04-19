package day48_incupsulation;

public class UseSquare {
    public static void main(String[] args) {
        Square obj= new Square(5);
        System.out.println(obj);

        obj.setSide(11);{
            System.out.println(obj);
        }
    }

}
