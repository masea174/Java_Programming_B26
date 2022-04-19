package day30_arrays;

public class ReverseEachWord {
    /*
    everse Each word

Given a String, reverse each individual word and print the result
Hint: Use a nested loop, split

Input:
It started to snow in Chicago
Output:
tI detrats ot wons ni ogacihC

     */
    public static void main(String[] args) {
        String s="It started to snow in Chicago";
        String[] str=s.split(" ");
        String reversed="";
        for(String each:str){
            for (int j = each.length()-1; j >=0; j--) {
                reversed+=each.charAt(j);
            }reversed+=" ";

        }
        System.out.println(reversed);
    }
}
