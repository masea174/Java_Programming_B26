package day23_loops;

public class CountWords {
    /*
    Count Words
Given a sentence determine how many words are in the String.
Ex:
Input:
This has multiple words
Output:
4
     */
    public static void main(String[] args) {
        String message="this is a message long";
        int count=1;
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                count+=1;
            }
        }
        System.out.println("\"" +message+ "\" is build from "+count+ " words");
    }
}
