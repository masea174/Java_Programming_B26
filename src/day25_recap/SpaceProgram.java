package day25_recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
        System.out.println("enter the sentence");
        String  str=s.nextLine().trim()  ;
        String fixed="";
        for (int i=0;i<str.length();i++){
        if(str.charAt(i) ==' '){
            fixed+="_ ";
        }else {
            fixed+=str.charAt(i)+" ";
        }
        }
        System.out.println(fixed.trim());
}}
