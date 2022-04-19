package day19_string;

import java.util.Scanner;

public class MoveTheFirst {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
        System.out.println("enter the phraze");
        String praze= input.nextLine().trim();
        int space=praze.indexOf(" ");
        System.out.println(praze.substring(space)+" "+praze.substring(0,space));
}}
