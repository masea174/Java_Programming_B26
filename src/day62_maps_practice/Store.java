package day62_maps_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String,Double> store=new HashMap<>();
        store.put("water",1.5);
        store.put("coffee",2.5);
        store.put("apples",0.99);
        store.put("bread",2.35);
        store.put("cucumbers",3.89);
        System.out.println("Store Iventory");

        for(String keys :store.keySet()){//returns the set of keys that helps to get information from the map
            System.out.println("Item :"+keys+" for "+store.get(keys));
        }
        for (Map.Entry<String,Double>each:store.entrySet()){//retuning the entry for the key values
            System.out.println("\tItem: "+each.getKey()+ " for $"+each.getValue());
        }

        System.out.println(store.values());// prints only the values from map as a collection type

        Scanner input=new Scanner(System.in);
        System.out.println("What item do you want");
        String item=input.nextLine();
        System.out.println(store.containsKey(item) ? item + " is in stock for $"+ store.get(item) : "Not available in the store");

    }
}
