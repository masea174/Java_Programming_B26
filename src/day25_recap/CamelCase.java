package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your sentence");
        String str=s.nextLine().toLowerCase();
        String camelCase=str.substring(0,1);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1)==' '){
                camelCase+=(""+str.charAt(i)).toUpperCase();

            }else {
                camelCase+=str.charAt(i);
            }

        }camelCase=camelCase.replace(" ","");
        System.out.println(camelCase);
    }
}
