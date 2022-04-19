package day15_switch_statement;

import java.util.Scanner;

public class Help {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double amount = 0;
            System.out.println("Select screen size: ");
            double screenSize = input.nextDouble();
            if(screenSize == 13.3){
                amount += 200;
            }else if(screenSize == 15.0){
                amount += 300;
            }else if(screenSize == 17.3){
                amount += 400;
            }
            System.out.println("Select CPU type: ");
            String cpuType = input.next();
            switch(cpuType) {
                case "i3" :
                    amount += 150;
                    break;
                case "i5" :
                    amount += 250;
                    break;
                case "i7" :
                    amount += 350;
                    break;
                default :
                    System.out.println("not valid CPU");
            }

            System.out.println("Select RAM size: ");
            int ramSize = input.nextInt();
            if (ramSize % 4 == 0){
                amount += ramSize / 4 * 50;
            }else { System.out.println("Ram size should will be divisible by 4");}
            System.out.println("Select storage type and storage size:");
            String storageType = input.next();
            int storageSize = input.nextInt();
            switch(storageType){
                case "HHD" :
                    amount += (storageSize / 500) * 50;
                    break;
                default :
                    amount += (storageSize / 500) * 100;
            }
            System.out.println("Select screen resolution: ");
            String screenResolution = input.next();
            switch(screenResolution){
                case "FULLHD" :
                    amount += 100;
                default :
                    amount += 200;
            }
            System.out.println("Laptop price is: $" + amount);

        }
    }

