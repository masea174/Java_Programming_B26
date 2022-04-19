package day18_string;

public class RemoveSpace {
    public static void main(String[] args) {

        String s="   Saturday   ";
        System.out.println(s);
        System.out.println(s.length());
        s=s.trim();
        System.out.println(s);
        System.out.println(s.length());

        String str= "   Java is fun   ";
        System.out.println(str.startsWith("Java"));
        System.out.println(str.trim());
        str=str.trim();
        System.out.println(str.startsWith("Java"));



    }
}
