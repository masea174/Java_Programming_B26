package day23_loops;

public class CharacterCheck {
    public static void main(String[] args) {

    String str="aaaahiahhihibbcchi hi hello";
    int count =0;
    for (int index=0;index< str.length()-1;index++){

        if (str.charAt(index)=='h'&& str.charAt(index+1)=='i'){
            count+=1;
        }
    }
        System.out.println(count+" times you can see hi in the text");
}}
