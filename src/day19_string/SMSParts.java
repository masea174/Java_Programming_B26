package day19_string;

public class SMSParts {
    /*
    Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
Separate these parts and print them separately: Sender: actualSender
Number: actualNumber Message: actualMessage”
     */
    public static void main(String[] args) {
      String message="Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        System.out.println("Sender: "+message.substring(message.indexOf("J"),message.indexOf(">")));
        System.out.println("Number: "+message.substring(message.indexOf("[")+1,message.indexOf("]")));
        System.out.println("Message: "+message.substring(message.indexOf("{")+1,message.indexOf("}")));
}}
