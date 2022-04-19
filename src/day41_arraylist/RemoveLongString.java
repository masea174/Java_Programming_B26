package day41_arraylist;

import java.util.ArrayList;

public class RemoveLongString {
    public static ArrayList<String >keepLongString(ArrayList<String>list,int n){
        list.removeIf(each->each.length()<n);
        return list;
    }
}
