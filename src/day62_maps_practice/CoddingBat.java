package day62_maps_practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class CoddingBat {
    /*
    Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
     */
//
    public Map<String, String> firstChar(String[] strings) {
//
        Map<String, String> map = new LinkedHashMap<>();
        for (String each : strings) {
            if (map.containsKey(each.substring(0, 1))) {
                map.put(each.substring(0, 1), map.get(each.substring(0, 1)) + each);
            } else {
                map.put(each.substring(0, 1), each);
            }
        }
        return map;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new LinkedHashMap<>();
        for (String each : strings) {
            if (map.containsKey(each)) {
                map.put(each, true);
            } else {
                map.put(each, false);
            }
        }
        return map;

//
//


//    }public String[] allSwap(String[] strings) {
//        Map <String,Integer> map=new LinkedHashMap<>();
//        for (int i = 0; i < strings.length; i++) {
//
//        }
//    }
}}