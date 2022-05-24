package day60_collections;

public class SameLetter {
    public static void main(String[] args) {
        System.out.println(sameLetter("abc","cab"));
        System.out.println(sameLetter("abc","abb"));
    }
    /*
    Write a return method that check if a string is build out of the same
letters as another string.
Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
     */
    public static boolean sameLetter(String a, String b){
       boolean isSameLetter=false;
        for (int i = 0; i < a.length(); i++) {
            if(b.contains(""+a.charAt(i))){
                isSameLetter=true;
            }else {
                return false;
            }
        }return isSameLetter;

    }
}
