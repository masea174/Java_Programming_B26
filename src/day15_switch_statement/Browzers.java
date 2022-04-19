package day15_switch_statement;

import java.util.Scanner;
import java.util.SortedMap;

public class Browzers {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter the browser name :");
       String browser=input.nextLine();
        System.out.println("enter the url:");
       String url= input.nextLine();

       switch (browser){
           case "chrome":
           case "Chrome":
               System.out.println("Opening "+url+" in chrome browser");
               System.out.println("Loading....");
               break;
           case "Safari":
           case "safari":
               System.out.println("Opening "+url+" in safari");
               System.out.println("Loading...");
               break;
           case "Firefox":
           case "firefox":
               System.out.println("Opening "+url+" in Firefox");
               System.out.println("Loading...");
               break;
           default:
               System.out.println(browser+" is not a valid browser");
       }
    }
}
