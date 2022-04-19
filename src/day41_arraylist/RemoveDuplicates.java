package day41_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeCountries(ArrayList<Integer> list) {
        list.removeIf(num-> Collections.frequency(list,num)>1);;
        return list;
    }
}
