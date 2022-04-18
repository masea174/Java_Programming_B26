package day41_arraylist;

import java.util.ArrayList;

public class RemoveCountries {

    public static ArrayList<String> removeCountries(ArrayList<String> list) {
        list.removeAll(country->country.length()>7);;
        return list;
    }
}
