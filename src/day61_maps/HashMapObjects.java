package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjects {
    public static void main(String[] args) {

        Map <Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(10,"ten");

        System.out.println(map);// hashMap is random , not in inseryio  order
        System.out.println(map.get(10));

        String value=map.get(5);
        map.remove(1);
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("two"));

        map.put(null,null);
        map.put(null,"Hello World");
        map.put(3,"march");
        System.out.println(map);

        map.put(7,"march");
        System.out.println(map);


    }
}
