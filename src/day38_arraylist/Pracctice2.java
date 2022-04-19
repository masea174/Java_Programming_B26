package day38_arraylist;

import java.util.ArrayList;

public class Pracctice2 {
    /*
    Practice flow:

Create an ArrayList of Strings
add these elements:
	Iron Man, Spider Man, Thor, Captain America, Hawkeye

	remove Thor by index

	remove Iron Man by element

	remove the first index

Print the ArrayList after each action to see how the change is made

     */
    public static void main(String[] args) {
        ArrayList <String> heros=new ArrayList<>();
        heros.add("Iron Man");
        heros.add("Spider Man");
        heros.add("Thor");
        heros.add("Capitan America");
        heros.add("Hawkeye");
        System.out.println(heros);
        heros.remove(2);
        System.out.println(heros);
        heros.remove("Iron Man");
        System.out.println(heros);
        heros.remove(1);
        System.out.println(heros);
    }
}
