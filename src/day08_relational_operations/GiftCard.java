package day08_relational_operations;

public class GiftCard {
    public static void main(String[] args) {
        //declare and assign  a gift cared with some money 200$
        //buy 1 item x price,and substract from the gc ,
        //buy item 2 and substract again
        //print the remaining ballance

        double money=200;
        double price=9.75;
        money-=price;
        price *=5;
        money-=price;

        System.out.println("balance left="+money);
        System.out.println(price);



    }
}
