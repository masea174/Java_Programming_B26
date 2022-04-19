package day48_incupsulation;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza first=new Pizza("LArge",6);
        System.out.println(first);
        first.setNumberOfToppings(4);
        System.out.println(first);

        Pizza second =new Pizza("",-2);
        System.out.println(second);

        Pizza third=new Pizza("small",-3);
        System.out.println(third);
    }

}
