package day14_if_statements;

import java.util.Scanner;

public class RealEstate {
    /*
    We are buying a house
        ask the user for their budget (single number, max)

        Find the area that the user's budget fits into and provide all the information of the neighborhood

        extra condition: if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget". If the budget is more than 300,000 print "Too much money for this agency"

        Data based on neighborhood name:
            name - Hills
            average price - 80,000 - 100,000
            rating - 4.0
            gated - no
            allow pets - yes

            name - Oaks
            average price - 55,000 - 75,000
            rating - 3.5
            gated - no
            allow pets - yes

            name - Highland
            average price - 120,000 - 150,000
            rating - 4.5
            gated - yes
            allow pets - no

            name - Canyon
            average price - 160,000 - 201,000
            rating - 4.8
            gated - yes
            allow pets - yes

            If the budget is no in any range print: "No available houses"


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please introduce the max amount you are intrested to invest in a house ");
        double price = input.nextDouble();
        String name="", averagePrice="";
        double rating=0;
        boolean gated=false, allowPets=false, isavaileble=true;

        if (price < 300000 && price >= 0) {
            {
                System.out.println("Lets see the options we have:");
                if (price >= 55000 && price < 75000) {
                    name = "Oaks";
                    averagePrice = " 55,000 - 75,000";
                    rating = 3.5;
                    gated = false;
                    allowPets = false;
                }else
                if (price >= 80000 && price <= 100000) {
                    name = "Hills";
                    averagePrice = "80,000 - 100,000";
                    rating = 4.0;
                    gated = false;
                    allowPets = true;
                }else
                if (price >= 120000 && price < 150000) {
                    name = "Highland";
                    averagePrice = "120,000 - 150,000";
                    rating = 4.5;
                    gated = true;
                    allowPets = false;
                }else
                if (price > 160000 && price <= 201000) {
                    name = "Canyon";
                    averagePrice = "160,000 - 201,000";
                    rating = 4.8;
                    gated = true;
                    allowPets = true;
                } else {
                    System.out.println("there is no  house at your budget");
                    isavaileble = false;
                }
            }
            if (isavaileble) {
                String ad = "\tname of the neighborhood: " + name + "\n\tprice range: " + averagePrice + "\n\tRating : " + rating;
                ad += "\n \tGated: " + (gated ? "Yes" : "No");
                ad += "\n \tAllow pets :" + (allowPets ? "Yes" : "No");
                System.out.println(ad);
            }
        } else {
            if (price <= 0) {
                System.out.println("there is an invalid value");
            } else {
                System.out.println("too much money for this agency");
            }
        }




    }}

