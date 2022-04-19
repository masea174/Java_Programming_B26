package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingHobby {
    public static void main(String[] args) {
        Hobby hobby1=new Hobby("Hiking",0,true,false);
        ArrayList<Hobby> list=new ArrayList<>();
        list.add(hobby1);
        list.addAll(Arrays.asList(new Hobby("Fishing",50,true,false),new Hobby("Skydiving",10000,true,true),new Hobby("Sewing",200,false,false),new Hobby("Dancing tango",1000,false,true)));

        for (Hobby each:list){
            each.doIt();
        }
        ArrayList<Hobby> indoorsOnly=new ArrayList<>(list);
        indoorsOnly.removeIf(each-> each.isOutdoors);
        System.out.println(indoorsOnly);
        System.out.println();
        ArrayList<Hobby> noPpl=new ArrayList<>(list);
        noPpl.removeIf(each->each.requireOthers);
        System.out.println(noPpl);
        System.out.println();
        ArrayList<Hobby> expensive=new ArrayList<>(list);
        expensive.removeIf(each->each.annualCost>500);
        System.out.println(expensive);
    }
}
