package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the message:" );
        String phraze=input.nextLine();
        phraze=phraze.toLowerCase();
        phraze=phraze.trim();
        if (phraze.contains("java is bad")||phraze.contains("quit")||phraze.contains("have fun")||phraze.contains("crying")){
            System.out.println("message failed to send");
        }else System.out.println("message sent:" +phraze);
    }
}
