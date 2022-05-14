package day55_polymorphism.shopping.shopping;

public class Runner
{
    public static void main(String[] args) {
        Target target=new Target();
        target.price=10;
        target.buyItem();
        target.returnItem();
        //target .payforShipping =true ;it doent implimebr rhe shipping interface
        System.out.println();
        Amazon amazon=new Amazon();
        amazon.price=1000;
        amazon.buyItem();
        System.out.println(amazon.price);
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
        System.out.println(amazon.country);
        System.out.println(Shipping.country);// the proper access to the interface variables because they are static

    }
}
