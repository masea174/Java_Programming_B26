package day23_loops;

public class Anogram {
    /*
    Given two Strings determine if they are anagram or not. Strings are anagram if they are built up of the same characters
Ex:
     */
    public static void main(String[] args) {
        String word1 = "anna";
        String word2 = "nana";
        boolean isCorrect = true;
        for (int i = 0; i < word1.length(); i++) {
            if (word2.contains("" + word1.charAt(i))) {
                isCorrect &= true;
            } else {
                isCorrect &= false;
            }
        }
        System.out.println("are the words anagrams : " + isCorrect);

    }
}
