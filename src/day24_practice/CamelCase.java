package day24_practice;

import java.util.Locale;

public class CamelCase {
    /*
    Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday

     */
    public static void main(String[] args) {
        String s="What a beautiful Day IS TODAY";
        s=s.toLowerCase();
        String newS="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                s=s.replaceFirst(" "+s.charAt(i+1),(""+s.charAt(i+1)).toUpperCase());
            }
            newS+=""+s.charAt(i);
            }
        System.out.println(newS);
        }
    }
