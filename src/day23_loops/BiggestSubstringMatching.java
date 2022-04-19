package day23_loops;

public class BiggestSubstringMatching {
    public static void main(String[] args) {
        /*
        Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee Output: ccccc
         */
        String mess="aaaabbbbbshshhshhshshhhhhhhhhhhh";
        int length=1;
        int longer=0;
        int longerIndex=0;
        for(int index=0;index< mess.length()-1;index++){
            if(mess.charAt(index)==mess.charAt(index+1)){
                length+=1;
                if (longer<length){
                    longer=length;
                   longerIndex =index+2;
                }

                }else {
                length=1;
            }

        }
        System.out.println("longer = " + longer);
        System.out.println(mess.substring((longerIndex-longer),(longerIndex)));
    }
}
