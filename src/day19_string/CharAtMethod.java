package day19_string;

public class CharAtMethod {
    public static void main(String[] args) {
        String s="java";
//                0123
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
       // System.out.println(s.charAt(4));//i cannot use it no 4-th index number

        int lastIndex=s.length()-1;

        System.out.println( "last charcter :"+s.charAt(lastIndex));//same as line11 but more dynamic);

        int secondToLastIndex=s.length()-2;
        char secondToLastChar=s.charAt(secondToLastIndex);//same as line10
        System.out.println( "second to last character:"+secondToLastChar);


    }
}
