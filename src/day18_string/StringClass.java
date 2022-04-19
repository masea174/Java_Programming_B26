package day18_string;

public class StringClass {
    public static void main(String[] args) {
        String s="pen";
String s2=new String("pen");
        System.out.println("Compare with ==: "+(s==s2));
        System.out.println("Compare with .equals ():"+(s.equals(s2)));
        System.out.println("Compare with .equals(\"Pen\")" +s.equals("Pen"));
        System.out.println("Comapre with equalsIgnoreCase:"+s.equalsIgnoreCase("Pen"));

        int len=s.length();
        System.out.println("lenght ="+len);

        if (s.length()>4){
            System.out.println("long word");
        }else{
            System.out.println("short word");
        }
        System.out.println(("aaaa").length());//4
        System.out.println(("aa aa").length());//5spase is a character too
    }
}
