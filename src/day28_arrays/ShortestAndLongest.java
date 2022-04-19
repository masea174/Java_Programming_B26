package day28_arrays;

public class ShortestAndLongest {
    /*
    Shortest and Longest words from String array
• Write a program that can return the shortest string element from a String array
• Write a program that can return the longest string element from a String array
     */
    public static void main(String[] args) {
        String[] elements = {"pineapple", "cat", "salad", "fish" };
        String shortest = elements[0];
        String longest = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i].length() < shortest.length()) {
                shortest = elements[i];
            }
            if (elements[i].length() > longest.length()) {
                longest = elements[i];
            }
        }
        System.out.println("longest = " + longest);
        System.out.println("shortest = " + shortest);
    }
}
