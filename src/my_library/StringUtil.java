package my_library;

import jdk.jfr.Frequency;

import java.util.Locale;

public class StringUtil {
    public static String reverseString(String str){
        String reverse="";
        for (int i =str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }return reverse;
    }
    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James

     */
    public static String fixFormat(String s){
        s=s.trim().toLowerCase();
       return s.substring(0,1).toUpperCase()+s.substring(1);

    }
    /*
    Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase


     */
    public static String camelCase(String s){
        s=s.toLowerCase().trim();
        String camel="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                i++;
               camel+= (""+s.charAt(i)).toUpperCase();
            }else{
            camel+=s.charAt(i);
        }}
        return camel;
}
   /*
    Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word

     */
    public static int frequencyOfCharacter(String s, char c){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c){
                count++;
            }

        }return count;

    }
    /*
    Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work

Ex:
	Input:
		aaaaabcccdeeff

	Output:
		bd
     */

 public static String uniqueCharacters(String a){

     String uniq="";
     String checked="";
     for (int i = 0; i < a.length(); i++) {
         int count =0;
         if(!(checked.contains(""+a.charAt(i)))){
         for (int j = 0; j < a.length(); j++) {
             if (a.charAt(i)==a.charAt(j)){
                 count++;
             }checked+=a.charAt(i);
         }if(count<2){
             uniq+=a.charAt(i);
         }}
     }return uniq;
    }
    /*
    Duplicate Characters

create a method that will accept a word(String) and return a String with all the duplicate characters. A character is duplicate if it only appears in the String multiple times

Hint: use your frequency method to do some of the work

Ex:
	Input:
		aaaaabcccdeeff

	Output:
		acef

     */
    public static String duplicateCharacters(String s){
        String duplicate="";
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }if (count>1 &&  (!duplicate.contains(""+s.charAt(i)))){
                duplicate+=s.charAt(i);
            }

        }return duplicate;
    }
}
