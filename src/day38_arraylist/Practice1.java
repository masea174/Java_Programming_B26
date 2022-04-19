package day38_arraylist;

import java.util.ArrayList;

public class Practice1 {
    /*
    Practice flow:

Create an ArrayList of Strings
add these elements:
	add Hat
	add Shoes
	add Jacket in middle of Hat and Shoes
	add Towel in the beginning
	add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made

     */
    public static void main(String[] args) {
        ArrayList <String> cloths=new ArrayList<>();
        cloths.add("Hat");
        System.out.println(cloths);
        cloths.add("Shoes");
        System.out.println(cloths);
        cloths.add(1,"Jacket");
        System.out.println(cloths);
        cloths.add(0,"Towel");
        System.out.println(cloths);
        cloths.add(1,"Car");
        System.out.println(cloths);
    }
}
