package day07_unary_operation;

public class Shopping {
    public static void main(String[] args) {

        int numberItems=0;
        double price=0.0;


        System.out.println("we picked up 1 water ");
        System.out.println("how many items in the cart :"+ ++numberItems);
        price=price+ 2.5;
        System.out.println("total cart cost : "+numberItems*2.5);
        System.out.println("we pick up 2 eggs ");
        System.out.println("");
        System.out.println("how many items in the cart :"+ ++numberItems);
        System.out.println("how many items in the cart :"+ ++numberItems);

    }
}
