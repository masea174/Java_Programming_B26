package day45_custom_classes;

public class Food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name,quantity);
        this.unitPrice = unitPrice;
        calculateTotalPrice();
    }
    public void calculateTotalPrice(){
        totalPrice=quantity*unitPrice;
    }

    @Override
    public String toString() {
        return "Food{" +
                 name + "~" + quantity+ "~"+
                unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
