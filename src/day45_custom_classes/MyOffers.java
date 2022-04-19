package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1=new Offer("Google","Texas",200000,true,15);
        System.out.println(offer1);
        System.out.println();
        ArrayList<Offer> allOfers=new ArrayList<>();
        allOfers.add(offer1);
        System.out.println(allOfers);

        allOfers.add(new Offer("Amazon","New York",180000,true,15));
        System.out.println(allOfers);
        Offer[] moreOffers={
                new Offer("Apple","Chicago",230000,false,10),
                new Offer("Tesla","Texas",250000,false,20),
                new Offer("Facebook","Florida",120000,true,10)
        };
        allOfers.addAll(Arrays.asList(moreOffers));
        System.out.println(allOfers);
        System.out.println();

        ArrayList<Offer> salaries=new ArrayList<>(allOfers);
        salaries.removeIf(each-> each.salary<170000);
        System.out.println(salaries);
        ArrayList<Offer>fullTimes=new ArrayList<>(allOfers);
        fullTimes.removeIf(each->each.isFullTime==false);
        System.out.println(fullTimes);
    }
}
