package day20_strings;

import java.util.Scanner;

public class SwitchCharacters {
    /*
    [ Replace program] Will do this later when we learn replace method
Given a String message with some text and a number (1-3) replace certain characters from the String message.
When the number is:
1: replace 'a' with 'e' 2: replace 's' with 'r' 3: replace 'o' with 'z'
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("introduce your text here:");
        String mess=s.nextLine();
        int n=2;
        if (n==1){
            mess=mess.replace('a','e');
        }else if(n==2){
            mess=mess.replace('s','r');
        }else if(n==3){
            mess=mess.replace('o','z');
        }
        System.out.println(mess);
    }
}
