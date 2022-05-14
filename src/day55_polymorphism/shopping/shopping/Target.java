package day55_polymorphism.shopping.shopping;

public final class Target extends Shopping{
    @Override
    public void buyItem() {
        System.out.println("Buying Item");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item");
    }
}
