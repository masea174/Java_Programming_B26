package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your first name");
        String first=input.next().toLowerCase();
        System.out.println("enter your last name");
        String last=input.next().toLowerCase();
        String id=first.substring(0,1);
        id+=(""+last.charAt(0)).toUpperCase()+last.substring(1,3)+first.length()*2;
        System.out.println(id);

    }
}
