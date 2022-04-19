package day24_loops;

public class BiggestContinueString {
    public static void main(String[] args) {
        String mess="aaabbbccddeeeeeeeee";
        String sub="";
        String biggest="";

        for (int i = 0; i < mess.length()-1; i++) {
            sub+=mess.charAt(i);
            if (mess.charAt(i)!=mess.charAt(i+1)) {

                if (sub.length() > biggest.length()) {
                    biggest = sub;
                }
                sub = "";}
        } System.out.println(biggest);
    }}
/*
go thru each character in the loop look for each substring that is a repeating char, compare it to the next character
 */