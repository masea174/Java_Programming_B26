package day42_custum_classes;

public class UseCoffee {
    public static void main(String[] args) {
        Coffee coffee1=new Coffee();
        coffee1.brand="Starbuks";
        coffee1.size=14;
        coffee1.price=5.99;
        coffee1.type="Cappucino";
        System.out.println(coffee1);
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.refill( 10);
        System.out.println(coffee1);


    }
}
