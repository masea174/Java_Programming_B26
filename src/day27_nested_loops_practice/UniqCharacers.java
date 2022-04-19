package day27_nested_loops_practice;

public class UniqCharacers {
    public static void main(String[] args) {
        String str="AABCCDEEF";
        String uniq="";
        for (int i = 0; i < str.length(); i++) {
            char letter=str.charAt(i);
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                char checked =str.charAt(j);
                if (letter==checked){
                    count++;
                }
            }if (count<2){
                uniq+=letter;
            }
        }
        System.out.println(uniq);
    }
}
