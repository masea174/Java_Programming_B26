package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class WebSite {
    /*
    ask user to enter the website :
    check if its valid :
    starts with www. and ends with .com;
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the web site:");
        String web=input.nextLine();
        web=web.toLowerCase();
boolean validStart=web.startsWith("www.");
boolean validEnd=web.endsWith(".com") || web.endsWith(".edu") || web.endsWith(".gov") || web.endsWith(".net");
        if (web.startsWith("www.")) {
            if (validEnd) {
                System.out.println("Loading :" + web);
            } else {
                System.out.println("Needs to end with .com or .edu or .gov or .net for a valid url");
            }
        }else{
            System.out.println("url has to start with www.");
        }
        if( validStart&&validEnd){
            System.out.println("Loading :"+web);
        }else{
            if(!validEnd){
                System.out.println("not a valid url Needs to end with .com or .edu or .gov or .net for a valid url");
            }else {
                System.out.println("need to start with www.");
            }
        }
    }}
