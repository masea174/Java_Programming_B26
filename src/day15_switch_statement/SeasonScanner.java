package day15_switch_statement;

import java.util.Scanner;

public class SeasonScanner {
    public static void main(String[] args) {
        /*
        Season Finder

declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please insert the number of month: " );
        int month= input.nextInt();
        String season="";

        switch (month){
            case 12:
            case 1:
            case 2:
                season="It's winter wear a jacket, boots, a hat and scarf";
                break;
            case 3:
            case 4:
            case 5:
                season="Its spring wear a light jacket";
                break;
            case 6:
            case 7:
            case 8:
                season="Its summer: grab your shorts and bikini, beach time";
                break;
            case 10:
            case 11:
            case 9:
                season=" Its fall, start layering up";

        }
        System.out.println(season);
    }
}
