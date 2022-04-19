package day23_loops;

import java.util.Locale;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String list="Shpping list:\n";
        String addMore;
        do {
            System.out.println("please enter an item:");
            list+="\n*" +input.nextLine();
            System.out.println("do you want to enter more?");
            addMore= input.nextLine().toLowerCase().trim();

        }while(addMore.equals("yes"));
        System.out.println(list);

    }
}
