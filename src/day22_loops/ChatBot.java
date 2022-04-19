package day22_loops;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean keepTalking= true;
        while(keepTalking){
            System.out.println("enter a message");
            String msg=input.nextLine();
            switch (msg){
                case"hello":
                    System.out.println("hi");
                    break;
                case "how are you":
                    System.out.println("I am good");
                    break;
                case"bye":
                    System.out.println("Bye");
                    keepTalking=false;
                    break;
                default:
                    System.out.println("I dont know what you said");
            }
        }
    }

}
