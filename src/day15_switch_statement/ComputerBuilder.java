package day15_switch_statement;

import java.util.Scanner;

public class ComputerBuilder{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Select screen size:");
        String screen=input.next();
        double price=0;

        switch (screen){
            case "13.3":
                price+=200;
                break;
            case "15.0":
                price+=300;
                break;
            case "17.3":
                price+=400;

        }
        System.out.println("Select CPU type:");
        String cPU=input.next();
        switch (cPU){
            case "i3":
                price+=150;
                break;
            case "i5":
                price+=250;
                break;
            case "i7":
                price+=350;
                break;
        }System.out.println("Select RAM size:");
        int rAM=input.nextInt();
        price+=(rAM/4*50);

        String it=input.nextLine();
        System.out.println("Select storage type:");
        int type=input.nextInt();
        System.out.println("Select storage size:");
        String storage=input.nextLine();
        switch (storage) {
            case "HDD":
                price += (type/500)*50;
                break;
            case "SSD":
                price +=(type/500) *100;


        }
        System.out.println("Select screen resolution:");
        String ecran=input.nextLine();
        switch(ecran){
            case "FULLHD":
                price+=100;
                break;
            case "4K":
                price+=200;
                break;


        }System.out.println("Final price is: $"+price);

    }
}