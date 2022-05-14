package day55_polymorphism.shopping.shopping;

public final class Amazon extends OnlineShopping{
    @Override
    public void viewCart() {
        System.out.println("Viewing the cart");
    }

    @Override
    public boolean payForShipping(boolean ue) {

        return false;
    }

    @Override
    public void buyItem() {

        System.out.println("Buying the item");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the item");
    }

    public static void main(String[] args) {
        String a="abc";
        char c = 'a';
        System.out.println(c);
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(2));
    }
}
