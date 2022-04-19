package day26_nested_loops;

public class DublicateCharacters {
    /*
     Duplicate characters

Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		ACE

	-> the characters A C and E are found in the String multiple times so they are duplicates

     */
    public static void main(String[] args) {
        String s="AASSNNOHSKKK";
        String dS="";
        for (int i = 0; i <s.length(); i++) {
            int count=0;
            char character=s.charAt(i);       //built a variable for character that is being checked

            for (int j = 0; j < s.length(); j++) {     //we are going to check every character in my string
                char cheking=s.charAt(j);       //built a variable that will hold my checking character
                if(character==cheking){             //if the character from outer loop have the same value as the character from inner loop the count variable will incriment
                    count++;
                }
            }if(count>1){                                 //by the task condition we are looking for duplicats , that means that my count has to be more than1
                if(!(dS.contains( ""+character))){      // to avoid the double printing of the same characters, i created a new variable that will get a new character only if my string doens have it
                dS+=character;
            }}

        }
        System.out.println("the duplicats are : "+dS); //printing my results
    }
}
