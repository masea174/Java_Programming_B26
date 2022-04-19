package day17_string_introduction;

public class StringMethods
{
    public static void main(String[] args) {
        String name="james";

        System.out.println(name.equals("james"));
        System.out.println("cat".equals("dog"));

        System.out.println(name.equals("James"));

        System.out.println(name.equalsIgnoreCase("James"));
        String a=new String("hello");
        String b=new String("hello");
        System.out.println(a.equals(b));

        System.out.println(a.equals("hello"));
        System.out.println(name.length());
        String last ="today was fun";
        System.out.println(last.length());
        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));

        String name1=name.substring(0,2);
        System.out.println(name1.repeat(2));
    }
}
