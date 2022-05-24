package day60_collections;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(-5);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-4);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        Set<Integer> set=new HashSet<>();
        set.add(4);
        set.add(-5);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-4);
        set.add(10);
        set.add(4);
        System.out.println(set);
      //  System.out.println(set.get(0));
      //  System.out.println(set.get(list.size()-1));
        //no indexes for set interface

        for (Integer number:set){
            System.out.println(number);
            
        }
        // I want to sort my hashset
        System.out.println(new TreeSet<>(set));

        System.out.println(new LinkedHashSet<>(list));

        System.out.println(new HashSet<>(Arrays.asList(1,2,3,4,3,2,2,1)));

        String s="aaaabbbbbsbcbcbd";
        System.out.println(new HashSet<>(Arrays.asList(s.split(""))).toString()
                .replace(", ","")
                .replace("[","")
                .replace("]",""));

        //te string is getting converted to char array with split method, that is transforming it into collecttion time as list to be a hashset witch removes the duplicats , than we transfer it in string ad do the string manipulations


    }
}
