package day20_strings;

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize = input.next();
        int price = 0;
        switch (screenSize) {
            case "13.3":
                price += 200;
                break;
            case "15.0":
                price += 300;
                break;
            case "17.3":
                price += 400;
                break;
        }

        System.out.println("Select CPU type:");
        String cpuType = input.next();

        switch (cpuType) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
        }
        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();
        price += ((ramSize * 50) / 4);
        System.out.println("Select storage type:");
        String storageType = input.next();

        System.out.println("Select storage size:");
        int storageSize = input.nextInt();
        switch (storageType) {
            case "HDD":
                price += ((storageSize * 50) / 500);
                break;
            case "SSD":
                price += ((storageSize * 100) / 500);
                break;
        }String fake=input.nextLine();
        System.out.println("Select screen resolution:");
        String screenResolution = input.nextLine();

        switch (screenResolution) {

            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;
                break;
        }

        System.out.println("Final price is: $" + price);
    }
}
