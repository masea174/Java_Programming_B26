package day20_strings;

import java.util.Scanner;

public class SMSParts {
    public static void main(String[] args) {
        /*
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
Separate these parts and print them separately: Sender: actualSender
Number: actualNumber Message: actualMessage”

         */
        String message= "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        int senderStart=message.indexOf("<");
        int senderEnd=message.indexOf(">");
        int numberStart=message.indexOf("[");
        int numberEnd=message.indexOf("]");
        int messStart=message.indexOf("{");
        int messEnd=message.indexOf("}");
        System.out.println("sender: "+message.substring(senderStart+1,senderEnd));
        System.out.println("Number: "+message.substring(numberStart+1,numberEnd));
        System.out.println("Message: "+message.substring(messStart+1,messEnd));


    }
}
