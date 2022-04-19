package day45_custom_classes;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        Food apples=new Food("apples");
        System.out.println(apples);
        Food chips=new Food("Lays",2);
        System.out.println(chips);
        Food chicken=new Food("Chicken",3,5.99);
        System.out.println(chicken);
        chips.unitPrice=1.99;
        chips.calculateTotalPrice();

        apples.quantity=10;
        apples.unitPrice=1.99;
        apples.calculateTotalPrice();
        System.out.println(apples);

        Food[] list ={apples,chicken,chips,null};
        System.out.println(list[2]);

        list[3]=new Food("Fish",4,3.55);

        System.out.println(Arrays.toString(list));
        System.out.println();
        double totalPriceAll=0;
        for (Food each:list){
            System.out.println(each);
           totalPriceAll+= each.totalPrice;
        }
        System.out.println(totalPriceAll);



    }
}
