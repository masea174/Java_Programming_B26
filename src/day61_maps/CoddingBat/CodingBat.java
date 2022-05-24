package day61_maps.CoddingBat;

import java.util.*;

public class CodingBat {
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            if (!map.get("a").isEmpty()) {
                map.put("b", map.get("a"));
            }
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;

    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread","butter");
        if(map.containsKey("icecream")) {
            map.put("iceream", "cherry");
        }




            return map;
    }
    public Map<String, String> topping2(Map<String, String> map){

        if(map.containsKey("ice cream")){
            if(!map.get("ice cream").isEmpty()){
                map.put("yogurt",map.get("ice cream"));
            }
        }if (map.containsKey("spinach")){
            if(!map.get("spinach").isEmpty()){
                map.put("spinach","nuts");
            }
        }return map;

    }

    public Map<String, String> topping3(Map<String, String> map){
if (map.containsKey("potato")){
    if(!map.get("potato").isEmpty()){
        map.put("fries",map.get("potato"));
    }
}
if (map.containsKey("salad")){
    if(!map.get("salad").isEmpty()){
        map.put("spinach",map.get("salad"));
    }
}return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a")&&map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
        return  map;
    }
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if(!(map.containsKey("a")&&map.containsKey("b"))){
            if(map.containsKey("a")){
                map.put("b",map.get("a"));
            }else{
                map.put("a",map.get("b"));
            }
        }
        return map;
    }

    public static void main(String[] args) {
//        Map map=new HashMap();
//        map.put("a","aaa");
//        System.out.println(mapAB3(map));
String [] s={"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(wordAppend(s));
    }
    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("a")&&map.containsKey("b")){
            if(map.get("a").length()==map.get("b").length()){
                map.put("a","");
                map.put("b","");
            }else if(map.get("a").length()<map.get("b").length()){
                map.put("c",map.get("b"));
            } else {
                map.put("c",map.get("a"));

            }
        }
        return map;
    }
//    Map-2 > wordAppend
//    prev  |  next  |  chance
//    Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
//
//
//    wordAppend(["a", "b", "a"]) → "a"
//    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
//    wordAppend(["a", "", "a"]) → "a"
public static String wordAppend(String[] strings) {
    String word = "";

    for (int i = 0; i <strings.length ; i++) {
        int frequency = Collections.frequency(Arrays.asList(strings), strings[i]);
        if(!word.contains(strings[i])) {
            if (frequency % 2 >= 0) {
                while (frequency > 1) {
                    word += strings[i];
                    frequency -= 2;
                }
            }
        }

    }return word;
}  public boolean scoresClump(int[] scores) {
        boolean clump=true;
        Arrays.sort(scores);
        for (int i = scores.length-1; i > 0; i++) {
            if (scores[i]-scores[i+2]>2){
                return false;
            }

        }
        return clump;
    }
    public Map<String, Integer> word0(String[] strings) {
        Map <String,Integer>list =new HashMap<>();
        for (int i = 0; i <strings.length ; i++) {
           list.put(strings[i],0);
        }
        return list;
    }
    public Map<String, Integer> wordLen(String[] strings) {
        Map <String,Integer> map=new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i],strings[i].length());

        }return map;
    }
    public Map<String, String> pairs(String[] strings) {
        Map <String,String> map=new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].substring(0,1),strings[i].substring(strings[i].length()-1));

        }return map;
    }
    public Map<String, Integer> wordCount(String[] strings) {
        Map <String,Integer> map=new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if(!map.containsKey(strings[i])){
                map.put(strings[i],Collections.frequency(Arrays.asList(strings),strings[i]));
            }

        }return map;

    }
    public Map<String, String> firstChar(String[] strings) {
        Map<String,String>map=new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String value="";
            for (int j = 0; j < strings.length; j++) {
                if(strings[j].startsWith(strings[i].substring(0,1))){
                    value+=strings[j];
                }

            }

        }
    }
}