package day41_arraylist;

import java.util.ArrayList;

public class RemoveBadPear {
    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> list){
        ArrayList<Integer>goodPairs=new ArrayList<>();
        for (int i = 0; i < list.size(); i+=2) {
            if(list.get(i)<list.get(i+1)){
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i+1));
            }
        }return goodPairs;
    }
}
