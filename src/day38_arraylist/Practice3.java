package day38_arraylist;

import java.util.ArrayList;

public class Practice3 {
    /*
    Create an ArrayList of Characters
Fill the ArrayList with letters from A-Z
Print the ArrayList of all the characters
     */
    public static void main(String[] args) {
        ArrayList <Character> alfabet=new ArrayList<>();
        for (char i = 'A'; i <='Z'; i++) {
            alfabet.add(i);
        }
        System.out.println(alfabet);
        ArrayList<Character> alf=new ArrayList<>();
        for (char i = 'a'; i <='z' ; i++) {
        alf.add(i);
        }
        System.out.println(alf);
        alf.remove(0);
        alf.remove(3);
        alf.remove(6);
        alf.remove(11);
        alf.remove(16);


        System.out.println(alf);
    }
}
