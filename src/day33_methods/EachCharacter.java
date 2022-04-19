package day33_methods;

public class EachCharacter {
    /*
create a method that accepts a String and print each character of the
String on a seperate line
____________________________

     */public static void eachCharacter(String str){
         char []arr=str.toCharArray();
         for(char each:arr){
             System.out.println(each);
         }
    }

    public static void main(String[] args) {
        eachCharacter("hello world");
    }
}
