package day44_costum_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class UseFood {
    public static void main(String[] args) {
        Food food=new Food("bread");
        Food food1=new Food("apples",2);
        Food food2=new Food("artrichok");
        Food food3=new Food("peaches",10,3.5);
        Food food4=new Food("apricots",4,4.5);
        Food[] foodlist={food,food1,food2,food3,food4};

        System.out.println(Arrays.toString(foodlist));
        for (int i = 0; i < foodlist.length; i++) {
            if(foodlist[i].name.startsWith("a")){
                System.out.println(foodlist[i]);

            }if(foodlist[i].totalPrice>20){
                System.out.println();
                System.out.println(foodlist[i]);
                System.out.println();
            }
        }
    }
}
