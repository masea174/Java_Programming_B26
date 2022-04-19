package day23_loops;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        /*
        adjust and check not for only a but any characters

         */

        int a=0;
        char check='e';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==check){
                a+=1;
            }
        }
        System.out.println(check +" is present "+a+" times ");

    }

}
