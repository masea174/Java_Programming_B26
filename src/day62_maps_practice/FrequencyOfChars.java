package day62_maps_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {
        frequencyOfCharacter("apple");
        frequencyOfCharacter("banana");
        frequencyOfCharacter("brochura");
        frequencyOfCharacter("ananas");
    }
    //given a string count how many times each caracter is in the string
    public static void frequencyOfCharacter(String str){

        Map <Character,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char charact=str.charAt(i);
            if(map.containsKey(charact)){
                map.put(str.charAt(i),map.get(charact)+1);
            }else
            map.put(charact,1);

        }
        System.out.println(map);


    }

}
