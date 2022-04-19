package day44_costum_classes;

import day45_custom_classes.SDET;

import java.util.ArrayList;
import java.util.Arrays;

public class UseOfferV2 {
    /*
    Make a class for Offer objects (from class)

    try to create 7 objects of Offer class and store them into an ArrayList of Offer
       maintain the list to keep the offers from your local area
    maintain the list to to keep only full time offers

     */
    public static void main(String[] args) {
        SDET.Offer offer = new SDET.Offer("Silicon Valley", "Apple");
        SDET.Offer offer1 = new SDET.Offer("Virginia", "DOD");
        SDET.Offer offer2 = new SDET.Offer("Washington", "Verizon", 128999, true, 12);
        SDET.Offer offer3 = new SDET.Offer("Maryland", "Nike", 127600, true, 15);
        SDET.Offer offer4 = new SDET.Offer("Washington", "Lulumelon", 12387, true, 20);
        SDET.Offer offer5 = new SDET.Offer("New york", "Baleciaga");
        SDET.Offer offer6 = new SDET.Offer("Chicago", "URL", 123456);

        ArrayList<SDET.Offer> list = new ArrayList<>(Arrays.asList(offer, offer1, offer2, offer3, offer4, offer5, offer6));
//
//        list.removeIf(each -> !(each.location.equals("Washington") || each.location.equals("Virginia") || each.location.equals("Maryland")));
//        System.out.println(list);
//        System.out.println();
//        list.removeIf(each -> (each.isFullTime == false));
//        System.out.println(list);
//
//    }
    }}
