package day23_loops;

public class ReverseString {
    public static void main(String[] args) {
        String s="reversed";
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }}}
