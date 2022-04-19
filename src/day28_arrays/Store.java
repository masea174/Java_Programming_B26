package day28_arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        String[] items={"Shoes","Jackets","Gloves","Airpods","IPad"};
        //Do you have jackets in stock
        //use scanner to ask witch item you looking for ,and check if we have it
        String strItems= Arrays.toString(items);
        System.out.println(strItems.contains("Jackets")? "Yes we have ":"No we dont");

        System.out.println("with loops");
        boolean hasJackets=false;
        for (int i = 0; i < items.length; i++) {
            if(items[i].contains("Jackets")){
                hasJackets=true;
                break;
            }
        }
        System.out.println(hasJackets?"Jacket in stock":"Jacket out of stock");

        boolean isItem=false;
        Scanner input=new Scanner(System.in);
        System.out.println("witch item you are looking for?");
        String it=input.nextLine().trim().toLowerCase(Locale.ROOT);
        for (int i = 0; i < items.length; i++) {
            if(items[i].toLowerCase().contains(it)){
                isItem=true;
                break;
            }

        }
        System.out.println(isItem?"Yes we have the "+ it : "No we dont");
    }
}
