package day15_switch_statement;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please select the size ");

        String size = input.next();
        String message = "";
        double price = 0;
        int callories = 0;
        boolean validOrder=true;

        switch (size) {
            case "tall":
                price = 2.5;
                callories = 100;
                message = size + " cup will cost " + price + " $ an it has " + callories + " callories";
                break;
            case "grande":
                price = 3.5;
                callories = 150;
                message = size + " cup will cost " + price + " $ an it has " + callories + " callories";
                break;
            case "venti":
                price = 4.5;
                callories = 200;
                message = size + " cup will cost " + price + " $ an it has " + callories + " callories";
                break;
            default:
                System.out.println( "the is no such a size");
                validOrder=false;
        }
        if(validOrder){
            System.out.println(message);
        }


    }
}
