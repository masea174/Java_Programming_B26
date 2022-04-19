package day18_string;

public class StartAndEnds {
    public static void main(String[] args) {
        String str = "Apples";
        System.out.println(str);
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));
        System.out.println(str.startsWith("Apples"));

        String s = "A";

        System.out.println(str.startsWith(s));
        s = "App";
        System.out.println(str.startsWith(s));

        System.out.println(str.startsWith(" App"));
        System.out.println(str.startsWith("Aoo"));//false its checking for all the characters not only first letters
        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a"));

        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("good"));
        System.out.println(sentence.endsWith("today was a good day"));

    }
}
