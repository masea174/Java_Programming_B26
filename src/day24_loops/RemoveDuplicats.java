package day24_loops;

public class RemoveDuplicats {
    public static void main(String[] args) {
     String s="abcabc";
     String uniq="";
        for (int i = 0; i < s.length(); i++) {
            if (!(uniq.contains(""+s.charAt(i)))){
                uniq+=  s.charAt(i);
            }

        }
        System.out.println(uniq);
    }
}
