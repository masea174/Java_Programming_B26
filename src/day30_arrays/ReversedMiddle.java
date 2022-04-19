package day30_arrays;

import java.util.Scanner;

public class ReversedMiddle {
   /* Have a sentence w 3 words
    reverse the middle only

    */
   public static void main(String[] args) {
       String s = "java always fun";
       String[] sent = s.split(" ");
       String reversed = "";
       char[] middleWord = sent[1].toCharArray();
       for (int i = middleWord.length-1; i >= 0; i--) {
           reversed += middleWord[i];
       }
       System.out.println(s.replace("always",reversed));
       System.out.println(sent[0]+" "+reversed+" "+sent[2]);
   }
}
