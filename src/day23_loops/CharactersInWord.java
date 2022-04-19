package day23_loops;

public class CharactersInWord {
    /*
    Characters in String
Given a String print the ascii value codes for each character
Ex:
Input:
“java” Output:
106 97 118 97
     */
    public static void main(String[] args) {
        String word="java";
        String aSCII="";
        for(int index=0;index<word.length();index++){
            aSCII+=(int)word.charAt(index)+" ";
        }
        System.out.println(aSCII);


        }
    }
