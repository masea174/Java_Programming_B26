package day19_string;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class MergeString {
    public static void main(String[] args) {
        /*
        2 Strings ,hard code  3 caract
        merge the strings
         */
        String word1 = "abc";
        String word2 = "XYZ";
        String merge = "";
        System.out.println("" + word1.charAt(0) + word2.charAt(0) + word1.charAt(1) + word2.charAt(1) + word1.charAt(2) + word2.charAt(2));
        merge += word1.charAt(0);
        merge += word2.charAt(0);
        merge += word1.charAt(1);
        merge += word2.charAt(1);
        merge += word1.charAt(2);
        merge += word2.charAt(2);

        System.out.println(merge);
    }
}
