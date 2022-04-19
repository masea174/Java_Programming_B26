package day19_string;

import java.util.Scanner;

public class Urlexample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the url:");
        String web=input.next();

        System.out.println(web.substring(4,web.length()-4));

    }
}
