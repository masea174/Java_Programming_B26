package day25_recap;

import java.util.Scanner;

public class MiddleReverse {
    public static void main(String[] args) {


    Scanner s=new Scanner(System.in);
        System.out.println("enter the 3 words");
        String str=s.nextLine().trim();
        int firstSpase=str.indexOf(" ");
        int lastSpace=str.indexOf(" ",firstSpase+1);
        String middle=str.substring(firstSpase+1,lastSpace);
        String newMiddle="";
        for (int i = 0; i < middle.length(); i++) {
            newMiddle=middle.charAt(i)+newMiddle;
        }
        System.out.println(str.replace(middle,newMiddle));
}}
