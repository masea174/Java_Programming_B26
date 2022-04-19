package day29_array;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        String [] items = { "Shoes","apa", "Jackets","Highheels" ,"Gloves", "IPod", "Backpack" };
        double [] prices = { 89.99,1, 150.0, 399.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 1,12346, 12347, 12348, 12349, 12350 };
        //print the catalog

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item ID: "+itemIds[i]+" are "+items[i]+" and they cost $ "+prices[i]);
        }
        //index of gloves
        int indexOfGloves=-1;
        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("gloves")){
                indexOfGloves=i;
                break;
            }
        }
        System.out.println(indexOfGloves);
// find and print the most expensive item
        double theMostExpensive=prices[0];
        int item=0;
        for (int i = 1; i < items.length; i++) {
            if(prices[i]>theMostExpensive){
                theMostExpensive=prices[i] ;
                        item=i;
            }
        }
        System.out.println("The most expansive item:");
        System.out.println(theMostExpensive + " "+items[item]+" "+itemIds[item]);
    }
}
