package day61_maps;

import java.util.*;

public class AllMApObjects {
    public static void main(String[] args) {
        Map<String,String> map1=new LinkedHashMap<>();

        map1.put("class","java");
        map1.put("hello","world");
        map1.put("soft skills","Nadir");
        map1.put("james" ,"bond");
        map1.put("username","password");
        map1.put("aysun","ui testing");
        map1.put(null,"nothing");

        System.out.println(map1);

        Map<String,String> map2=new HashMap<>();

        map2.put("class","java");
        map2.put("hello","world");
        map2.put("soft skills","Nadir");
        map2.put("james" ,"bond");
        map2.put("username","password");
        map2.put("aysun","ui testing");
        map2.put(null,"nothing");

        System.out.println(map2);

        Map<String,String> map3=new TreeMap<>();

        map3.put("class","java");
        map3.put("hello","world");
        map3.put("soft skills","Nadir");
        map3.put("james" ,"bond");
        map3.put("username","password");
        map3.put("aysun","ui testing");
      //  map3.put(null,"nothing");

        System.out.println(map3);

        Map<String,String> map4=new Hashtable<>();

        map4.put("class","java");
        map4.put("hello","world");
        map4.put("soft skills","Nadir");
        map4.put("james" ,"bond");
        map4.put("username","password");
        map4.put("aysun","ui testing");
       // map4.put(null,"nothing");

        System.out.println(map4);
    }
}
