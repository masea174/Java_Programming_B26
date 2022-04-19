package day24_loops;

public class CountChars {
    public static void main(String[] args) {
        String s="To5day i2s0 a Very N9Beautiful DAy  ";
        int upper=0;String upperLetter="";
        int lower = 0;String lowerLettr="";
        int num = 0;String numbers="";

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter <= 'Z' && letter >= 'A') {
                upper++;upperLetter+=letter+" ";
            }
            if (letter <= 'z' && letter >= 'a') {
                lower++;lowerLettr+=letter+" ";
            }
            if (letter <= '9' && letter >= '0') {
                num++;numbers+=letter+" ";
            }

        }
        System.out.println(numbers+" num = " + num);
        System.out.println(lowerLettr+" lower = " + lower);
        System.out.println(upperLetter+ " upper = " + upper);
    }
}
