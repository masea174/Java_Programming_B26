package day15_switch_statement;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine\nPlease select one of the following:\n\tDrinks\n\tSnaks\n\tGum");
        String selection = input.next();
        String item = "";
        boolean vending=true;

        switch (selection) {
            case "Drinks":
                System.out.println("You choose drinks press a number :\n\t1) water\n\t2) soda\n\t3) Juice ");
                int drinkNum = input.nextInt();
                if (drinkNum == 1) {
                    item = "water";
                } else if (drinkNum == 2)
                    item = "soda";
                else if (drinkNum == 3)
                    item = "Juice";

                System.out.println();
                break;
            case "Snaks":
                System.out.println("You choose snacks press a number :\n\t6) Chitos\n\t5) Gummy Bears\n\t4) Chips ");
                int snackNumber = input.nextInt();
                if (snackNumber == 4) {
                    item = "Chips";
                } else if (snackNumber == 5)
                    item = "Gummy Bears";
                else if (snackNumber == 6)
                    item = "Chitos";
                break;
            case "Gum":
                item = "Gum";
                break;
            default:
                System.out.println("No selection .Try again");
                vending=false;

        }if(vending)
        System.out.println("Vending ........" + item);
    }
}
