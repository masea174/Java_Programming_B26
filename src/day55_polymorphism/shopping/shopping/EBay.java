package day55_polymorphism.shopping.shopping;

public class EBay extends OnlineShopping implements AllowUserToSell{
    @Override
    public void uploadProduct() {
        System.out.println("Uploading the product");
    }

    @Override
    public void viewCart() {
        System.out.println("Cart view");
    }

    @Override
    public boolean payForShipping(boolean ui) {
        return true;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying the item");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the item");
    }
}
