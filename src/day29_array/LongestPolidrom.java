package day29_array;

public class LongestPolidrom {
    /*
    [IQ] Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
Ex:
Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
     */
    public static void main(String[] args) {
        String [] arr={"java", "longer word", "civic","apple", "racecar", "mom", "anna"};
        String longest="";
        for(String each:arr){
            String reversed="";
            for (int i = each.length()-1; i >=0; i--) {
                reversed+=each.charAt(i);
            }
            if (reversed.equals(each)){
                if(longest.length()<each.length()){
                    longest=each;
                }
            }
        }
        System.out.println(longest.isEmpty()?"No polidroms in range":longest);
        }
    }

