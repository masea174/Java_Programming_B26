package day31_array_class;

import day16_review.SoccerGame;

public class AWS {
    public static void main(String[] args) {
        String app="etsy";
        String zones="us-east1,us-west1,us-west2,us-west3";

        String[]allZone=zones.split(",");

        for(String each:allZone){
            System.out.println(app+" is deploying on "+each);

        }
    }
}
