package day08_practice;

public class GallonsToLitter {
    /*create a class called GalonsToLiters, and write a program that can convert the gallons to litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters*/
    public static void main(String[] args) {
        double gallon= 20;
        double liter=gallon*3.78541;

        System.out.println(gallon+"gallon =  "+liter+"litters");
        gallon=80;liter=gallon*3.78541;
        System.out.println(gallon+"gallon =  "+liter+"litters");
    }
}
