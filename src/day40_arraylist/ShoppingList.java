package day40_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty() ? "shoping list empty" : "You have some items");
        String keepAsking;
        do {
            System.out.println("enter the item");
            list.add(input.nextLine());
            System.out.println("Do you want to add more items");
            keepAsking = input.nextLine();
        } while (keepAsking.contains("yes"));
        System.out.println("shoping list");
        for (String item : list) {
            System.out.println("*\t" + item);
        }
        System.out.println("_______________________________");
        System.out.println(list.contains("water") ? "water on the list" : "no water on the list");
        System.out.println("do you want to remove any items?");
        if (input.nextLine().equals("yes")) {
            System.out.println("what Item do you want to remove");
            String removeItem = input.nextLine();
            if (Character.isDigit(removeItem.charAt(0))) {
                int number = Integer.parseInt(removeItem);//the user will give you a number on the list but to get to the index
                list.remove(number - 1);
            } else {
                list.remove(removeItem);
            }


        }
        System.out.println(list);
    }
}
