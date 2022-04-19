package day18_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str="last example";
        System.out.println(str.isEmpty());//false

        str="";//empty space no characters
        System.out.println(str.isEmpty());//true

        String s=" ";
        System.out.println("s is empty:"+s.isEmpty());//false spase is a character

if (s.length()==0 )
    System.out.println("empty");
    System.out.println("s is blank:"+s.isBlank());



    }
}
