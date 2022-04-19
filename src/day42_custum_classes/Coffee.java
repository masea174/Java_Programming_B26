package day42_custum_classes;

public class Coffee {
    /*
    create a class with instant variables
    price
    size
    brand
    type

    instance methods
    make a toString ti print all the coffee obj

    make a method that is called drink
    print whatever type of coffe have
     refil method
     print refiling amount in oz
     add the number of oz to the total size


     */
    String brand;
    int size;
    double price;
    String type;

    @Override
    public String toString() {
        return type+ " from "+brand+ " size of "+size+ " oz .For a total of $"+price ;
    }
    public void drink(){
        System.out.println( "drinking "+type);
        size-=1.5;
    }

    public void refill(double amount
    ){
        System.out.println("Refiling "+amount+ " oz of coffee");
        size+=amount;

    }
}
