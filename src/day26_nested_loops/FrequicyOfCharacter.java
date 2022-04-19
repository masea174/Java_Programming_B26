package day26_nested_loops;

public class FrequicyOfCharacter {
    /*
    String s=apple ;
    count how many times each letter is in the string
    what we eill try to do
    check one character at the time
    charAt(0)-->a
    appple
    a==a
    a==p
    a==p
    a==l
    a==e
    getting the counting logic when the argument is true

    charAt(1)
    apple
    p==a
    p==p
    p==p
    p==l
    p==e
     */
    public static void main(String[] args) {
        
    
    String s="appleeee";
    String checked="";
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            char letter=s.charAt(i);
            if (checked.contains(""+letter))
                continue;
            for (int j = 0; j < s.length(); j++) {
                char eatchletter=s.charAt(j);
                if (letter==eatchletter){
                   count ++;
                }
            }
            System.out.println("letter \""+letter+"\" is met "+count+" times");
            checked+=letter;
        }

}}
/*

    String s="appleeee";
    String checked="";
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            char letter=s.charAt(i);
            if (!(checked.contains(""+letter)))      //does the same thing as the above code but doesnt have contine so it will run the second loop only the new variable doesnt contain the caracter

            for (int j = 0; j < s.length(); j++) {
                char eatchletter=s.charAt(j);
                if (letter==eatchletter){
                   count ++;
                }
            }
            System.out.println("letter \""+letter+"\" is met "+count+" times");
            checked+=letter;
        }

}}
 */